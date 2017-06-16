package com.thoughtworks.gaia.examination.endpoint;

import com.thoughtworks.gaia.examination.entity.AnswerProgress;
import com.thoughtworks.gaia.examination.service.AnswerProgressService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * Created by devxu on 2017/6/16.
 */

@Component
@Path("progresses")
@Api(value = "answerprogress", description = "Access to answer progress resource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AnswerProgressEndPoint {
    @Autowired
    AnswerProgressService answerProgressService;

    @Context
    private UriInfo uriInfo;

    @GET
    public AnswerProgress createProgress(Long examinationId) {
        AnswerProgress progress = answerProgressService.getAnswerProgress(examinationId);
        return progress;
    }
}
