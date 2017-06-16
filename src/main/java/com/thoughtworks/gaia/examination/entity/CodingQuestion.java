package com.thoughtworks.gaia.examination.entity;

/**
 * Created by jlguo on 16/06/2017.
 */
public class CodingQuestion {
    private Long id;

    private Long paperTemplateId;

    private Long codingBankId;

    private Integer limitTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPaperTemplateId() {
        return paperTemplateId;
    }

    public void setPaperTemplateId(Long paperTemplateId) {
        this.paperTemplateId = paperTemplateId;
    }

    public Long getCodingBankId() {
        return codingBankId;
    }

    public void setCodingBankId(Long codingBankId) {
        this.codingBankId = codingBankId;
    }

    public Integer getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Integer limitTime) {
        this.limitTime = limitTime;
    }
}
