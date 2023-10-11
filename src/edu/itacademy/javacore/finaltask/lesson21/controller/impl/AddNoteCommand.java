package edu.itacademy.javacore.finaltask.lesson21.controller.impl;

import edu.itacademy.javacore.finaltask.lesson21.controller.Command;
import edu.itacademy.javacore.finaltask.lesson21.dao.DaoException;
import edu.itacademy.javacore.finaltask.lesson21.entity.Note;
import edu.itacademy.javacore.finaltask.lesson21.logic.LogicProvider;
import edu.itacademy.javacore.finaltask.lesson21.logic.NotebookLogic;
import edu.itacademy.javacore.finaltask.lesson21.util.GenerateId;

import java.io.IOException;
import java.util.Date;

public class AddNoteCommand implements Command {

    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final NotebookLogic logic = logicProvider.getNotebookLogic();

    @Override
    public String execute(String request) throws IOException, DaoException {
        String response = null;
        String[] params;
        Note newNote;

        // validate request
        params = request.split("\n");
        newNote = new Note();
        newNote.setTitle(params[1].split("=")[1]);
        newNote.setContent(params[2].split("=")[1]);
        try {
            newNote.setId(GenerateId.nextId());
        } catch (IOException e) {
            System.err.println("ID generation error");
            e.printStackTrace();
        }
        newNote.setD(new Date());

        try {
            logic.add(newNote);
        } catch (Exception e) {
            response = "Что-то пошло не так. Попробуйте еще раз.";
        }
        response = "Запись сохранена успешно.";
        return response;
    }

}
