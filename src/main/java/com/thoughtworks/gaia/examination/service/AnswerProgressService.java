package com.thoughtworks.gaia.examination.service;

import com.thoughtworks.gaia.examination.entity.AnswerProgress;
import com.thoughtworks.gaia.examination.model.ExaminationModel;
import com.thoughtworks.gaia.examination.repository.ExaminationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by devxu on 2017/6/16.
 */
@Service
public class AnswerProgressService {

    public AnswerProgress getAnswerProgress(Long examinationId) {

        AnswerProgress progress = new AnswerProgress();
        progress.setLogicNum(10);
        progress.setLogicDoneNum(6);
        progress.setCurrentLogicNum(7);
        progress.setCodingNum(5);
        progress.setCodingDoneNum(3);
        progress.setCurrentCodingNum(4);

        return progress;

//        ExaminationModel examinationModel = examinationRepository.findOne(examinationId);
//        if (examinationModel == null) {
//            error("Examination not found with id: " + examinationId);
//            throw new NotFoundException();
//        }

    }
}
