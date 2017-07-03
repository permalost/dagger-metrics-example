
package com.ca.example.metricsdaggerexample.dagger;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.JmxReporter;
import com.codahale.metrics.MetricRegistry;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;


@Module
public class MetricsModule
{
	private static volatile MetricRegistry METRIC_REGISTRY = null;

	@Provides @Singleton synchronized MetricRegistry provideMetricRegistry() {
		if (METRIC_REGISTRY != null)
		{
			return METRIC_REGISTRY;
		}

		// Starting two reporters when initializing the registry
		METRIC_REGISTRY = new MetricRegistry();
		JmxReporter.forRegistry(METRIC_REGISTRY).build().start();		
		ConsoleReporter.forRegistry(METRIC_REGISTRY).build().start(15, TimeUnit.SECONDS);

		return METRIC_REGISTRY;
	}

}
