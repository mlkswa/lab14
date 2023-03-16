import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

class Form extends Frame{
    Form(String name) {
        super(name);
        Label labelA = new Label("a");
        Label labelB = new Label("b");
        Label labelSum = new Label("sum");
        TextField tb = new TextField(15);
        TextField tb1 = new TextField(15);
        TextField tsum = new TextField(15);
        Button button = new Button("Calculate");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int sum = Integer.parseInt(tb.getText()) + Integer.parseInt(tb1.getText());
                    tsum.setText(Integer.toString(sum));
                }
                catch (NumberFormatException ne){
                    tsum.setText("Error");
                }
            }
        });
        Button button1 = new Button("Clear");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tb.setText("");
                tb1.setText("");
                tsum.setText("");
            }
        });
        setLayout(null);
        labelA.setBounds(70, 40, 30, 20);
        labelB.setBounds(70, 80, 30, 20);
        labelSum.setBounds(70, 120, 30, 20);
        tb.setBounds(120,40,80,20);
        tb1.setBounds(120,80,80,20);
        tsum.setBounds(120,120,80,20);
        button.setBounds(120,160,80,20);
        button1.setBounds(120,180,80,20);

        add(labelA);
        add(labelB);
        add(labelSum);
        add(tb);
        add(tb1);
        add(tsum);
        add(button);
        add(button1);
        setSize(300, 300);
        setVisible(true);
        setTitle("Sum of two digits");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        new Form("Calc");
    }
}