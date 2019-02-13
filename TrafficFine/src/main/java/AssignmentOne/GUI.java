package AssignmentOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{

    private JTextField licenseField;
    private JLabel licenseNumbertxt;
    private JTextField vehicleField;
    private JTextField fineAmountField;
    private JButton Submit;
    private JLabel message;
    private JPanel rootPane;

    private boolean isFieldEmpty = false;



    public GUI() {
        setTitle("A Simple Fine Program");
        add(rootPane);

        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Submit Button
                isField();
                if(!isFieldEmpty){
                    message.setText("Fill in Fields");
                }
                else{
                    Fine fineSubmit = new Fine(licenseField.getText(), vehicleField.getText(), Double.parseDouble(fineAmountField.getText()));
                    message.setText("Submitted");
                    licenseField.setText("");
                    vehicleField.setText("");
                    fineAmountField.setText("");


                }
            }
        });
    }


    public void isField(){

        if(licenseField.getText().length() > 0 && vehicleField.getText().length() > 0 && fineAmountField.getText().length() > 0){
            isFieldEmpty = true;
        }

    }

}
