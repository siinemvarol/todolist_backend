package com.sinem.todolist.service;

import org.springframework.stereotype.Service;

import com.sinem.todolist.repository.IListItemRepository;
import com.sinem.todolist.repository.entity.ListItem;
import com.sinem.todolist.utility.ServiceManager;

@Service
public class ListItemService extends ServiceManager<ListItem, Long> {
	
	private final IListItemRepository listItemRepository;

	public ListItemService(IListItemRepository listItemRepository) {
		super(listItemRepository);
		this.listItemRepository = listItemRepository;
	}

	
}
