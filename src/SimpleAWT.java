import java.awt.*;
public class SimpleAWT extends Frame{
    public SimpleAWT(){

        Frame frame = new Frame();
        Label label = new Label("a");
        TextField textField = new TextField();
        frame.add(label);
        frame.add(textField);
        frame.setSize(400,250);
        frame.setTitle("Sum of two digits");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleAWT simpleAWT = new SimpleAWT();
    }
}
