package com.interview.todoListDemo.interviewTodoList.Dao;

import com.interview.todoListDemo.interviewTodoList.model.TodoDetail;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: satish
 * To change this template use File | Settings | File Templates.
 */

@Repository
public class TodoDetailDaoImpl implements TodoDetailDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(TodoDetail todoDetail) {
        entityManager.persist(todoDetail);
    }

    @Override
    public ArrayList retrieveTodoList() {
        //To change body of implemented methods use File | Settings | File Templates.
        //To be implemented
        return new ArrayList();
    }

    @Override
    public void save(TodoDetail todoDetailodoDetail) {
        //To change body of implemented methods use File | Settings | File Templates.
        //To be implemented
    }

    @Override
    public void delete(TodoDetail todoDetailodoDetail) {
        //To change body of implemented methods use File | Settings | File Templates.
        //To be implemented
    }
}
