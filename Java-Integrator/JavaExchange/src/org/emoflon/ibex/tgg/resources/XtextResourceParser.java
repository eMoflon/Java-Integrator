package org.emoflon.ibex.tgg.resources;

import com.google.inject.Injector;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.simplejava.SimpleJavaStandaloneSetup;

/**
 * The XtextResourceParser offers static methods to retrieve a Resource from a
 * .simplejava file and vice versa.
 *
 */
public class XtextResourceParser {

	private final static Injector injector = new SimpleJavaStandaloneSetup().createInjectorAndDoEMFRegistration();

	/**
	 * This static method takes a path to a .simplejava file and returns a Resource
	 * object.
	 * 
	 * @param filePath The path to the .simplejava file.
	 * @return The Resource to the given file.
	 */
	public static Resource toResource(String filePath) {

		URI fileURI = URI.createFileURI(filePath);
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		Resource resource = resourceSet.getResource(fileURI, true);

		return resource;
	}

	/**
	 * This static method re-parses a Resource to a .simplejava file.
	 * 
	 * @param resource The resource that should be re-parsed into a .simplejava
	 *                 file.
	 * @param path     The location the .simplejava file should be saved to.
	 */
	public static void toSimpleJ(Resource resource, String path) {

		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		EcoreUtil.resolveAll(resource);

		URI newURI = URI.createFileURI(path);
		Resource newResource = resourceSet.createResource(newURI);

		newResource.getContents().add(resource.getContents().get(0));

		try {
			newResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}