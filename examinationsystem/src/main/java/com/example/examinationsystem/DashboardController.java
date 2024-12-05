package com.example.examinationsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashboardController {

    @FXML
    private Label totalStudentsLabel;

    @FXML
    private Label totalExamsLabel;

    @FXML
    private Label totalQuestionsLabel;

    @FXML
    private Label noticesLabel;

    @FXML
    private void handleDashboardClick() {
        // This is already the dashboard screen
    }

    @FXML
    private void handleQuestionsClick() {
        // Load Questions Screen
        System.out.println("Navigate to Questions");
    }

    @FXML
    private void handleExamClick() {
        // Load Exam Screen
        System.out.println("Navigate to Exam Screen");
    }

    @FXML
    private void handleLogoutClick() {
        // Logout and go to login screen
        System.out.println("Logging Out...");
    }

    public void initialize() {
        // Initialize dashboard statistics
        totalStudentsLabel.setText("10");
        totalExamsLabel.setText("3");
        totalQuestionsLabel.setText("89");
        noticesLabel.setText("1");
    }
}
