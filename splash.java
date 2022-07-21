//Project Name :Payroll System
//Authors:vaibhav,Hussain, Partha
//Due Date :14/6/2021
import java.awt.*;
import javax.swing.*;

class splash{

    public static void main(String s[]){

        sframe f1 = new sframe("Payroll System");
        f1.setVisible(true); //show
        int i;
        int x=1;
        //For - Loop for screen transition
        for(i=2;i<=600;i+=4,x+=1){
            f1.setLocation((800-((i+x)/2) ),350-(i/2));
            f1.setSize(i+x,i);
            
            try{
                Thread.sleep(8);
            }catch(Exception e) { }
        }
        f1.setLocation(600,150);
        f1.setSize(530,550);

    }

}

class sframe extends JFrame implements Runnable{

    Thread t1;
    sframe(String s){
        super(s);

        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("iconupdate/ar.jpg"));
        Image i1 = c1.getImage().getScaledInstance(530, 550,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel m1 = new JLabel(i2);
        add(m1);
        t1= new Thread(this);
        t1.start();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public void run(){
        try{
            Thread.sleep(4000);
            this.setVisible(false);
            //To Open login frame
            login f1 = new login();
            
        }catch(Exception e){
            e.printStackTrace(); 
        }
    }
}

