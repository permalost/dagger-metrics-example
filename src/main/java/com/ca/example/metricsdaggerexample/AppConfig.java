
package com.ca.example.metricsdaggerexample;

import com.codahale.metrics.jersey2.InstrumentedResourceMethodApplicationListener;
import org.glassfish.jersey.server.ResourceConfig;


public class AppConfig extends ResourceConfig {
	
	public AppConfig()
	{
		// Tying Dagger injection into Jersey
		MetricsDaggerComponent comp = DaggerMetricsDaggerComponent.create();
		this.register(new InstrumentedResourceMethodApplicationListener(comp.getMetricsRegistry()));
	}

}
