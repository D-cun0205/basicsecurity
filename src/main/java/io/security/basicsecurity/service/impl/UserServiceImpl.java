package io.security.basicsecurity.service.impl;

import io.security.basicsecurity.domain.Account;
import io.security.basicsecurity.repository.UserRepository;
import io.security.basicsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public void createUser(Account accout) {
        userRepository.save(accout);
    }
}
