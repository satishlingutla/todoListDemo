package com.interview.todoListDemo.interviewTodoList.controller;

import com.interview.todoListDemo.interviewTodoList.model.TodoDetail;
import com.interview.todoListDemo.interviewTodoList.service.TodoDetailRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: satish
 * To change this template use File | Settings | File Templates.
 */

@RestController

public class TodoRestApiController {

    @Autowired
    TodoDetailRequestService todoDetailRequestService;

    @RequestMapping(value = "saveDetails", method = RequestMethod.POST)
    public ResponseEntity<?> saveDetails(@RequestBody List<TodoDetail> todoDetail) {
        todoDetailRequestService.create(todoDetail);
        return new ResponseEntity<Void>(HttpStatus.CREATED);

    }

}