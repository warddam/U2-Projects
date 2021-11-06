import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class RPGCharacterGUI {


    public static void main(String[] args) {


        JPanel pane = new JPanel();
        JLabel label = new JLabel ("Enter Strength:");

        JTextField strengthText = new JTextField(10);


        JFrame frame = new
                JFrame("RPG Character");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 350);
        JButton button = new
                JButton("Strength Ignite");
        JButton button1 = new
                JButton("Energy Ignite");
        JButton button2 = new
                JButton("Dexterity Ignite");
        JButton button3 = new
                JButton("Spirit Ignite");



        pane.add(button);
        pane.add(button1);
        pane.add(button2);
        pane.add(button3);

        pane.setVisible(true);

    }}




