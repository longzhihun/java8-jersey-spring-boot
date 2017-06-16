package com.thoughtworks.gaia.examination.entity;

/**
 * Created by devxu on 2017/6/16.
 */
public class AnswerProgress {

    private Integer logicNum;

    private Integer logicDoneNum;

    private Integer currentLogicNum;

    private Integer codingNum;

    private Integer codingDoneNum;

    private Integer currentCodingNum;

    public Integer getLogicNum() {
        return logicNum;
    }

    public void setLogicNum(Integer logicNum) {
        this.logicNum = logicNum;
    }

    public Integer getLogicDoneNum() {
        return logicDoneNum;
    }

    public void setLogicDoneNum(Integer logicDoneNum) {
        this.logicDoneNum = logicDoneNum;
    }

    public Integer getCurrentLogicNum() {
        return currentLogicNum;
    }

    public void setCurrentLogicNum(Integer currentLogicNum) {
        this.currentLogicNum = currentLogicNum;
    }

    public Integer getCodingNum() {
        return codingNum;
    }

    public void setCodingNum(Integer codingNum) {
        this.codingNum = codingNum;
    }

    public Integer getCodingDoneNum() {
        return codingDoneNum;
    }

    public void setCodingDoneNum(Integer codingDoneNum) {
        this.codingDoneNum = codingDoneNum;
    }

    public Integer getCurrentCodingNum() {
        return currentCodingNum;
    }

    public void setCurrentCodingNum(Integer currentCodingNum) {
        this.currentCodingNum = currentCodingNum;
    }
}
