package AssignmentOne;


import javax.swing.*;

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
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        frame.setVisible(true);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
