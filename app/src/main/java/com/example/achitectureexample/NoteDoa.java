package com.example.achitectureexample;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDoa {

    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    @Query("DELETE FROM NOTE_TABLE")
    void deleteAllNotes();

    @Query("SELECT * FROM note_table ORDER BY PRIORITYNUMBER DESC")
    LiveData<List<Note>> getAllNotes();

}
