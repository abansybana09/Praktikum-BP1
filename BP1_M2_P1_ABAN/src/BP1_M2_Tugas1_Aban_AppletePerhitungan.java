/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class BP1_M2_Tugas1_Aban_AppletePerhitungan extends Applet implements ActionListener {
    TextField num1, num2, result;
    Button add, subtract, multiply, divide;

    public void init() {
        setLayout(new FlowLayout());

        Label label1 = new Label("Angka 1:");
        num1 = new TextField(10);
        Label label2 = new Label("Angka 2:");
        num2 = new TextField(10);

        add(label1);
        add(num1);
        add(label2);
        add(num2);

        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");

        add(add);
        add(subtract);
        add(multiply);
        add(divide);

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        result = new TextField(15);
        result.setEditable(false);
        add(new Label("Hasil:"));
        add(result);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double number1 = Double.parseDouble(num1.getText());
            double number2 = Double.parseDouble(num2.getText());
            double hasil = 0.0;

            if (e.getSource() == add) {
                hasil = number1 + number2;
            } else if (e.getSource() == subtract) {
                hasil = number1 - number2;
            } else if (e.getSource() == multiply) {
                hasil = number1 * number2;
            } else if (e.getSource() == divide) {
                if (number2 != 0) {
                    hasil = number1 / number2;
                } else {
                    result.setText("Error: Pembagi nol!");
                    return;
                }
            }
            result.setText(String.valueOf(hasil));
        } catch (NumberFormatException ex) {
            result.setText("Masukkan angka yang valid!");
        }
    }
}

