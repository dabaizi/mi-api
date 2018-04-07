package com.dabaizi.mi.domain;

import com.dabaizi.mi.common.BaseEntity;

public class Category extends BaseEntity {


    /**
     * 类目id
     */
    Long id;

    /**
     * 父类目id
     */

    Long parentId;

    /**
     * 类目名
     */
    String name;

    /**
     * 类目排序
     */
    Integer sort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
