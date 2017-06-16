package com.thoughtworks.gaia.examination.entity;

import java.util.Date;

/**
 * Created by jlguo on 16/06/2017.
 */
public class Examination {

    private String id;

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

    private Integer logicNum;

    private Integer codingNum;

    private Integer currentLogicNum;

    private Integer currentCodingNum;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
