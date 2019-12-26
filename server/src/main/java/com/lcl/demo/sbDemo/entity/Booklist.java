package com.lcl.demo.sbDemo.entity;

import java.util.Date;

public class Booklist {
    private Long id;

    private String title;

    private String author;

    private String image;

    private Byte type;

    private String summary;

    private String publisher;

    private String ranking;

    private String category;

    private Date createTime;

    private Date updateTime;

    public Booklist(Long id, String title, String author, String image, Byte type, String summary, String publisher, String ranking, String category, Date createTime, Date updateTime) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.image = image;
        this.type = type;
        this.summary = summary;
        this.publisher = publisher;
        this.ranking = ranking;
        this.category = category;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Booklist() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking == null ? null : ranking.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}