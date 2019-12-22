package com.lcl.demo.sbDemo.entity;

import java.util.Date;

public class NoteBook extends NoteBookKey {
    private Date createTime;

    private Date updateTime;

    public NoteBook(Long id, Long noteId, Long bookId, Date createTime, Date updateTime) {
        super(id, noteId, bookId);
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public NoteBook() {
        super();
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