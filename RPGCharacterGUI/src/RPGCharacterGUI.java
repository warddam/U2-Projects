
    import javax.swing.*;
        import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;




public class RPGCharacterGUI {
        public static JTextField inputNumber2 = new JTextField("");
        public static JTextField inputNumber = new JTextField("");
        public static JLabel finalLabel = new JLabel("");
static JFrame f;
static JLabel l;

{

}

    public static void main(String[] args) {
            JLabel numberLabel = new JLabel("Number input: ");
            JLabel numberLabel2 = new JLabel("Number input 1");
f = new JFrame("label");
l = new JLabel();
l.setText("label text");

JPanel panel = new JPanel();
panel.add(l);
f.add(panel);
f.setSize(325, 352);
f.show();

        JButton xButt = new JButton("x");
        JButton subButt = new JButton("-");
        JButton addButt = new JButton("+");
        JButton divButt = new JButton("/");

        panel.add(inputNumber);
        panel.add(xButt);
        panel.add(divButt);
        panel.add(subButt);
        panel.add(addButt);

        String name;
        String input;
        int strength;
        int energy;

    }
}