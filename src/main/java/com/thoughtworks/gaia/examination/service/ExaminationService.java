package com.thoughtworks.gaia.examination.service;

import com.thoughtworks.gaia.common.Loggable;
import com.thoughtworks.gaia.examination.entity.Examination;
import com.thoughtworks.gaia.product.entity.Product;
import com.thoughtworks.gaia.product.model.ProductModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by jlguo on 16/06/2017.
 */
@Service
@Transactional
public class ExaminationService implements Loggable {

    public Examination create(Examination examination) {
        Examination e = new Examination();
        e.setCodingEndTime(new Date());
        e.setId(110l);
        e.setCodingNum(2);
        e.setCodingLimitTime(500l);
        return e;
    }

}
