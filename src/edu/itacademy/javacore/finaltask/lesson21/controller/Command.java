package edu.itacademy.javacore.finaltask.lesson21.controller;

import edu.itacademy.javacore.finaltask.lesson21.dao.DaoException;

import java.io.IOException;

public interface Command {
    String execute(String request) throws IOException, DaoException;
}
