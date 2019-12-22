package com.lcl.demo.sbDemo.entity;

public class NoteBookKey {
    private Long id;

    private Long noteId;

    private Long bookId;

    public NoteBookKey(Long id, Long noteId, Long bookId) {
        this.id = id;
        this.noteId = noteId;
        this.bookId = bookId;
    }

    public NoteBookKey() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
}