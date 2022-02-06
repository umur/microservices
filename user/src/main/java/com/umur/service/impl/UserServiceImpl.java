package com.umur.service.impl;

import com.umur.domain.Users;
import org.springframework.stereotype.Service;
import com.umur.repository.UserRepo;
import com.umur.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<Users> findAll() {
        List<Users> result= new ArrayList<>();
        userRepo.findAll().forEach(result::add);
        return result;
    }
}
