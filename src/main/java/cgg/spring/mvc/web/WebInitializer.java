
package cgg.spring.mvc.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration

//@EnableWebMvc

@ComponentScan(basePackages = "cgg.spring.mvc")
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { AppConfig.class };
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] {"/" };
	}

	/*
	 * @Override public void onStartup(ServletContext servletContext) throws
	 * ServletException { super.onStartup(servletContext); }
	 */

}
