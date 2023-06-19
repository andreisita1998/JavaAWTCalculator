import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main{

        Frame f=new Frame("mini AWT calculator");
        Label l1=new Label("enter first number");
        Label l2=new Label("choose operation");
        Label l3=new Label("enter second number");
        Label l4 = new Label("Result is");
        TextField t1=new TextField();
        Choice ch = new Choice();
        TextField t2 = new TextField();
        Button b = new Button("Calculate");
        TextField t3 = new TextField();
        Main()
        {
            l1.setBounds(50,100,100,20);
            l2.setBounds(50,140,100,20);
            l3.setBounds(50,180,120,20);
            t1.setBounds(200,100,100,20);
            ch.setBounds(200,140,100,20);
            t2.setBounds(200,180,100,20);
            l4.setBounds(50,220,100,20);
            t3.setBounds(200,220,100,20);
            b.setBounds(50,200,100,20);
            ch.add("+"); ch.add("-");
            ch.add("*"); ch.add("/");
            f.add(l1); f.add(l2);
            f.add(l3); f.add(t1);
            f.add(ch); f.add(t2);
            f.add(l4); f.add(t3);
            f.add(b);
            f.setLayout(null);
            f.setVisible(true);
            f.setSize(400,350);
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (ch.getSelectedItem().equals("+")){
                        double result = (Double.parseDouble(t1.getText()) + Double.parseDouble(t2.getText()));
                        t3.setText(Double.toString(result));
                    }
                    else if(ch.getSelectedItem().equals("-"))
                    {
                        double result = (Double.parseDouble(t1.getText()) - Double.parseDouble(t2.getText()));
                        t3.setText(Double.toString(result));
                    }
                    else if(ch.getSelectedItem().equals("*"))
                    {
                        double result = (Double.parseDouble(t1.getText()) * Double.parseDouble(t2.getText()));
                        t3.setText(Double.toString(result));
                    }
                    else if(ch.getSelectedItem().equals("/"))
                    {
                        if(Double.parseDouble(t2.getText())!=0)
                        {
                            double result = (Double.parseDouble(t1.getText()) / Double.parseDouble(t2.getText()));
                            t3.setText(Double.toString(result));
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Cannot Divide by Zero!");
                        }

                    }
                }
            });
            f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    System.exit(0);
                }
            });
        }




    public static void main(String[] args) {
        new Main();
    }
}

