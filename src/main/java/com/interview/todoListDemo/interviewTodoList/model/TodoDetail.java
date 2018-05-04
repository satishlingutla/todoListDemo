package com.interview.todoListDemo.interviewTodoList.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: satish
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "Todo_Details")

public class TodoDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Column(name = "note_Id")
    private Long noteId;

    @Column(name = "note_Detail")
    private String noteDetail;

    @Column(name = "create_time")
    private Date createTime = new Date();

    public TodoDetail() {
    }

    @Column(name = "status")
    private boolean done;

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }


    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getNoteDetail() {
        return noteDetail;
    }

    public void setNoteDetail(String noteDetail) {
        this.noteDetail = noteDetail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

