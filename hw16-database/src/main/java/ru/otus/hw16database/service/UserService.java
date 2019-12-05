package ru.otus.hw16database.service;

import org.springframework.stereotype.Service;
import ru.otus.hw16database.entity.User;
import ru.otus.hw16database.exception.DbServiceException;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    Optional<User> get(long id) throws DbServiceException;

    void save(User object) throws DbServiceException;

    void update(User object) throws DbServiceException;

    void delete(User object) throws DbServiceException;

    List<User> findAll() throws DbServiceException;
}
