
package com.ca.example.metricsdaggerexample;

import com.ca.example.metricsdaggerexample.dagger.MetricsModule;
import com.codahale.metrics.MetricRegistry;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {MetricsModule.class})
public interface MetricsDaggerComponent {
	MetricRegistry getMetricsRegistry();
}
