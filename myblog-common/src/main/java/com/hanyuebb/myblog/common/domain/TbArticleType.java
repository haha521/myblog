package com.hanyuebb.myblog.common.domain;

import com.hanyuebb.myblog.common.domain.BaseDomain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tb_article_type")
public class TbArticleType extends BaseDomain {
    @Id
    @Column(name = "atype_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long atypeId;

    @Column(name = "atype_type")
    private String atypeType;

    @Column(name = "create_by")
    private Date createBy;

    @Column(name = "modified_by")
    private Date modifiedBy;

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

    /**
     * @return atype_type
     */
    public String getAtypeType() {
        return atypeType;
    }

    /**
     * @param atypeType
     */
    public void setAtypeType(String atypeType) {
        this.atypeType = atypeType;
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
}