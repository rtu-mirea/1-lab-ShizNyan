package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class TakeE extends JFrame implements ActionListener {

    AddQ AQ = new AddQ();
    LoginWindow LW = new LoginWindow();
    int index = 0;
    public int right_answ;
    public int q_count;
    Question[] Q1 = new Question[3];
    Question q1 = new Question("Kek", "Kek");


    Registr R = new Registr();
    int NO=0;


    //Для того, чтобы впоследствии обращаться к содержимому текстовых полей, надо сделать их членами класса окна
    JTextField AnswField;
    JButton ok;
    JButton cancel;

    TakeE() {
        super("Добавить вопрос");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        System.out.println(AQ.indexQ);
        Q1[0] = q1;

        // Настраиваем первую горизонтальную панель (для ввода логина)
        Box box1 = Box.createHorizontalBox();
        JLabel QLabel = new JLabel("Вопрос:");
        JLabel QField = new JLabel(Q1[index].text);
        box1.add(QLabel);
        box1.add(Box.createHorizontalStrut(6));
        box1.add(QField);

        // Настраиваем вторую горизонтальную панель (для ввода пароля)
        Box box2 = Box.createHorizontalBox();
        JLabel AnswLabel = new JLabel("Ваш ответ:");
        AnswField = new JTextField(15);
        box2.add(AnswLabel);
        box2.add(Box.createHorizontalStrut(6));
        box2.add(AnswField);

        // Настраиваем третью горизонтальную панель (с кнопками)
        Box box3 = Box.createHorizontalBox();
        ok = new JButton("Ответить");
        cancel = new JButton("Отмена");
        box3.add(Box.createHorizontalGlue());
        box3.add(ok);
        box3.add(Box.createHorizontalStrut(12));
        box3.add(cancel);

        //Слушатели
        ok.addActionListener(this);
        cancel.addActionListener(this);

        // Уточняем размеры компонентов loginLabel.setPreferredSize(passwordLabel.getPreferredSize());
        // Размещаем три горизонтальные панели на одной вертикальной
        Box mainBox = Box.createVerticalBox();
        mainBox.setBorder(new EmptyBorder(12, 12, 12, 12));
        mainBox.add(box1);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box2);
        mainBox.add(Box.createVerticalStrut(17));
        mainBox.add(box3);
        setContentPane(mainBox);
        pack();
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok) {
            if (index<3) {
                LW.CurrU.getAnswer(Q1[index], AnswField.getText());
            }
        }
        if (e.getSource() == cancel) {
            dispose();
        }
    }

}
