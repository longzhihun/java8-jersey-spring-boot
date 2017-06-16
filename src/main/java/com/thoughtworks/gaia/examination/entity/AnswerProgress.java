package com.thoughtworks.gaia.examination.entity;

/**
 * Created by devxu on 2017/6/16.
 */
public class AnswerProgress {

    private Integer logicNum;

    private Integer logicDoneNum;

    private Integer currentLogic;

    private Integer codingNum;

    private Integer codingDoneNum;

    private Integer currentCoding;

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

    public Integer getCurrentLogic() {
        return currentLogic;
    }

    public void setCurrentLogic(Integer currentLogic) {
        this.currentLogic = currentLogic;
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

    public Integer getCurrentCoding() {
        return currentCoding;
    }

    public void setCurrentCoding(Integer currentCoding) {
        this.currentCoding = currentCoding;
    }
}
