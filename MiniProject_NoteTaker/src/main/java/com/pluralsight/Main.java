package com.pluralsight;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Note-taking to-do app
        //classes to include: Note, ToDoItem, NoteManager, ToDoList, MenuUI

        //Create new note in Main class:
        NoteManager noteManager = new NoteManager();    //Create new object
        Note myNote = new Note(1,"Groceries to buy: ", "\nEggs,\nCheese\nPasta sauce\n", LocalDate.now(),"Costco Trip");

        //Add note to note manager
        noteManager.addNote(myNote);

        //Display all notes
        noteManager.displayAllNotes();

    }
}