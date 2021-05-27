package javaexchangeplugin.handlers;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;

import javaexchangeplugin.util.ModelSaver;

import org.eclipse.jface.dialogs.MessageDialog;

public class SaveHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ModelSaver modelSaver = new ModelSaver();
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		try {
			boolean consistent;
			consistent = modelSaver.checkConsistency();
			MessageConsole myConsole = findConsole("Consistency Check");
			MessageConsoleStream out = myConsole.newMessageStream();
			if (consistent) {
//				MessageDialog.openInformation(window.getShell(), "Save Models",
//						"Your models are consistent and were saved.");	
				out.println("Your models are consistent and were saved.");
			} else {
//				MessageDialog.openInformation(window.getShell(), "Save Models",
//						"Your models are NOT consistent and were NOT saved.");
				out.println("Your models are inconsistent.");
			}
		} catch (IOException e) {
			MessageDialog.openInformation(window.getShell(), "Save Models", "Your models could not be saved.");
		}
			   
		return null;
	}
	
	private MessageConsole findConsole(String name) {
	      ConsolePlugin plugin = ConsolePlugin.getDefault();
	      IConsoleManager consoleManager = plugin.getConsoleManager();
	      IConsole[] existing = consoleManager.getConsoles();
	      for (int i = 0; i < existing.length; i++)
	         if (name.equals(existing[i].getName()))
	            return (MessageConsole) existing[i];
	      //no console found, so create a new one
	      MessageConsole myConsole = new MessageConsole(name, null);
	      consoleManager.addConsoles(new IConsole[]{myConsole});
	      return myConsole;
	   }
	
}