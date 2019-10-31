import javax.swing.*;

public class Calculator extends JFrame {
    public Calculator() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200,150,280,280);
        add(new DisplayPanel());
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Calculator();
    }
}
