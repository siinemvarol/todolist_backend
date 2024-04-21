package com.sinem.todolist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinem.todolist.service.ListItemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/listitem")
@RequiredArgsConstructor
public class ListItemController {
	
	private final ListItemService listItemService = null;

}
