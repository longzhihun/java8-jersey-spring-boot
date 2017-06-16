package com.thoughtworks.gaia.examination.endpoint;

import com.thoughtworks.gaia.examination.entity.Examination;
import com.thoughtworks.gaia.examination.service.ExaminationService;
import com.thoughtworks.gaia.product.entity.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * Created by jlguo on 15/06/2017.
 */

@Component
@Path("examinations")
@Api(value = "examination", description = "Access to examination resource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ExaminationEndPoint {

    @Autowired
    ExaminationService examinationService;

    @Context
    private UriInfo uriInfo;

    @POST
    public Response createExamination(Examination examination) {
        Examination newExamination = examinationService.create(examination);
        return Response.created(uriInfo.getRequestUriBuilder().build("/" + newExamination.getId())).entity(newExamination).build();
    }
}
