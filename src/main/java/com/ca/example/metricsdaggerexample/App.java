
package com.ca.example.metricsdaggerexample;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;


public class App {
	
	public static void main(String[] args) {
		
		Server server = new Server(8080);		
		ServletContextHandler contextHandler = new ServletContextHandler(server, "/*");
		
		ResourceConfig config = createConfig();
		ServletHolder servlet = new ServletHolder(new ServletContainer(config));
		contextHandler.addServlet(servlet, "/*");
				
        try
        {
            server.start();
            server.join();
        }
        catch (Throwable t)
        {
            t.printStackTrace(System.err);
        }
	}

	private static ResourceConfig createConfig()
	{
		ResourceConfig config = new AppConfig();
		config.packages("com.ca.example.metricsdaggerexample.resources");
		return config;
	}

}
