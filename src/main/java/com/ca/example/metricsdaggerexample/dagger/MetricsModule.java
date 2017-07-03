
package com.ca.example.metricsdaggerexample.dagger;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.JmxReporter;
import com.codahale.metrics.MetricRegistry;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;


@Module
public abstract class MetricsModule
{

	@Provides @Singleton static MetricRegistry provideMetricRegistry() {

		// Starting two reporters when initializing the registry
		MetricRegistry metricRegistry = new MetricRegistry();
		JmxReporter.forRegistry(metricRegistry).build().start();		
		ConsoleReporter.forRegistry(metricRegistry).build().start(15, TimeUnit.SECONDS);

		return metricRegistry;
	}

}
