package com.interview.todoListDemo.interviewTodoList.service;

import com.interview.todoListDemo.interviewTodoList.model.TodoDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: satish
 * To change this template use File | Settings | File Templates.
 */
public interface TodoDetailRequestService {
    void create(List<TodoDetail> todoDetailodoDetail);
    void create(TodoDetail todoDetailodoDetail);
    ArrayList retrieveTodoList();
    void save(TodoDetail todoDetailodoDetail);
    void delete(TodoDetail todoDetailodoDetail);
}

