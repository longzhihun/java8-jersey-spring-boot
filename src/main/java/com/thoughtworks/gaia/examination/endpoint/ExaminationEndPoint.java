package com.thoughtworks.gaia.examination.endpoint;

import com.thoughtworks.gaia.examination.entity.Examination;
import com.thoughtworks.gaia.product.entity.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by jlguo on 15/06/2017.
 */

@Component
@Path("examinations")
@Api(value = "examination", description = "Access to examination resource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ExaminationEndPoint {

    @Path("/{examinationId}")
    @ApiOperation(value = "Get examination by id", response = Examination.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Get examination successfully"),
            @ApiResponse(code = 404, message = "No examination matches given id")
    })
    @GET
    public Response produceExamination(@PathParam("examinationId") Long examinationId) {

        Examination e = new Examination();

        return Response.ok().entity(e).build();
    }
}
