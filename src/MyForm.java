import java.awt.*;

public class MyForm extends Frame {
    MyForm(String name) {
        super(name);
        Frame frame = new Frame();
        Label labelA = new Label("a");
        TextField textFieldA = new TextField();
        frame.add(labelA);
        frame.add(textFieldA);

        Label labelB = new Label("b");
        Label labelSum = new Label("sum");
        setLayout(null);
        labelA.setBounds(10, 40, 30, 20);
        labelB.setBounds(10, 80, 30, 20);
        labelSum.setBounds(10, 120, 30, 20);

        add(labelA);
        add(labelB);
        add(labelSum);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyForm("MyApp");
    }
}
