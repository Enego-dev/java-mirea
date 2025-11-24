package lab15;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Calculator {
    record DisplayPanel(JPanel displayPanel, JLabel expressionLabel, JLabel answerLabel) {}
    record ButtonsPanel(JPanel buttonsPanel, JButton[] buttons) {}
    record CalculatorWindow(DisplayPanel displayPanel, ButtonsPanel buttonsPanel) {}

    static void main() {
        var calculatorWindow = createWindow();

        var sb = new StringBuilder();

        for (var button : calculatorWindow.buttonsPanel.buttons) {
            var text = button.getText();

            // ОДИН ActionListener на кнопку
            button.addActionListener(e -> {
                if (!calculatorWindow.displayPanel.answerLabel.getText().isEmpty()) {
                    calculatorWindow.displayPanel.answerLabel.setText("");
                }

                if (text.matches("[/*+-]")) {
                    IO.println("нашел математическую операцию");

                    // Проверяем, можно ли добавить оператор
                    if (sb.isEmpty()) {
                        return; // Нельзя начинать с оператора
                    }

                    String currentText = sb.toString();
                    // Проверяем, не заканчивается ли строка уже на оператор или точку
                    if (currentText.endsWith(" ") || currentText.matches(".*[/*+\\-.]$")) {
                        return; // Нельзя добавлять оператор после другого оператора или точки
                    }

                    sb.append(" ").append(text).append(" ");

                } else if (text.matches("[0-9.]")) {
                    IO.println("нашел цифру или точку");

                    // Особые проверки для точки
                    if (text.equals(".")) {
                        String currentText = sb.toString();

                        // Если строка пустая, добавляем "0." вместо просто "."
                        if (sb.isEmpty()) {
                            sb.append("0.");
                            return;
                        }

                        // Проверяем, есть ли уже точка в текущем числе
                        // Разбиваем строку по пробелам и берем последний элемент (текущее число)
                        String[] parts = currentText.split(" ");
                        String lastPart = parts[parts.length - 1];

                        // Если в последнем числе уже есть точка, не добавляем новую
                        if (lastPart.contains(".")) {
                            return;
                        }

                        // Проверяем, не является ли последний символ оператором
                        if (currentText.endsWith(" ")) {
                            // Если после оператора сразу точка, добавляем "0."
                            sb.append("0.");
                            return;
                        }
                    }

                    sb.append(text);

                } else if (text.equals("=")) {
                    IO.println("нашел равно");
                    if (sb.length() % 2 == 0) return;
                    calculatorWindow.displayPanel.answerLabel.setText("= " + calculateExpression(sb.toString()));
                    sb.setLength(0);
                    return; // важно - не обновляем expressionLabel
                }

                calculatorWindow.displayPanel.expressionLabel.setText(sb.toString());
            });
            /*button.addActionListener(e -> {
                if (!calculatorWindow.displayPanel.answerLabel.getText().isEmpty()) {
                    calculatorWindow.displayPanel.answerLabel.setText("");
                }

                if (text.matches("[/*+-]")) {
                    IO.println("нашел математическую операцию");
                    if (sb.isEmpty() || sb.toString().endsWith(" ")) return;
                    sb.append(" ").append(text).append(" ");

                } else if (text.matches("[0-9.]")) {
                    IO.println("нашел цифру или точку");
                    sb.append(text);

                } else if (text.equals("=")) {
                    IO.println("нашел равно");
                    if (sb.length() % 2 == 0) return;
                    calculatorWindow.displayPanel.answerLabel.setText("= " + calculateExpression(sb.toString()));
                    sb.setLength(0);
                    return; // важно - не обновляем expressionLabel
                }

                calculatorWindow.displayPanel.expressionLabel.setText(sb.toString());
            });*/
        }
    }

    private static String calculateExpression(String expression){
        return new CalculatorSequence(expression).calculate();
    }

    private static CalculatorWindow createWindow(){
        var frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        //frame.setResizable(false);
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().setBackground(new Color(200, 200, 200));
        var gbc = new GridBagConstraints();

        var displayPanel = createDisplayPanel();
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.gridwidth = 1; gbc.gridheight = 1;
        gbc.weightx = 1.0; gbc.weighty = 0.4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 2, 5);
        frame.add(displayPanel.displayPanel, gbc);

        var buttonsPanel = createButtonsPanel();
        gbc.gridy = 1;
        gbc.weighty = 0.6; // 60% высоты окна
        gbc.insets = new Insets(3, 5, 5, 5); // другие отступы
        frame.add(buttonsPanel.buttonsPanel, gbc);

        frame.setVisible(true);
        return new CalculatorWindow(displayPanel, buttonsPanel);
    }

    private static DisplayPanel createDisplayPanel(){
        var panel = new JPanel(new GridBagLayout());
        var gbcPanel = new GridBagConstraints();

        var ex = createExpressionLabel();
        gbcPanel.gridx = 0; gbcPanel.gridy = 0;
        gbcPanel.gridwidth = 1; gbcPanel.gridheight = 1;
        gbcPanel.weightx = 1; gbcPanel.weighty = 0.75f;
        gbcPanel.fill = GridBagConstraints.BOTH;
        gbcPanel.anchor = GridBagConstraints.SOUTHWEST;
        gbcPanel.insets = new Insets(5, 5, 5, 5);

        panel.add(ex, gbcPanel);

        var answer = createAnswerLabel();
        gbcPanel.gridy = 1;
        gbcPanel.weighty = 0.25; // 25% высоты
        gbcPanel.anchor = GridBagConstraints.SOUTHEAST;
        gbcPanel.insets = new Insets(2, 10, 10, 10);

        panel.add(answer, gbcPanel);
        return new DisplayPanel(panel, ex, answer);
    }

    private static JLabel createExpressionLabel(){
        var expression = new JLabel();
        expression.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        expression.setOpaque(true);
        expression.setHorizontalAlignment(SwingConstants.LEFT);
        expression.setVerticalAlignment(SwingConstants.BOTTOM);
        return expression;
    }

    private static JLabel createAnswerLabel(){
        var answer = new JLabel();
        answer.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        answer.setOpaque(true);
        answer.setHorizontalAlignment(SwingConstants.RIGHT);
        answer.setVerticalAlignment(SwingConstants.BOTTOM);
        return answer;
    }

    private static ButtonsPanel createButtonsPanel(){
        var panel = new JPanel(new GridLayout(4, 4, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        var names = new String[] {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"};

        var buttons = new ArrayList<JButton>(15);

        for (var text : names){
            var button = new JButton(text);
            panel.add(button);
            buttons.add(button);
        }

        return new ButtonsPanel(panel, buttons.toArray(new JButton[0]));
    }
}
