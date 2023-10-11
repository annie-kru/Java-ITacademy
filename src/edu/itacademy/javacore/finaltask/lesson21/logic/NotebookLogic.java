package edu.itacademy.javacore.finaltask.lesson21.logic;

import edu.itacademy.javacore.finaltask.lesson21.entity.Note;

import java.io.IOException;
import java.util.List;

public interface NotebookLogic {

    public void update(Note n) throws LogicException, IOException;

    public void delete(int id) throws LogicException, IOException;

    public void add(Note n) throws Exception;

    public List<Note> find(String text) throws LogicException;

    public void allNotes() throws LogicException;
}
