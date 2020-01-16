package com.hanyuebb.myblog.common.domain;

import com.hanyuebb.myblog.common.domain.BaseDomain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tb_article")
public class TbArticle extends BaseDomain {
    @Id
    @Column(name = "article_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long articleId;

    @Column(name = "article_title")
    private String articleTitle;

    @Column(name = "article_summary")
    private String articleSummary;

    @Column(name = "create_by")
    private Date createBy;

    @Column(name = "modified_by")
    private Date modifiedBy;

    @Column(name = "atype_id")
    private Long atypeId;

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
     * @return article_title
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * @param articleTitle
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    /**
     * @return article_summary
     */
    public String getArticleSummary() {
        return articleSummary;
    }

    /**
     * @param articleSummary
     */
    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
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
     * @return atype_id
     */
    public Long getAtypeId() {
        return atypeId;
    }

    /**
     * @param atypeId
     */
    public void setAtypeId(Long atypeId) {
        this.atypeId = atypeId;
    }
}