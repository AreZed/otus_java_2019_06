package ru.otus.api;

import java.sql.Connection;

public interface DatabaseSession {
    Connection getConnection();
}
