package com.thoughtworks.gaia.examination.service;

import com.thoughtworks.gaia.common.Loggable;
import com.thoughtworks.gaia.common.exception.NotFoundException;
import com.thoughtworks.gaia.examination.ExaminationMapper;
import com.thoughtworks.gaia.examination.entity.Examination;
import com.thoughtworks.gaia.examination.model.ExaminationModel;
import com.thoughtworks.gaia.examination.repository.ExaminationRepository;
import com.thoughtworks.gaia.product.entity.Product;
import com.thoughtworks.gaia.product.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by jlguo on 16/06/2017.
 */
@Service
@Transactional
public class ExaminationService implements Loggable {

    @Autowired
    private ExaminationMapper mapper;

    @Autowired
    private ExaminationRepository examinationRepository;

    public Examination create(Examination examination) {
        Examination e = new Examination();
        e.setCodingEndTime(new Date());
        e.setId(110l);
        e.setExamTemplateId(10l);
        e.setStudentId(100l);
        e.setStartTime(new Date());
        e.setLogicStartTime(new Date());
        e.setCodingNum(2);
        ExaminationModel examinationModel = mapper.map(e,ExaminationModel.class);
        return mapper.map(examinationRepository.saveAndFlush(examinationModel), Examination.class);
    }

    public Examination getExamination(Long examinationId) {
        ExaminationModel examinationModel = examinationRepository.findOne(examinationId);
        if (examinationModel == null) {
            error("Examination not found with id: " + examinationId);
            throw new NotFoundException();
        }

        return mapper.map(examinationModel, Examination.class);
    }

}
