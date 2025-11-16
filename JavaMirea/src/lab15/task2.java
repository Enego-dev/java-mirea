package lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 {
    static void main() {
        record Country(int number, String name) {
            @Override
            public String toString() {
                return name;
            }
        }

        var frame = new JFrame("Country description");
        frame.setResizable(false);
        frame.setSize(600, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);


        var comboBox = new JComboBox<Country>();
        comboBox.setSize(100, 20);
        comboBox.addItem(new Country(0, "Russia"));
        comboBox.addItem(new Country(1, "England"));
        comboBox.addItem(new Country(2, "China"));
        comboBox.addItem(new Country(3, "South Korea"));
        frame.getContentPane().add(comboBox);

        var label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setVerticalAlignment(SwingConstants.TOP);
        label.setSize(600, 500);
        label.setLocation(25, 25);
        label.setBackground(Color.RED);
        frame.getContentPane().add(label);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Country country = (Country) comboBox.getSelectedItem();
                var description = switch (country.number()) {
                    case 0 -> """
                            <html>Столица: Москва<br/>
                            Население: ~146 млн<br/>
                            Язык: русский<br/>
                            Валюта: рубль (RUB)<br/>
                            Достопримечательности: Красная площадь, Эрмитаж, Байкал<br/>
                            Интересное: самая большая страна в мире</html>""";
                    case 1 -> """
                            <html>Столица: Лондон<br/>
                            Население: ~56 млн<br/>
                            Язык: английский<br/>
                            Валюта: фунт стерлингов (GBP)<br/>
                            Достопримечательности: Биг-Бен, Тауэр, Стоунхендж<br/>
                            Интересное: родина футбола и The Beatles</html>""";
                    case 2 -> """
                            <html>Столица: Пекин<br/>
                            Население: ~1.4 млрд<br/>
                            Язык: китайский<br/>
                            Валюта: юань (CNY)<br/>
                            Достопримечательности: Великая стена, Запретный город, Терракотовая армия<br/>
                            Интересное: третья по площади страна</html>""";
                    case 3 -> """
                            <html>Столица: Сеул<br/>
                            Население: ~52 млн<br/>
                            Язык: корейский<br/>
                            Валюта: вона (KRW)<br/>
                            Достопримечательности: дворцы Чхандоккун, Кёнбоккун, Lotte World<br/>
                            Интересное: лидер в IT и K-pop индустрии</html>""";
                    default -> "Информация не найдена";
                };
                label.setText(description);
            }
        });
        comboBox.setSelectedItem(comboBox.getSelectedItem());
        frame.setVisible(true);
    }
}
