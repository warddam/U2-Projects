import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;



public class RPGCharacterGUI {


    public static void main(String[] args) {


            int energy;
            int dexterity;
            int spirit;


        JTextField input = new JTextField();

        JPanel panel = new JPanel();
        JLabel label = new JLabel ("Enter Strength:");

        JTextField strengthText = new JTextField(5);
              strengthText.setBounds(200, 50, 125, 25);
        strengthText.getText();


        JTextField energyText = new JTextField(5);
        energyText.setBounds(200, 75, 125, 25);
        energyText.getText();

        JTextField dexterityText = new JTextField(5);
        dexterityText.setBounds(200, 100, 125, 25);
        dexterityText.getText();

        JTextField spiritText = new JTextField(5);
         spiritText.setBounds(200, 125, 125, 25);
        spiritText.getText();


        JFrame frame = new JFrame("RPG Character");

        frame.setSize(350, 350);
        frame.setLocation(100, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1 = new JLabel(" Character Strength");
        label1.setBounds(50,50,200,30);

        JLabel label2 = new JLabel(" Character Energy");
        label2.setBounds(50,75,250,35);

        JLabel label3 = new JLabel(" Character Dexterity");
        label3.setBounds(50,100,250,35);

        JLabel label4 = new JLabel(" Character Spirit");
        label4.setBounds(50,125,250,35);


        JButton button1 = new
                JButton("Ignite Calculate");
        button1.setBounds(200, 200, 125, 25);
        frame.add(button1);



    //add elements





        frame.add(strengthText);
        frame.add(energyText);
        frame.add(dexterityText);
        frame.add(spiritText);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(panel);

        frame.setVisible(true);


            }



private class b1 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button1 = new
                JButton("Ignite Calculate");
        button1.setBounds(200, 200, 125, 25);



        button1.addActionListener(new b1());


    }
}}