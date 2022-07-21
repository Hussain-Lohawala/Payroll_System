//Project Name :Payroll System
//Authors:Vaibhav,Hussain, Partha
//Due Date :14/6/2021

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class login extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    login(){
//        setLayout(new BorderLayout());
//        t2 = new JPasswordField(10);
//        t1 = new JTextField(10);
//        JLabel l = new JLabel(new ImageIcon(ClassLoader.getSystemResource("icon\\defaultpic.png")));
//
//        b1 = new JButton("Submit", new ImageIcon(ClassLoader.getSystemResource("icon\\login.png")));
//        b2 = new JButton("Cancel", new ImageIcon(ClassLoader.getSystemResource("icon\\Cancel.png")));
//
//        b1.addActionListener(this);
//        b2.addActionListener(this);
//
//        JPanel p1,p2,p3,p4;
//        p1=new JPanel();
//        p2=new JPanel();
//        p3=new JPanel();
//        p4=new JPanel();
//
//
//
//        add(l,BorderLayout.WEST);
//
//
//        p2.add(new JLabel("User Name  "));
//        p2.add(t1);
//        p2.add(new JLabel("Password "));
//        p2.add(t2);
//        add(p2,BorderLayout.CENTER);
//
//        p4.add(b1);
//        p4.add(b2);
//
//        add(p4,BorderLayout.SOUTH);
        super("Login Page");
        setLayout(null);
        t1= new JTextField();
        t2 =new JPasswordField();
        getContentPane().setBackground(Color.gray);
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("iconupdate\\defaultpic.png"));
        Image i1 = c1.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel l = new JLabel(i2);
        l.setBounds(130,60,120,120);
        l1 = new JLabel("Username");
        l1.setFont(new Font("Arial",Font.BOLD,16));
        l2 = new JLabel("Password");
        l2.setFont(new Font("Arial",Font.BOLD,16));
        l1.setBounds(40,230,80,35);
        t1.setBounds(160,230,150,35);
        l2.setBounds(40,280,80,35);
        t2.setBounds(160,280,150,35);
        t1.setFont(new Font("Arial",Font.PLAIN,16));
        t2.setFont(new Font("Arial",Font.PLAIN,16));
        t1.setHorizontalAlignment(JTextField.CENTER);
        t2.setHorizontalAlignment(JPasswordField.CENTER);
        b1 = new JButton("Login");
        b2 = new JButton("Cancel");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.setBounds(50,360,100,40);
        b2.setBounds(225,360,100,40);
        b1.setBackground(Color.BLUE);
        b2.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);

        add(l);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);

        setSize(400,500);
        setLocation(600,170);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    //Action for "submit" button
    public void actionPerformed(ActionEvent ae){
        try
        {
            String msg= ae.getActionCommand();
            if(msg.equals("Login")) {
                conn c1 = new conn();
                String u = t1.getText();
                String v = t2.getText();

                //Sql query to match password
                String q = "select * from login where username='" + u + "' and password='" + v + "'";

                ResultSet rs = c1.s.executeQuery(q); // query execute
                if (rs.next()) {
                //To open project frame
                    new project().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    setVisible(false);
                }
            }
            else{
                System.exit(0);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args){
        new login();
    }
}
