package com.hanyuebb.myblog.web.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * ClassName:ArticleAndContent
 * Package:com.hanyuebb.myblog.web.dto
 * Description:
 *
 * @date:2020/1/17 18:41
 * @auther:zh
 */
public class ArticleAndContent implements Serializable {

    private Long articleId;

    private String articleTitle;

    private String articleSummary;

    private Date createBy;

    private Date modifiedBy;

    private Long atypeId;

    private String atypeType;

    private Long acontentId;

    private String acontentContent;

    public String getAtypeType() {
        return atypeType;
    }

    public void setAtypeType(String atypeType) {
        this.atypeType = atypeType;
    }
    public Long getAcontentId() {
        return acontentId;
    }

    public void setAcontentId(Long acontentId) {
        this.acontentId = acontentId;
    }

    public String getAcontentContent() {
        return acontentContent;
    }

    public void setAcontentContent(String acontentContent) {
        this.acontentContent = acontentContent;
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
