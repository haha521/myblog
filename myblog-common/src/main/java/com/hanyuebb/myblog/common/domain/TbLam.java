package com.hanyuebb.myblog.common.domain;

import com.hanyuebb.myblog.common.domain.BaseDomain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tb_lam")
public class TbLam extends BaseDomain {
    @Id
    @Column(name = "lam_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lamId;

    @Column(name = "lam_content")
    private String lamContent;

    @Column(name = "lam_email")
    private String lamEmail;

    @Column(name = "create_by")
    private Date createBy;

    @Column(name = "modified_by")
    private Date modifiedBy;

    @Column(name = "user_id")
    private Long userId;

    /**
     * @return lam_id
     */
    public Long getLamId() {
        return lamId;
    }

    /**
     * @param lamId
     */
    public void setLamId(Long lamId) {
        this.lamId = lamId;
    }

    /**
     * @return lam_content
     */
    public String getLamContent() {
        return lamContent;
    }

    /**
     * @param lamContent
     */
    public void setLamContent(String lamContent) {
        this.lamContent = lamContent;
    }

    /**
     * @return lam_email
     */
    public String getLamEmail() {
        return lamEmail;
    }

    /**
     * @param lamEmail
     */
    public void setLamEmail(String lamEmail) {
        this.lamEmail = lamEmail;
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
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}