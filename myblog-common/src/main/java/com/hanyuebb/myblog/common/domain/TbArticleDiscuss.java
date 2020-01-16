package com.hanyuebb.myblog.common.domain;

import com.hanyuebb.myblog.common.domain.BaseDomain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tb_article_discuss")
public class TbArticleDiscuss extends BaseDomain {
    @Id
    @Column(name = "adiscuss_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adiscussId;

    @Column(name = "adiscuss_email")
    private String adiscussEmail;

    @Column(name = "adiscuss_reemail")
    private String adiscussReemail;

    @Column(name = "create_by")
    private Date createBy;

    @Column(name = "modified_by")
    private Date modifiedBy;

    @Column(name = "adiscuss_content")
    private String adiscussContent;

    /**
     * @return adiscuss_id
     */
    public Long getAdiscussId() {
        return adiscussId;
    }

    /**
     * @param adiscussId
     */
    public void setAdiscussId(Long adiscussId) {
        this.adiscussId = adiscussId;
    }

    /**
     * @return adiscuss_email
     */
    public String getAdiscussEmail() {
        return adiscussEmail;
    }

    /**
     * @param adiscussEmail
     */
    public void setAdiscussEmail(String adiscussEmail) {
        this.adiscussEmail = adiscussEmail;
    }

    /**
     * @return adiscuss_reemail
     */
    public String getAdiscussReemail() {
        return adiscussReemail;
    }

    /**
     * @param adiscussReemail
     */
    public void setAdiscussReemail(String adiscussReemail) {
        this.adiscussReemail = adiscussReemail;
    }

    /**
     * @return create_by
     */
    public Date getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    /**
     * @return modified_by
     */
    public Date getModifiedBy() {
        return modifiedBy;
    }

    /**
     * @param modifiedBy
     */
    public void setModifiedBy(Date modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * @return adiscuss_content
     */
    public String getAdiscussContent() {
        return adiscussContent;
    }

    /**
     * @param adiscussContent
     */
    public void setAdiscussContent(String adiscussContent) {
        this.adiscussContent = adiscussContent;
    }
}