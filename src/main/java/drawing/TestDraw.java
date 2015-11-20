package drawing;

import javax.swing.*;

public class TestDraw {

    public static void main(String[] args) {

        DrawPanel drawPanel = new DrawPanel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(drawPanel);
        application.setSize(600, 600);
        application.setVisible(true);
    }

}
