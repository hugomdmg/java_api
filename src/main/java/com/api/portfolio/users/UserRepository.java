package com.api.portfolio.users;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel, String>  {
	UserModel findByEmail(String email);
}
