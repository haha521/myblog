package com.hanyuebb.myblog.common.domain;

import com.hanyuebb.myblog.common.domain.BaseDomain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tb_article_content")
public class TbArticleContent extends BaseDomain {
    @Id
    @Column(name = "acontent_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long acontentId;

    @Column(name = "article_id")
    private Long articleId;

    @Column(name = "create_by")
    private Date createBy;

    @Column(name = "modified_by")
    private Date modifiedBy;

    @Column(name = "acontent_content")
    private String acontentContent;

    /**
     * @return acontent_id
     */
    public Long getAcontentId() {
        return acontentId;
    }

    /**
     * @param acontentId
     */
    public void setAcontentId(Long acontentId) {
        this.acontentId = acontentId;
    }

    /**
     * @return article_id
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * @param articleId
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
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
     * @return acontent_content
     */
    public String getAcontentContent() {
        return acontentContent;
    }

    /**
     * @param acontentContent
     */
    public void setAcontentContent(String acontentContent) {
        this.acontentContent = acontentContent;
    }
}