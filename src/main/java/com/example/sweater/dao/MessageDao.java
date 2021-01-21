package com.example.sweater.dao;

import com.example.sweater.model.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageDao extends CrudRepository<Message, String> {
    List<Message> findByTag(String tag);
}
