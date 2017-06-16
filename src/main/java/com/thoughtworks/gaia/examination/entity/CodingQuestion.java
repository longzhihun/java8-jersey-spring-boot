package com.thoughtworks.gaia.examination.entity;

/**
 * Created by jlguo on 16/06/2017.
 */
public class CodingQuestion {
    private String id;

    private String paperTemplateId;

    private String codingBankId;

    private Integer limitTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPaperTemplateId() {
        return paperTemplateId;
    }

    public void setPaperTemplateId(String paperTemplateId) {
        this.paperTemplateId = paperTemplateId;
    }

    public String getCodingBankId() {
        return codingBankId;
    }

    public void setCodingBankId(String codingBankId) {
        this.codingBankId = codingBankId;
    }

    public Integer getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Integer limitTime) {
        this.limitTime = limitTime;
    }
}
