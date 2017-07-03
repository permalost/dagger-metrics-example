
package com.ca.example.metricsdaggerexample;

import com.codahale.metrics.MetricRegistry;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

// Jersey binding of MetricRegistry
public class AppBinder extends AbstractBinder{
	
	@Override
	protected void configure()
	{
		bind(MetricRegistry.class).to(MetricRegistry.class);
	}

}
