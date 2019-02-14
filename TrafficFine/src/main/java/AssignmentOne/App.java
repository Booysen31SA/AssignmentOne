package AssignmentOne;


import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //
        // System.out.println( "Hello World!" );
        GUI frame = new GUI();
        frame.setVisible(true);

        //Allows the frame to be centered
        frame.setLocationRelativeTo(null);

        frame.setSize(550, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
