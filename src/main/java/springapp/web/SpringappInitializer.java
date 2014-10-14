package springapp.web;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Jeffrey Johnson on Oct-${year}.
 */
public class SpringappInitializer implements WebApplicationInitializer {
    /**
     * Configure the given {@link javax.servlet.ServletContext} with any servlets, filters, listeners
     * context-params and attributes necessary for initializing this web application. See
     * examples {@linkplain org.springframework.web.WebApplicationInitializer above}.
     *
     * @param servletContext the {@code ServletContext} to initialize
     * @throws javax.servlet.ServletException if any call against the given {@code ServletContext}
     *                                        throws a {@code ServletException}
     */
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic registration = servletContext.addServlet("springapp", new DispatcherServlet());


    }
}
