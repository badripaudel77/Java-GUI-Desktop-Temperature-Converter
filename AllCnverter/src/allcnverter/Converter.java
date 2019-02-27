package allcnverter;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Converter implements ActionListener {

    JFrame f;
    JTextField textInput = new JTextField(15);
    JTextField textOutput = new JTextField(15);

    JComboBox jb1, jb2;
    JLabel l1, l2, res, data;
    JButton click;

    public Converter() 
    {
        f = new JFrame("converter in Java Swing");
        data = new JLabel("Data  : ");
        res = new JLabel("Result is : ");

        click = new JButton("Convert Now");
        l1 = new JLabel("From");
        l2 = new JLabel("To");
        String fromValue[] = {"Celcius", "Kelvin", "Ferenheit"};
        String toValue[] = {"Celcius", "Kelvin", "Ferenheit"};
        jb1 = new JComboBox(fromValue);
        jb2 = new JComboBox(toValue);
        f.setSize(400, 400);

        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.add(l1);
        f.add(jb1);
        f.add(l2);
        f.add(jb2);
        System.out.println("");
        f.add(data);
        f.add(textInput);

        f.add(res);
        f.add(textOutput);
        click.setBounds(130, 100, 100, 40);
        f.add(click);
        click.addActionListener(this);
        click.setBackground(Color.green);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == click)//if button is clicked
        
        {
//          textInput.setBackground(Color.RED);

            textOutput.setBackground(Color.cyan);
                         textInput.setForeground(Color.blue);
                        
            String s1 = String.valueOf(jb1.getSelectedItem());
            String s2 = String.valueOf(jb2.getSelectedItem());
            if (s1.equals("Celcius") && s2.equals("Celcius")) {
                String input = textInput.getText();
                textOutput.setText(input);

            }
            if (s1.equals("Kelvin") && s2.equals("Kelvin")) {

                String input = textInput.getText();
                textOutput.setText(input);
            }
            if (s1.equals("Ferenheit") && s2.equals("Ferenheit")) {

                String input = textInput.getText();
                textOutput.setText(input);
            }
            
           if (s1.equals("Celcius") && s2.equals("Ferenheit")) {
               int input = Integer.parseInt(textInput.getText());
              double dataOutput=(double)((input*1.8)+32);
                textOutput.setText(dataOutput+" "); 
            }
           
           if (s1.equals("Celcius") && s2.equals("Kelvin")) {
               int input = Integer.parseInt(textInput.getText());
              double dataOutput=(double)((input+273.15));
                textOutput.setText(dataOutput+" "); 
            }
              if (s1.equals("Kelvin") && s2.equals("Celcius")) {
               int input = Integer.parseInt(textInput.getText());
              double dataOutput=(double)((input-273.15));
                textOutput.setText(dataOutput+" "); 
            }
            
                 if (s1.equals("Kelvin") && s2.equals("Ferenheit")) {
               int input = Integer.parseInt(textInput.getText());
              double dataOutput=(double)((input-459.66999));
                textOutput.setText(dataOutput+" "); 
            }
                     if (s1.equals("Ferenheit") && s2.equals("Celcius")) {
               int input = Integer.parseInt(textInput.getText());
              double dataOutput=(double)((input-32)/1.8);
                textOutput.setText(dataOutput+" "); 
            }
              
                             if (s1.equals("Ferenheit") && s2.equals("Kelvin")) {
               int input = Integer.parseInt(textInput.getText());
              double dataOutput=(double)((input+459.67)*5/9);
                textOutput.setText(dataOutput+" "); 
            }
                 
  
        }
    }

    public static void main(String[] args) {
        new Converter();//call
    
    }
}
