package com.example.noteappcleanarchitecture.feature_note.presentation.add_edit_note

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val ishintVisible: Boolean = true
)
