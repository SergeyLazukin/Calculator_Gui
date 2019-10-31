import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import javax.swing.*;

public class DisplayPanel  extends JPanel {
    TextField display;
    BigDecimal number_1;
    BigDecimal number_2;
    String operation = "";

    public DisplayPanel() {
        //добавляем поле, в котором будут отображаться введённые числа
        display = new TextField();
        setLayout(null);
        display.setBounds(10, 10, 245, 20);

        Font font = new Font("TimesRoman", Font.BOLD, 12);
        Font bigFont = new Font("TimesRoman", Font.BOLD, 15);
        //добавляем кнопки с цифрами и операциями
        JButton button_1 = new JButton("1");
        JButton button_2 = new JButton("2");
        JButton button_3 = new JButton("3");
        JButton button_4 = new JButton("4");
        JButton button_5 = new JButton("5");
        JButton button_6 = new JButton("6");
        JButton button_7 = new JButton("7");
        JButton button_8 = new JButton("8");
        JButton button_9 = new JButton("9");
        JButton button_0 = new JButton("0");
        JButton buttonT = new JButton(".");
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonMulti = new JButton("*");
        JButton buttonDivide = new JButton("/");
        JButton buttonBackspace = new JButton("◄");
        buttonBackspace.setFont(font);                      //устанавливаем шрифт для кнопки Backspace, т.к.
                                                            // больший шрифт не помещается в данный размер кнопки
        JButton buttonCancel = new JButton("C");
        JButton buttonPlusMinus = new JButton("±");
        JButton buttonResult = new JButton("=");

        //для всех остальных устанавливаем больший шрифт
        JButton[] array = {button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8,
                button_9, buttonCancel, buttonDivide, buttonMinus, buttonMulti, buttonPlus, buttonPlusMinus,
                buttonResult, buttonT};
        for (JButton button : array) {
            button.setFont(bigFont);
        }

        //располагаем кнопки, как нам удобно
        button_7.setBounds(10, 40, 45, 45);
        button_8.setBounds(60, 40, 45, 45);
        button_9.setBounds(110, 40, 45, 45);
        buttonBackspace.setBounds(160, 40, 45, 45);
        buttonCancel.setBounds(210, 40, 45, 45);

        button_4.setBounds(10, 90, 45, 45);
        button_5.setBounds(60, 90, 45, 45);
        button_6.setBounds(110, 90, 45, 45);
        buttonMulti.setBounds(160, 90, 45, 45);
        buttonDivide.setBounds(210, 90, 45, 45);

        button_1.setBounds(10, 140, 45, 45);
        button_2.setBounds(60, 140, 45, 45);
        button_3.setBounds(110, 140, 45, 45);
        buttonPlus.setBounds(160, 140, 45, 45);
        buttonMinus.setBounds(210, 140, 45, 45);

        button_0.setBounds(10, 190, 45, 45);
        buttonT.setBounds(60, 190, 45, 45);
        buttonResult.setBounds(110, 190, 95, 45);
        buttonPlusMinus.setBounds(210, 190, 45, 45);

        add(display);
        add(button_1);
        add(button_2);
        add(button_3);
        add(button_4);
        add(button_5);
        add(button_6);
        add(button_7);
        add(button_8);
        add(button_9);
        add(button_0);
        add(buttonDivide);
        add(buttonMulti);
        add(buttonPlus);
        add(buttonMinus);
        add(buttonT);
        add(buttonBackspace);
        add(buttonResult);
        add(buttonCancel);
        add(buttonPlusMinus);

        //назначаем слушателей для кнопок
        button_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + 0);
            }
        });
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + 1);
            }
        });
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + 2);
            }
        });
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + 3);
            }
        });
        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + 4);
            }
        });
        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + 5);
            }
        });
        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + 6);
            }
        });
        button_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + 7);
            }
        });
        button_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + 8);
            }
        });
        button_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + 9);
            }
        });
        buttonT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String num = display.getText();
                if (!(num.contains(".")) && (num.length() > 0))     //проверка, чтобы невозможно было поставить
                    display.setText(display.getText() + ".");       //две точки либо начать ввод с точки
            }
        });
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if(!display.getText().isEmpty()) {                      //проверка, что пользователь ввёл число.
                    number_1 = new BigDecimal(display.getText());       //сохранение этого числа в переменную.
                    display.setText("");                                //обнуление поля ввода.
                    operation = "+";
                }
            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if(!display.getText().isEmpty()) {
                    number_1 = new BigDecimal(display.getText());
                    display.setText("");
                    operation = "-";
                }
            }
        });
        buttonMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if(!display.getText().isEmpty()) {
                    number_1 = new BigDecimal(display.getText());
                    display.setText("");
                    operation = "*";
                }
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if(!display.getText().isEmpty()) {
                    number_1 = new BigDecimal(display.getText());
                    display.setText("");
                    operation = "/";
                }
            }
        });
        buttonPlusMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String num = display.getText();
                if(!num.isEmpty()) {
                    BigDecimal value = new BigDecimal(display.getText());       //берем число
                    BigDecimal sum = value.multiply(new BigDecimal(-1));    //меняем знак на плюс либо минус
                    num = sum.toString();                                       //преобразуем в строку
                    display.setText(num);                                       //возвращаем обратно в поле
                }
            }
        });
        buttonBackspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String num = display.getText();
                if (num.length() > 0)
                    display.setText(num.substring(0, num.length() - 1));   //удаляет последнюю введённую цифру
            }
        });
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                display.setText("");                                      //удаляет введённое число, операцию и
                operation = "";                                           //первое число на случай, если кнопка С
                number_1 = new BigDecimal(0);                         // была нажата при вводе второго числа
            }
        });
        buttonResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if(!display.getText().isEmpty()) {
                    number_2 = new BigDecimal(display.getText());
                    if(number_2.compareTo(new BigDecimal(0.0)) == 0.0) {           //проверка деления на ноль
                        display.setText("Деление на ноль невозможно.");
                        return;
                    }
                    BigDecimal result = new BigDecimal(0);
                    switch (operation) {
                        case "+":
                            result = number_1.add(number_2);
                            break;
                        case "-":
                            result = number_1.subtract(number_2);
                            break;
                        case "*":
                            result = number_1.multiply(number_2);
                            break;
                        case "/":
                            result = number_1.divide(number_2,16,4);
                            break;
                    }
                    String res = String.valueOf(result);
                    if(res.contains(".")) {
                        while(res.endsWith("0")) {
                            res = res.substring(0,res.length() - 1); //удаление лишних нулей в конце после точки
                        }
                        if(res.endsWith(".")) {
                            res = res.substring(0,res.length() - 1); //последующее удаление точки, если она в конце
                        }
                    }
                    display.setText(res);
                }
            }
        });
    }
}