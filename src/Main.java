import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(1048,540);
        frame.add(new Board());
        frame.setVisible(true);
    }
}