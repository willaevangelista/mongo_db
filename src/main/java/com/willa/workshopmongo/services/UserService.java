package com.willa.workshopmongo.services;

import com.willa.workshopmongo.domain.User;
import com.willa.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        List<User> list = userRepository.findAll();
        return list;
    }
}
