package com.example.examinationsystem;


import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class QuestionsController {

    @FXML
    private TableView<?> questionsTable;

    @FXML
    private void handleAddQuestion() {
        System.out.println("Add New Question");
    }
}
