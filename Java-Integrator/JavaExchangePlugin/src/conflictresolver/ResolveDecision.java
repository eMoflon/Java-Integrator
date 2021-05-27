package conflictresolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleEntry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.AttributeConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.Conflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.DelPreserveAttrConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.modelchange.AttributeChange;
import org.xtext.simplejava.simpleJava.SimpleClass;
import org.xtext.simplejava.simpleJava.SimpleField;
import org.xtext.simplejava.simpleJava.SimpleMethod;
import org.xtext.simplejava.simpleJava.SimplePackage;
import org.xtext.simplejava.simpleJava.SimpleParam;

import conflictresolver.dialogs.TitleAreaDialogWithRadioButtons;
import language.DomainType;

public class ResolveDecision {

	TitleAreaDialogWithRadioButtons myDialog;

	public ResolveDecision(Conflict c) {
		createConflictDialog(c);
	}

	private void createConflictDialog(Conflict c) {

		if (c instanceof AttributeConflict) {
			handleAttrConflict((AttributeConflict) c);
		}

		if (c instanceof DelPreserveAttrConflict) {
			handleDelPresAttrConflict((DelPreserveAttrConflict) c);
		}

	}

	private void handleAttrConflict(AttributeConflict c) {

		AttributeChange srcChange = c.getSrcChange();
		AttributeChange trgChange = c.getTrgChange();

		EAttribute attr = srcChange.getAttribute();
		EObject element = srcChange.getElement();
		String elementName = getName(element);
		String parent = getParent(element);
		Object oldVal = srcChange.getOldValue();

		Object newValSrc = srcChange.getNewValue();
		Object newValTrg = trgChange.getNewValue();

		List<Entry<String, String>> buttonList = new ArrayList<>();

		buttonList.add(new SimpleEntry<String, String>("PreferSrc", oldVal + " -> " + newValSrc));
		buttonList.add(new SimpleEntry<String, String>("PreferTrg", oldVal + " -> " + newValTrg));

		String info = "The " + attr.getName() + " of " + elementName + oldVal + " in " + parent + " was changed in both files. ";

		String title = "Conflict detected";
		String body = info + "\nPlease choose which change should be adopted.";
		int msgType = IMessageProvider.INFORMATION;
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		myDialog = new TitleAreaDialogWithRadioButtons(shell, title, body, buttonList, msgType);

	}

	private void handleDelPresAttrConflict(DelPreserveAttrConflict c) {

		DomainType domain = c.getDomainToBePreserved();
		AttributeChange change = c.getAttributeChange();

		EAttribute attr = change.getAttribute();
		EObject element = change.getElement();
		String elementName = getName(element);
		String parent = getParent(element);
		Object oldVal = change.getOldValue();
		Object newVal = change.getNewValue();

		List<Entry<String, String>> buttonList = new ArrayList<>();

		String srcText = "Adopt attribute change: " + oldVal + " -> " + newVal;
		String trgText = "Delete " + elementName;

		if (domain == DomainType.TRG) {
			String tempText = srcText;
			srcText = trgText;
			trgText = tempText;
		}

		buttonList.add(new SimpleEntry<String, String>("PreferSrc", srcText));
		buttonList.add(new SimpleEntry<String, String>("PreferTrg", trgText));
//		buttonList.add(new SimpleEntry<String, String>("Preserve",
//				"Preserve " + elementName + " but delete other elements planned to be deleted"));

		String info = "The " + attr.getName() + " of " + elementName + oldVal + " in " + parent
				+ " was changed in one file while it was deleted in the other. ";

		String title = "Conflict detected";
		String body = info + "\nPlease choose which change should be adopted.";
		int msgType = IMessageProvider.INFORMATION;
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		myDialog = new TitleAreaDialogWithRadioButtons(shell, title, body, buttonList, msgType);

	}

	private String getName(EObject element) {

		if (element instanceof SimplePackage) {
			return "SimplePackage ";
		}

		if (element instanceof SimpleClass) {
			return "SimpleClass ";
		}

		if (element instanceof SimpleField) {
			return "SimpleField ";
		}

		if (element instanceof SimpleMethod) {
			return "SimpleMethod ";
		}

		if (element instanceof SimpleParam) {
			return "SimpleParameter ";
		}

		return "unspecified";
	}

	private String getParent(EObject element) {

		if (element instanceof SimplePackage)
			return "your project";

		EObject parent = element.eContainer();

		if (parent instanceof SimplePackage) {
			SimplePackage simplePack = (SimplePackage) parent;
			return "SimplePackage " + simplePack.getName();
		}

		if (parent instanceof SimpleClass) {
			SimpleClass simpleClass = (SimpleClass) parent;
			return "SimpleClass " + simpleClass.getName();
		}

		if (parent instanceof SimpleMethod) {
			SimpleMethod simpleMethod = (SimpleMethod) parent;
			return "SimpleMethod " + simpleMethod.getName();
		}

		return "";
	}

	public Decision getDecision() {
		int retVal = myDialog.open();
		switch (retVal) {
		case Window.OK:
			if (myDialog.getSelectedButton().equals("PreferSrc"))
				return Decision.PREFER_SRC;
			if (myDialog.getSelectedButton().equals("PreferTrg"))
				return Decision.PREFER_TRG;
			if (myDialog.getSelectedButton().equals("Preserve"))
				return Decision.PRESERVE;
			else
				return Decision.UNSPECIFIED;
		case Window.CANCEL:
			System.out.println("You clicked cancel.");
			return Decision.UNSPECIFIED;
		default:
			System.out.println("Unexpected closure of dialogue.");
			return Decision.UNSPECIFIED;
		}

	}

}