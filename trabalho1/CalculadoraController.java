package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import calculadora.Calculadora;

public class CalculadoraController {
    @FXML
    private TextField num1Field;

    @FXML
    private TextField num2Field;

    @FXML
    private ComboBox<String> operacaoComboBox;

    @FXML
    private void calcular() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            String operacao = operacaoComboBox.getValue();

            Calculadora calculadora = new Calculadora();
            double resultado = 0;

            switch (operacao) {
                case "+":
                    resultado = calculadora.soma(num1, num2);
                    break;
                case "-":
                    resultado = calculadora.subtracao(num1, num2);
                    break;
                case "*":
                    resultado = calculadora.multiplicacao(num1, num2);
                    break;
                case "/":
                    resultado = calculadora.divisao(num1, num2);
                    break;
                default:
                    throw new IllegalArgumentException("Operação inválida.");
            }

        } catch (NumberFormatException e) {
        } catch (IllegalArgumentException e) {
          
    }
}
