package com.thoughtworks.gaia.examination.repository;

import com.thoughtworks.gaia.examination.model.ExaminationModel;
import com.thoughtworks.gaia.product.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jlguo on 16/06/2017.
 */
@Repository
public interface ExaminationRepository extends JpaRepository<ExaminationModel, Long> {
}
