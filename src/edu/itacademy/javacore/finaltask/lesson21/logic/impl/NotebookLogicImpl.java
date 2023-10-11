package edu.itacademy.javacore.finaltask.lesson21.logic.impl;

import edu.itacademy.javacore.finaltask.lesson21.dao.DaoException;
import edu.itacademy.javacore.finaltask.lesson21.dao.DaoProvider;
import edu.itacademy.javacore.finaltask.lesson21.dao.NoteBookDao;
import edu.itacademy.javacore.finaltask.lesson21.entity.Note;
import edu.itacademy.javacore.finaltask.lesson21.logic.LogicException;
import edu.itacademy.javacore.finaltask.lesson21.logic.NotebookLogic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NotebookLogicImpl implements NotebookLogic {
    private final DaoProvider provider = DaoProvider.getInstance();
    private final NoteBookDao dao = provider.getNoteBookDao();

    @Override
    public void update(Note n) throws LogicException, IOException {
        try {
            dao.update(n);
        } catch (DaoException e) {
            throw new LogicException(e);
        }
    }

    @Override
    public void delete(int id) throws LogicException, IOException {
        try {
            dao.delete(id);
        } catch (DaoException e) {
            throw new LogicException(e);
        }
    }

    public void add(Note n) throws LogicException, DaoException {
        try {
            dao.save(n);
        } catch (DaoException e) {
            throw new LogicException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public List<Note> find(String text) throws LogicException {
        List<Note> result = new ArrayList<>();
        List<Note> myNotes;

        try {
            myNotes = dao.allNotes();
            for (Note n : myNotes) {
                if (isTextInNote(n, text)) {
                    result.add(n);
                }
            }
        } catch (DaoException e) {
            throw new LogicException(e);
        }
        return result;
    }
    private boolean isTextInNote(Note n, String text) throws LogicException {
        return n.getTitle().contains(text) ;
    } 


    public List<Note> allNotes() throws LogicException {
        try {
            return dao.allNotes();
        } catch (DaoException e) {
            throw new LogicException(e);
        }
    }
}
