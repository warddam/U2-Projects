import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class RPGCharacterGUI {


    public static void main(String[] args) {


        JPanel pane = new JPanel();
        JLabel label = new JLabel ("Enter Strength:");

        JTextField strengthText = new JTextField(10);


        JFrame frame = new JFrame("RPG Character");

        frame.setSize(350, 350);
        frame.setLocation(100, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1 = new JLabel(" Character Strength");

        JButton button = new
                JButton("Strength Ignite");
        frame.add(button);
        JButton button1 = new
                JButton("Energy Ignite");
        frame.add(button1);
        JButton button2 = new
                JButton("Dexterity Ignite");
        frame.add(button2);
        JButton button3 = new
                JButton("Spirit Ignite");
        frame.add(button3);
    //add elements





        frame.add(label1);
        frame.add(pane);

        frame.setVisible(true);


    }}




