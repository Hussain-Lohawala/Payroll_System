//Project Name :Payroll System
//Authors:vaibhav,Hussain, Partha
//Due Date :14/6/2021
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class project extends JFrame implements ActionListener {

    project(){

        setSize(2000,1100);
        //To set background color
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("iconupdate//fp1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
        setTitle("Payroll System");


        // For creating menu bar
        JMenuBar mb = new JMenuBar();
//        mb.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
//        mb.setLayout(new GridLayout(0,1));
//        mb.setAlignmentX(Component.RIGHT_ALIGNMENT);

        mb.setBackground(new Color(39,40,44));
//        mb.setSize(1200,200);

        mb.setPreferredSize(new Dimension(1020, 60));



        setJMenuBar(mb);
        JMenu m1 = new JMenu("  Master  ");


        //For text color
        m1.setForeground(Color.WHITE);
        m1.setFont(new Font("opemsans",Font.BOLD,15));
        m1.addSeparator();


        JMenuItem t1 = new JMenuItem("New Employee");
        t1.setForeground(Color.WHITE);
        t1.setBackground(new Color(39,40,44));
        t1.setFont(new Font("opensans",Font.BOLD,15));
        // For creating shortcut key
        t1.setMnemonic('N');
        t1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        t1.setIcon(new ImageIcon(ClassLoader.getSystemResource("Icons/New.png")));



        JMenuItem t3 = new JMenuItem("Salary");
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(39,40,44));
        t3.setFont(new Font("opensans",Font.BOLD,15));
        t3.setMnemonic('S');
        t3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/schedreport.png")));
        t3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));



        JMenuItem t4 = new JMenuItem("List Employee");
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(39,40,44));
        t4.setFont(new Font("opensans",Font.BOLD,15));
        t4.setMnemonic('L');
        t4.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/newinvoice.png")));
        t4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));




        m1.add(t1);
        //m1.add(t2);
        m1.add(t3);
        m1.add(t4);
        mb.add(m1);

        t1.addActionListener(this);
        //t2.addActionListener(this);
        t3.addActionListener(this);
        t4.addActionListener(this);

        JMenu edit =new JMenu("  Update  ");
        edit.setForeground(Color.WHITE);
        edit.addSeparator();
        edit.setFont(new Font("opemsans",Font.BOLD,15));

        mb.add(edit);
        JMenuItem s1 = new JMenuItem("Update Salary");
        s1.setForeground(Color.WHITE);
        s1.setBackground(new Color(39,40,44));
        s1.setFont(new Font("opensans",Font.BOLD,15));
        s1.setMnemonic('U');
        s1.setIcon(new ImageIcon(ClassLoader.getSystemResource("Icons/EditOpen.png")));
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));

        edit.add(s1);

        JMenuItem s2 = new JMenuItem("Update Employee");
        s2.setForeground(Color.WHITE);
        s2.setBackground(new Color(39,40,44));
        s2.setFont(new Font("opensans",Font.BOLD,15));
        s2.setMnemonic('p');
        s2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/empreport.png")));
        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));


        edit.add(s2);
        JMenuItem s3 = new JMenuItem("Take Attendence");
        s3.setForeground(Color.WHITE);
        s3.setBackground(new Color(39,40,44));
        s3.setFont(new Font("opensans",Font.BOLD,15));
        s3.setMnemonic('T');
        s3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/EXPENSE.PNG")));
        s3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));


        edit.add(s3);

        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        JMenu rep =new JMenu("  Reports  ");
        rep.setForeground(Color.WHITE);
        rep.setFont(new Font("opemsans",Font.BOLD,15));
        rep.addSeparator();

        mb.add(rep);
        JMenuItem p1 = new JMenuItem("Generate PaySlip");
        p1.setForeground(Color.WHITE);
        p1.setBackground(new Color(39,40,44));


        p1.setFont(new Font("opensans",Font.BOLD,15));
        p1.setMnemonic('P');
        p1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/payments.png")));
        p1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));

        rep.add(p1);
        JMenuItem p2 = new JMenuItem("List Attendence");
        p2.setForeground(Color.WHITE);
        p2.setBackground(new Color(39,40,44));
        p2.setFont(new Font("opensans",Font.BOLD,15));
        p2.setMnemonic('L');
        p2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/empreport.png")));
        p2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));

        rep.add(p2);
        p1.addActionListener(this);
        p2.addActionListener(this);

        JMenu util =new JMenu("  Utilities  ");
        util.setForeground(Color.WHITE);
        util.setFont(new Font("opemsans",Font.BOLD,15));
        util.addSeparator();

        mb.add(util);
        JMenuItem u1 = new JMenuItem("Notepad");
        u1.setForeground(Color.WHITE);
        u1.setBackground(new Color(39,40,44));


        u1.setIcon(new ImageIcon(ClassLoader.getSystemResource("Icons/New.png")));


        u1.setFont(new Font("opensans",Font.BOLD,15));
        u1.setMnemonic('o');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));

        util.add(u1);
        JMenuItem u2 = new JMenuItem("Calculator");
        u2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/calc.png")));
        u2.setBackground(new Color(39,40,44));
        u2.setForeground(Color.WHITE);
        u2.setFont(new Font("opensans",Font.BOLD,15));
        u2.setMnemonic('C');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));





        util.add(u2);
        JMenuItem u3 = new JMenuItem("Web Browser");
        u3.setIcon(new ImageIcon(ClassLoader.getSystemResource("iconupdate/ff.png")));
        u3.setForeground(Color.WHITE);
        u3.setBackground(new Color(39,40,44));
        u3.setFont(new Font("opensans",Font.BOLD,15));
        u3.setMnemonic('E');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));

        util.add(u3);

        u1.addActionListener(this);
        u2.addActionListener(this);
        u3.addActionListener(this);



        JMenu m8=new JMenu("  Exit  ");
        m8.setForeground(Color.WHITE);
        m8.setFont(new Font("opemsans",Font.BOLD,15));
        m8.addSeparator();

//        m8.setBackground(Color.RED);
        mb.add(m8);
        JMenuItem m8i1=new JMenuItem("Exit");
        m8.add(m8i1);
        m8i1.setForeground((Color.WHITE));
        m8i1.setBackground(new Color(39,40,44));
        m8i1.setFont(new Font("opensans", Font.BOLD, 15));
        m8i1.setMnemonic('X');
        m8i1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/exit.PNG")));
        m8i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        m8i1.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae){
        String msg= ae.getActionCommand();
        //elif tree to match options and call
        if(msg.equals("New Employee"))
            new New_Employee().setVisible(true);
        else if(msg.equals("List Employee"))
            new List_Employee().setVisible(true);
        else if(msg.equals("Update Employee"))
            new Update_employee().setVisible(true);
        else if(msg.equals("Salary"))
            new Salary().setVisible(true);
        else if(msg.equals("Update Salary"))
            new Update_salary().setVisible(true);
        else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){ }
        }
        else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){ }
        }
        else if(msg.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            }catch(Exception e){ }
        }
        else if(msg.equals("Take Attendence")){
            new TakeAttendence().setVisible(true);
        }
        else if(msg.equals("Exit"))
            System.exit(0);
        else if(msg.equals("Generate PaySlip"))
            new pay_slip().setVisible(true);
        else if(msg.equals("List Attendence"))
            new List_Attendence().setVisible(true);
    }

    public static void main(String[] args){
        new project().setVisible(true);
    }

}
