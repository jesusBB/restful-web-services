/*
 * Copyright (c) Jaguar Land Rover Ltd 2022. All rights reserved
 */

package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.in28minutes.rest.webservices.restfulwebservices.exceptions.UserNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService { 
    // JPA/Hibernate > Database
    // UserDaoService > Static List

    private static int usersCount = 0;
    private static final List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Adam",LocalDate.now().minusYears(30)));
        users.add(new User(2,"Eve",LocalDate.now().minusYears(25)));
        users.add(new User(3,"Jim",LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    //public User save(User user) {

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        User user = users.stream().filter(predicate).findFirst().orElse(null);

        if(user==null)
            throw new UserNotFoundException("id:" + id);

        return user;
    }

    public void save(User user) {
        user.setId(++usersCount);
        users.add(user);
        //return user;
    }

    public void deleteUserById(int id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}