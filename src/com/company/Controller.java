package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.text.DecimalFormat;

public class Controller {

    private String operator = "";
    private double number1;
    private double number2;
    @FXML
    private Text outputText;

    private Model model = new Model();
    private boolean start = true;

    @FXML
    private void processNumber(ActionEvent event) {
        if (start) {
            outputText.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();
        outputText.setText(outputText.getText() + value);
    }

    @FXML
    private void processOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        if (!"=".equals(value)) {
            if (!operator.isEmpty()) {
                number2 = Double.parseDouble(outputText.getText());
                DecimalFormat df = new DecimalFormat("###.#");
                outputText.setText(String.valueOf(df.format(model.calculator(number1, number2, operator))));
            }
            operator = value;
            number1 = Double.parseDouble(outputText.getText());
            outputText.setText("");
        } else {
            if (operator.isEmpty()) return;
            number2 = Double.parseDouble(outputText.getText());
            DecimalFormat df = new DecimalFormat("###.#");
            outputText.setText(String.valueOf(df.format(model.calculator(number1, number2, operator))));
            operator = "";
            start = true;
        }
    }

    @FXML
    private void procesZeroid(ActionEvent event) {
        outputText.setText("");
    }
}
