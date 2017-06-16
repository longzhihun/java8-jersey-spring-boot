package com.thoughtworks.gaia.examination.dao;

import com.thoughtworks.gaia.common.jpa.BaseDaoWrapper;
import com.thoughtworks.gaia.examination.model.ExaminationModel;
import com.thoughtworks.gaia.product.model.ProductModel;
import org.springframework.stereotype.Component;

/**
 * Created by jlguo on 16/06/2017.
 */
@Component
public class ExaminationDao extends BaseDaoWrapper<ExaminationModel> {
    public ExaminationDao() {
        super(ExaminationModel.class);
    }
}
