package com.company;

import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class theMachine {

    private JButton deencode;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JPanel Main;

    public theMachine() {
        deencode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        textArea1.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {

            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {

            }
        });
        textArea2.addContainerListener(new ContainerAdapter() {
            @Override
            public void componentAdded(ContainerEvent e) {
                super.componentAdded(e);
            }
        });
    }

    public static int getRandomCipher() {
        return (int) (Math.random() * 2147483647);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("theMachine");
        frame.setContentPane(new theMachine().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        for (; ; ) {

            Scanner console = new Scanner(System.in); // Мама мыла раму.
            String text = console.nextLine();
            String encmsg = "";
            String decmsg = "";
            int cipher = getRandomCipher();


            // System.out.print("Initial message: ");
            // System.out.println(text);


            for (int i = 0; i < text.length(); i++)
                encmsg = encmsg + (char) (text.charAt(i) ^ cipher);
            System.out.print("Encoded message: ");
            System.out.println(encmsg);

            String enctext = console.nextLine();
            for (int i = 0; i < text.length(); i++)
                decmsg = decmsg + (char) (enctext.charAt(i) ^ cipher);
            System.out.print("Decoded message: ");
            System.out.println(decmsg);
        }
    }
}