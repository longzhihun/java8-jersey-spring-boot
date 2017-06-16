package com.thoughtworks.gaia.examination.entity;

/**
 * Created by jlguo on 16/06/2017.
 */
public class PaperTemplate {
    private Long id;

    private String name;

    private Long logicBankId;

    private Integer logicNum;

    private Long logicLimitTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLogicBankId() {
        return logicBankId;
    }

    public void setLogicBankId(Long logicBankId) {
        this.logicBankId = logicBankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
