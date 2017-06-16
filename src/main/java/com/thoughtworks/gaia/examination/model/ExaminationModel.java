package com.thoughtworks.gaia.examination.model;

import com.thoughtworks.gaia.common.jpa.IdBaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by jlguo on 16/06/2017.
 */
@Entity
@Table(name = "T_EXAMINATION")
public class ExaminationModel extends IdBaseModel {

    @Column(name = "STUDENT_ID", nullable = false)
    private Long studentId;
    @Column(name = "EXAM_TEMPLATE_ID", nullable = false)
    private Long examTemplateId;
    @Column(name = "START_TIME")
    private Date startTime;
    @Column(name = "END_TIME")
    private Date endTime;
    @Column(name = "LIMIT_START_TIME")
    private Date limitStartTime;
    @Column(name = "LIMIT_END_TIME")
    private Date limitEndTime;
    @Column(name = "LOGIC_START_TIME")
    private Date logicStartTime;
    @Column(name = "LOGIC_END_TIME")
    private Date logicEndTime;
    @Column(name = "CODING_START_TIME")
    private Date codingStartTime;
    @Column(name = "CODING_END_TIME")
    private Date codingEndTime;
    @Column(name = "LOGIC_NUM")
    private Integer logicNum;
    @Column(name = "CODING_NUM")
    private Integer codingNum;
    @Column(name = "CURRENT_LOGIC_NUM")
    private Integer currentLogicNum;
    @Column(name = "CURRENT_CODING_NUM")
    private Integer currentCodingNum;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getExamTemplateId() {
        return examTemplateId;
    }

    public void setExamTemplateId(Long examTemplateId) {
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

    public Integer getLogicNum() {
        return logicNum;
    }

    public void setLogicNum(Integer logicNum) {
        this.logicNum = logicNum;
    }

    public Integer getCodingNum() {
        return codingNum;
    }

    public void setCodingNum(Integer codingNum) {
        this.codingNum = codingNum;
    }

    public Integer getCurrentLogicNum() {
        return currentLogicNum;
    }

    public void setCurrentLogicNum(Integer currentLogicNum) {
        this.currentLogicNum = currentLogicNum;
    }

    public Integer getCurrentCodingNum() {
        return currentCodingNum;
    }

    public void setCurrentCodingNum(Integer currentCodingNum) {
        this.currentCodingNum = currentCodingNum;
    }
}
