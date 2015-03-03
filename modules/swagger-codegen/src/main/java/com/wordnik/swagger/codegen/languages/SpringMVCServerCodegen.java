/**
 * 
 */
package com.wordnik.swagger.codegen.languages;

import com.wordnik.swagger.codegen.CodegenConfig;

/**
 * 
 * Spring MVC server code generator support
 * 
 * @author frascuchon@gmail.com
 *
 */
public class SpringMVCServerCodegen extends JaxRSServerCodegen implements
		CodegenConfig {

	public SpringMVCServerCodegen() {
		super();

		super.templateDir = "springMVC";
		super.outputFolder = "generated-code/springMVC";
	}

	@Override
	public String getName() {
		return "mvc";
	}

	@Override
	public String getHelp() {
		return "Generates a spring MVC Server application.";
	}

}
