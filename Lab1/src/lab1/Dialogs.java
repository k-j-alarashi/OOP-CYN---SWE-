package lab1;

import javax.swing.JOptionPane;

public class Dialogs {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter Your Name : ");
        JOptionPane.showMessageDialog(null, "Hello "+name);
    }
}