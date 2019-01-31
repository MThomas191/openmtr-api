package org.openmtr.meter_read_rs;

import org.glassfish.jersey.server.ResourceConfig;

public class AppConfig extends ResourceConfig {

  public AppConfig() {
    packages("org.openmtr.meter_read_rs.resource");
  }
}
