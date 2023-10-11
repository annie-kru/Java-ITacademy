package edu.itacademy.javacore.finaltask.lesson21.controller.impl;

import edu.itacademy.javacore.finaltask.lesson21.controller.Command;
import edu.itacademy.javacore.finaltask.lesson21.entity.Note;
import edu.itacademy.javacore.finaltask.lesson21.logic.LogicException;
import edu.itacademy.javacore.finaltask.lesson21.logic.LogicProvider;
import edu.itacademy.javacore.finaltask.lesson21.logic.NotebookLogic;

import java.util.List;

public class ShowAllNotesCommand implements Command {
    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final NotebookLogic logic = logicProvider.getNotebookLogic();
    @Override
    public String execute(String request) {
        String response = null;
        StringBuilder list = new StringBuilder();
        List<Note> allNotes;

        try {
             logic.allNotes();
//            for (Note n : allNotes) {
//                list.append(n.toString()).append("\n");
//            }
        } catch (NumberFormatException e) {
            response = "Что-то пошло не так. Попробуйте еще раз.";
        } catch (LogicException e) {
            response = "Что-то пошло не так. Попробуйте еще раз.";
        }
        response = "Все записи выведены на экран.";
        System.out.print(list);

        return response.toString();
    }
}
