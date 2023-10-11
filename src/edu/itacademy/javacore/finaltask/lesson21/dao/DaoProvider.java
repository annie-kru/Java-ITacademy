package edu.itacademy.javacore.finaltask.lesson21.dao;

import edu.itacademy.javacore.finaltask.lesson21.dao.impl.FileNoteBookDao;

public final class DaoProvider {
    private static final DaoProvider INSTANCE = new DaoProvider();

    private DaoProvider() {}

    private NoteBookDao noteBookDao = new FileNoteBookDao();

    public NoteBookDao getNoteBookDao() {
        return noteBookDao;
    }
    public static DaoProvider getInstance() {
        return INSTANCE;
    }
}
