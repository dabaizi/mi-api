package com.dabaizi.mi.domain;

import com.dabaizi.mi.common.BaseEntity;

import java.math.BigDecimal;

public class DomainName extends BaseEntity {

    /**
     * 域名id
     */
    Long id;

    /**
     * 域名
     */
    String name;

    /**
     * 后缀id
     */
    Integer postfixId;

    /**
     * 后缀
     */
    String postfix;

    /**
     * 简介
     */
    String description;

    /**
     * 价格
     */
    BigDecimal price = BigDecimal.ZERO;

    /**
     * 链接
     */
    String link;

    /**
     * 推荐类型
     */
    Integer recommendType;

    /**
     * 类目1
     */
    Integer category1;

    /**
     * 类目2
     */
    Integer category2;

    /**
     * 类目3
     */
    Integer category3;


    /**
     * 域名状态：0：再售；1：已售；2：不卖
     */
    Integer state;

    /**
     * 域名图片
     */
    String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostfix() {
        return postfix;
    }

    public void setPostfix(String postfix) {
        this.postfix = postfix;
    }

    public Integer getPostfixId() {
        return postfixId;
    }

    public void setPostfixId(Integer postfixId) {
        this.postfixId = postfixId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(Integer recommendType) {
        this.recommendType = recommendType;
    }

    public Integer getCategory1() {
        return category1;
    }

    public void setCategory1(Integer category1) {
        this.category1 = category1;
    }

    public Integer getCategory2() {
        return category2;
    }

    public void setCategory2(Integer category2) {
        this.category2 = category2;
    }

    public Integer getCategory3() {
        return category3;
    }

    public void setCategory3(Integer category3) {
        this.category3 = category3;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }


}
