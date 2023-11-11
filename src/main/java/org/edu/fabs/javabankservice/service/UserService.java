package org.edu.fabs.javabankservice.service;

import org.edu.fabs.javabankservice.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);

}
