package com.interview.todoListDemo.interviewTodoList.Dao;

import com.interview.todoListDemo.interviewTodoList.model.TodoDetail;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: satish
 * To change this template use File | Settings | File Templates.
 */
public interface TodoDetailDao {

    void create(TodoDetail todoDetail);
    //To be implemented
    ArrayList retrieveTodoList();
    void save(TodoDetail todoDetailodoDetail);
    void delete(TodoDetail todoDetailodoDetail);

}
