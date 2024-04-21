package com.sinem.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinem.todolist.repository.entity.ListItem;

@Repository
public interface IListItemRepository extends JpaRepository<ListItem, Long>{

}
