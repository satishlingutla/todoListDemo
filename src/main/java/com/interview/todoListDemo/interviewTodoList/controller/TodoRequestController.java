package com.interview.todoListDemo.interviewTodoList.controller;

import com.interview.todoListDemo.interviewTodoList.model.TodoDetail;
import com.interview.todoListDemo.interviewTodoList.service.TodoDetailRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: satish
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class TodoRequestController {
    @Autowired
    TodoDetailRequestService todoDetailRequestService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homepage() {
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createTodoList() {
        todoDetailRequestService.create(new TodoDetail());
    }
}
