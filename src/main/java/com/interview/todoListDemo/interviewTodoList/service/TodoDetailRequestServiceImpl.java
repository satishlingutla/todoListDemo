package com.interview.todoListDemo.interviewTodoList.service;

import com.interview.todoListDemo.interviewTodoList.Dao.TodoDetailDao;
import com.interview.todoListDemo.interviewTodoList.model.TodoDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: satish
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class TodoDetailRequestServiceImpl implements TodoDetailRequestService {

    @Autowired
    private TodoDetailDao todoDetailDao;

    @Override
    public void create(List<TodoDetail> todoDetails) {
        for (TodoDetail todoDetail : todoDetails) {
            todoDetailDao.create(todoDetail);
        }

    }

    @Override
    public void create(TodoDetail todoDetail) {
        todoDetailDao.create(todoDetail);

    }

    //To be implemented
    @Override
    public ArrayList retrieveTodoList() {
        //To change body of implemented methods use File | Settings | File Templates.
        return todoDetailDao.retrieveTodoList();
    }

    @Override
    public void save(TodoDetail todoDetail) {
        //To change body of implemented methods use File | Settings | File Templates.
        todoDetailDao.save(todoDetail);
    }

    @Override
    public void delete(TodoDetail todoDetail) {
        //To change body of implemented methods use File | Settings | File Templates.
        todoDetailDao.delete(todoDetail);
    }
}
