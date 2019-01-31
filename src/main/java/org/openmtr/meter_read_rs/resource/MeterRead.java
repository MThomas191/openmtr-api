package com.openmtr.meter_read_rs.resource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("get-reading")
public class MeterRead {
  
    @POST
    public Response post() {
      return Response.ok().build();
    }
}
