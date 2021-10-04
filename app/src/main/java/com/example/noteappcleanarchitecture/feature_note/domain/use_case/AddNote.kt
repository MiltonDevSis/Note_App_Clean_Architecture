package com.example.noteappcleanarchitecture.feature_note.domain.use_case

import com.example.noteappcleanarchitecture.feature_note.domain.model.InvalidNoteException
import com.example.noteappcleanarchitecture.feature_note.domain.model.Note
import com.example.noteappcleanarchitecture.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()){
            throw InvalidNoteException("O título da nota não pode estar em branco!")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("O conteúdo da nota não pode estar em branco!")
        }
        repository.insertNote(note)
    }
}