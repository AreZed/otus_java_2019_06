package ru.otus.hw12.service;

import ru.otus.hw12.cache.HwCacheImpl;
import ru.otus.hw12.dao.UserDao;
import ru.otus.hw12.entity.User;
import ru.otus.hw12.hibernate.exception.DbServiceException;

import java.util.Optional;

public class CachedUserDbServiceImpl extends UserDbServiceImpl {
    private final HwCacheImpl<Long, User> cache;

    public CachedUserDbServiceImpl(UserDao userDao) {
        super(userDao);
        this.cache = new HwCacheImpl<>();
    }

    @Override
    public Optional<User> get(long id) throws DbServiceException {
        final var cachedUser = cache.get(id);
        if (cachedUser != null) {
            return Optional.of(cachedUser);
        }

        var userOptional = super.get(id);
        userOptional.ifPresent(user -> cache.put(id, user));

        return userOptional;
    }

    @Override
    public void save(User object) throws DbServiceException {
        super.save(object);
        cache.put(object.getId(), object);
    }
}
