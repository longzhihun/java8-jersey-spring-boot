package com.thoughtworks.gaia.examination.entity;

/**
 * Created by jlguo on 16/06/2017.
 */
public class PaperTemplate {
    private String id;

    private String name;

    private String logicBankId;

    private Integer logicNum;

    private Long logicLimitTime;

    private Long codingLimitTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogicBankId() {
        return logicBankId;
    }

    public void setLogicBankId(String logicBankId) {
        this.logicBankId = logicBankId;
    }

    public Integer getLogicNum() {
        return logicNum;
    }

    public void setLogicNum(Integer logicNum) {
        this.logicNum = logicNum;
    }

    public Long getLogicLimitTime() {
        return logicLimitTime;
    }

    public void setLogicLimitTime(Long logicLimitTime) {
        this.logicLimitTime = logicLimitTime;
    }

    public Long getCodingLimitTime() {
        return codingLimitTime;
    }

    public void setCodingLimitTime(Long codingLimitTime) {
        this.codingLimitTime = codingLimitTime;
    }
}
