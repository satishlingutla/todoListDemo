package com.interview.todoListDemo.interviewTodoList.controller;

import com.interview.todoListDemo.interviewTodoList.model.TodoDetail;
import com.interview.todoListDemo.interviewTodoList.service.TodoDetailRequestService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to Todo List Demo.";
    }

    @PostMapping(value="/saveDetails")
    public String postCustomer(@RequestBody List<TodoDetail> todoDetail){

        todoDetailRequestService.create(todoDetail);

        return "Post Successfully!";

    }

//    public ResponseEntity<?> createNote(@RequestBody TodoDetail todoDetail, UriComponentsBuilder ucBuilder) {
//    @RequestMapping(value = "/createtoDoDetail/{id}", method = RequestMethod.POST)

//    @RequestMapping("/save/{player}")
//
//    public ResponseEntity<?> save(@PathVariable("id") long id) {
//
////        todoDetailRequestService.create(todoDetail);
////
//        HttpHeaders headers = new HttpHeaders();
////        headers.setLocation(ucBuilder.path("/").buildAndExpand().toUri());
//        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
//    }

}