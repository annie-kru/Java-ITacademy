package edu.itacademy.javacore.finaltask.lesson21.controller.impl;

import edu.itacademy.javacore.finaltask.lesson21.controller.Command;
import edu.itacademy.javacore.finaltask.lesson21.dao.DaoException;
import edu.itacademy.javacore.finaltask.lesson21.entity.Note;
import edu.itacademy.javacore.finaltask.lesson21.logic.LogicException;
import edu.itacademy.javacore.finaltask.lesson21.logic.LogicProvider;
import edu.itacademy.javacore.finaltask.lesson21.logic.NotebookLogic;

import java.io.IOException;
import java.util.List;

public class FindNoteByTitleCommand implements Command {
    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final NotebookLogic logic = logicProvider.getNotebookLogic();
    @Override
    public String execute(String request) throws IOException, DaoException {
        String response = null;
        String[] params;
        List<Note> allNotes;


        params = request.split("\n");

        try {
            allNotes = logic.find(params[1].split("=")[1]);
//            for (Note n : allNotes) {
//              System.out.println(n);
//
//            }
        } catch (NumberFormatException e) {
            response = "Что-то пошло не так. Попробуйте еще раз.";
        } catch (LogicException e) {
            response = "Что-то пошло не так. Попробуйте еще раз.";
        }
        response = "Все записи с подходящим заголовком выведены на экран.";
        return response;
    }
}
