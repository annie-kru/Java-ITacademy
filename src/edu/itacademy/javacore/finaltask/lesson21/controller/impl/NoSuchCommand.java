package edu.itacademy.javacore.finaltask.lesson21.controller.impl;

import edu.itacademy.javacore.finaltask.lesson21.controller.Command;

public class NoSuchCommand implements Command {

    @Override
    public String execute(String request) {
        return "Ошибка запроса";
    }

}
