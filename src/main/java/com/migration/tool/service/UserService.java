package com.migration.tool.service;





import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.migration.tool.model.User;

@Repository
public interface UserService extends CrudRepository<User, Long> {

	
}