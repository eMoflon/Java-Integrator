package javaexchangeplugin.util;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.emoflon.ibex.tgg.resources.ResourceContainer;
import org.emoflon.ibex.tgg.resources.XtextResourceParser;
import org.emoflon.ibex.tgg.run.javaexchange.CC_App;

public class ModelSaver {

	/**
	 * Takes the .simplej files of the two open text editor pages and parses them
	 * into resources.
	 * 
	 * @return The editor files as resources.
	 */
	private Resource[] getEditorResources() {
		IEditorReference[] editors = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();

		Resource[] editorResources = new Resource[2];

		for (int i = 0; i < 2; i++) {
			IEditorPart editor = editors[i].getEditor(true);
			IEditorInput input = editor.getEditorInput();
			String path = ((IFileEditorInput) input).getFile().getFullPath().toString();
			if (!path.endsWith(".simplej")) {
				throw new IllegalArgumentException("Invalid file!");
			}
			Resource resource = XtextResourceParser.toResource(path.toString());
			editorResources[i] = resource;
		}
		return editorResources;
	}

	public boolean checkConsistency() throws IOException {
		Resource[] srcAndTrg = getEditorResources();
		CC_App cc = new CC_App(srcAndTrg);
		return cc.checkConsistency();
	}

	public void registerChanges() {
		ResourceContainer resources = ResourceContainer.getInstance();
		Resource[] newSrcAndTrg = getEditorResources();
		ResourceContainer.getInstance().setNewSource(newSrcAndTrg[0]);
		ResourceContainer.getInstance().setNewTarget(newSrcAndTrg[1]);
	}

	public void writeBack() {
		IEditorReference[] editors = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();

		Resource[] editorResources = new Resource[2];

		for (int i = 0; i < 2; i++) {
			IEditorPart editor = editors[i].getEditor(true);
			IEditorInput input = editor.getEditorInput();
			String path = ((IFileEditorInput) input).getFile().getFullPath().toString();
			if (!path.endsWith(".simplej")) {
				throw new IllegalArgumentException("Invalid file!");
			}
			if (i == 0)
				XtextResourceParser.toSimpleJ(ResourceContainer.getInstance().getSource(), path);
			else
				XtextResourceParser.toSimpleJ(ResourceContainer.getInstance().getTarget(), path);
		}
	}

}