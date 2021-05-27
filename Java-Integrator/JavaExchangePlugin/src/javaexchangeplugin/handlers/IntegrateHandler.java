package javaexchangeplugin.handlers;

import java.io.IOException;
import java.util.Optional;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.emoflon.delta.validation.InvalidDeltaException;
import org.emoflon.ibex.tgg.resources.ResourceContainer;
import org.emoflon.ibex.tgg.run.javaexchange.INTEGRATE_App;

import conflictresolver.UserConflictResolver;
import javaexchangeplugin.util.ModelSaver;

import org.eclipse.jface.dialogs.MessageDialog;

public class IntegrateHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ModelSaver modelSaver = new ModelSaver();
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		modelSaver.registerChanges();
		try {
			INTEGRATE_App integrate = new INTEGRATE_App(ResourceContainer.getInstance(),
					Optional.of(new UserConflictResolver()));
			integrate.doIntegrate(1);
			modelSaver.writeBack();
			MessageDialog.openInformation(window.getShell(), "Register Changes", "Integration complete.");
		} catch (IOException | InvalidDeltaException e) {
			e.printStackTrace();
		}
		return null;
	}
}