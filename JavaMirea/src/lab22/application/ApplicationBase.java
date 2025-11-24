package lab22.application;

import lab22.CalculatorRPN;

import javax.swing.*;
import java.awt.*;

public class ApplicationBase {
    static void main() {
        // Создание основного окна
        JFrame frame = new JFrame("MyCalculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);

        // Создание и настройка текстовой области
        JTextArea display = new JTextArea(2, 20);
        display.setEditable(false);
        display.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
        display.setMargin(new Insets(10, 10, 10, 10));

        var sb = new StringBuilder();
        var model = new CalculatorRPN();
        var view = new ApplicationView(display);
        var controller = new ApplicationController(model, view);

        // Создание панели для кнопок
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Массив подписей кнопок
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "+", "=",
                " ", " ", " ", " "  // Кнопка пробела и три пустые кнопки для выравнивания
        };

        // Создание кнопок
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
            button.setPreferredSize(new Dimension(80, 60));
            buttonPanel.add(button);

            button.addActionListener(e -> {
                var buttonText = button.getText();

                if (!buttonText.equals("=")) {
                    // Проверки для математических операторов
                    if (buttonText.matches("[/*+-]")) {
                        if (sb.isEmpty()) {
                            return; // Нельзя начинать с оператора
                        }

                        String currentText = sb.toString();
                        // Проверяем, не заканчивается ли строка уже на оператор ИЛИ пробел перед оператором
                        if (currentText.matches(".*[/*+\\-]$") || currentText.endsWith(" ")) {
                            return; // Нельзя добавлять оператор после другого оператора или после пробела
                        }

                        // Добавляем оператор с пробелами для парсера
                        sb.append(" ").append(buttonText).append(" ");

                    } else if (buttonText.equals(".")) {
                        // Проверки для точки
                        if (sb.isEmpty()) {
                            sb.append("0."); // Если пусто, добавляем "0."
                        } else {
                            String currentText = sb.toString();
                            // Находим последнее число (разделяем по операторам и пробелам)
                            String[] parts = currentText.split("[/*+\\-\\s]");
                            String lastNumber = parts[parts.length - 1];

                            // Если в последнем числе уже есть точка, не добавляем новую
                            if (lastNumber.contains(".")) {
                                return;
                            }

                            // Если последний символ - оператор или пробел, добавляем "0."
                            if (currentText.matches(".*[/*+\\-\\s]$")) {
                                sb.append("0.");
                            } else {
                                sb.append(buttonText);
                            }
                        }

                    } else if (buttonText.equals(" ")) {
                        // Проверки для пробела
                        if (sb.isEmpty()) {
                            return; // Нельзя начинать с пробела
                        }

                        String currentText = sb.toString();
                        // Не добавляем пробел, если последний символ уже пробел или оператор
                        if (!currentText.endsWith(" ") && !currentText.matches(".*[/*+\\-]$")) {
                            sb.append(" ");
                        }

                    } else if (buttonText.matches("[0-9]")) {
                        // Для цифр - просто добавляем
                        sb.append(buttonText);
                    }

                    controller.updateView(sb.toString());
                }

                if (buttonText.equals("=")) {
                    try {
                        controller.calculate(sb.toString());
                        var ans = controller.getAnswer();
                        controller.updateView(ans);
                        sb.setLength(0);
                    } catch (InvalidExpressionException ex) {
                        controller.updateView("Уравнение содержит ошибку!");
                        sb.setLength(0);
                    }
                }
            });
            /*button.addActionListener(e -> {
                var buttonText = button.getText();
                if (!buttonText.contains("=")){
                    sb.append(buttonText);
                    controller.updateView(sb.toString());
                }

                if (buttonText.contains("=")){
                    try {
                        controller.calculate(sb.toString());
                        var ans = controller.getAnswer();
                        controller.updateView(ans);
                        sb.setLength(0);
                    } catch (InvalidExpressionException ex){
                        controller.updateView("Уравнение содержит ошибку!");
                        sb.setLength(0);
                    }
                }
            });*/
        }

        // Компоновка интерфейса
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(display, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Отступы вокруг компонентов
        ((JComponent) frame.getContentPane()).setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        frame.setVisible(true);
    }
}
