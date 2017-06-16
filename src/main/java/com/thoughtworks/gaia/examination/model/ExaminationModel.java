package com.thoughtworks.gaia.examination.model;

import com.thoughtworks.gaia.common.jpa.IdBaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by jlguo on 16/06/2017.
 */

public class ExaminationModel extends IdBaseModel {

    private String studentId;

    private String examTemplateId;

    private Date startTime;

    private Date endTime;

    private Date limitStartTime;

    private Date limitEndTime;

    private Date logicStartTime;

    private Date logicEndTime;

    private Date codingStartTime;

    private Date codingEndTime;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getExamTemplateId() {
        return examTemplateId;
    }

    public void setExamTemplateId(String examTemplateId) {
        this.examTemplateId = examTemplateId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getLimitStartTime() {
        return limitStartTime;
    }

    public void setLimitStartTime(Date limitStartTime) {
        this.limitStartTime = limitStartTime;
    }

    public Date getLimitEndTime() {
        return limitEndTime;
    }

    public void setLimitEndTime(Date limitEndTime) {
        this.limitEndTime = limitEndTime;
    }

    public Date getLogicStartTime() {
        return logicStartTime;
    }

    public void setLogicStartTime(Date logicStartTime) {
        this.logicStartTime = logicStartTime;
    }

    public Date getLogicEndTime() {
        return logicEndTime;
    }

    public void setLogicEndTime(Date logicEndTime) {
        this.logicEndTime = logicEndTime;
    }

    public Date getCodingStartTime() {
        return codingStartTime;
    }

    public void setCodingStartTime(Date codingStartTime) {
        this.codingStartTime = codingStartTime;
    }

    public Date getCodingEndTime() {
        return codingEndTime;
    }

    public void setCodingEndTime(Date codingEndTime) {
        this.codingEndTime = codingEndTime;
    }
}
