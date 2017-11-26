package com.f1soft.rest.resource;

import com.f1soft.rest.pojoClasses.StudentPojo;
import com.f1soft.rest.utilities.StudentInfoUtils;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author sadhana.dahal
 */
@Path("student")
public class StudentResource {

    @GET
    @Path("/studentInfo")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentInfo() {
        StudentPojo studentPojo = null;
        try {
            studentPojo = StudentInfoUtils.setStudentInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Response.ok(studentPojo).build();
    }

}
