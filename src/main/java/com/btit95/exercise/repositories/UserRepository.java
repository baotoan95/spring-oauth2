package com.btit95.exercise.repositories;

import org.springframework.data.repository.CrudRepository;

import com.btit95.exercise.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel, String> {

}
