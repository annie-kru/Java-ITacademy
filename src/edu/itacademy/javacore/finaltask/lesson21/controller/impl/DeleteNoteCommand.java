package edu.itacademy.javacore.finaltask.lesson21.controller.impl;

import edu.itacademy.javacore.finaltask.lesson21.controller.Command;
import edu.itacademy.javacore.finaltask.lesson21.logic.LogicException;
import edu.itacademy.javacore.finaltask.lesson21.logic.LogicProvider;
import edu.itacademy.javacore.finaltask.lesson21.logic.NotebookLogic;

import java.io.IOException;

public class DeleteNoteCommand implements Command {
    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final NotebookLogic logic = logicProvider.getNotebookLogic();
    @Override
    public String execute(String request)  {
        String response = null;
        String[] params;

        // validate request
        params = request.split("\n");

        try {
            logic.delete(Integer.parseInt(params[1].split("=")[1]));
        } catch (IOException e) {
            response = "Что-то пошло не так. Попробуйте еще раз.";
        } catch (NumberFormatException e) {
            response = "Что-то пошло не так. Попробуйте еще раз.";
        } catch (LogicException e) {
            response = "Что-то пошло не так. Попробуйте еще раз.";
        }
        response = "Запись удалена успешно.";

        return response;
    }
}
