package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Registration extends JFrame implements ActionListener {
  ImageIcon icon;
  JButton btn_regform;
    ImageIcon icon2;
    JButton btn_regform2;
    ImageIcon icon3;
    JButton btn_regform3;
    //heading for studnet teacher
JLabel label_student;
    JLabel label_teacher;
    JLabel label_exit;
JLabel lbl_heading;

    Registration(){
        //labels

        lbl_heading=new JLabel("UNIVERSITY MANAGEMENT SYSTEM");
        lbl_heading.setBounds(120,0,700,50);
        lbl_heading.setForeground(Color.orange);
        lbl_heading.setFont(new Font("ALGERIAN",Font.BOLD,40));
        this.add(lbl_heading);
label_student=new JLabel("STUDENT");
label_student.setBounds(53,390,200,200);
label_student.setFont(new Font("ALGERIAN",Font.BOLD,30));
        label_teacher=new JLabel("TEACHER");
        label_teacher.setBounds(370,390,200,200);
        label_teacher.setFont(new Font("ALGERIAN",Font.BOLD,30));
        label_exit=new JLabel("EXIT");
        label_exit.setBounds(690,390,200,200);
        label_exit.setFont(new Font("ALGERIAN",Font.BOLD,30));
        //image1
        btn_regform=new JButton();
    icon=new ImageIcon("registration.jpg");
   btn_regform.setBounds(20,70,280,300);
   btn_regform.setIcon(icon);
   this.add(btn_regform);
this.add(label_student);
   //2 pic
        btn_regform2=new JButton();
        icon2=new ImageIcon("regis.jfif");
        btn_regform2.setBounds(330,70,280,300);
        btn_regform2.setIcon(icon2);
        this.add(btn_regform2);
        this.add(label_teacher);
//pic 3
       btn_regform3=new JButton();
        icon3=new ImageIcon("cross.jfif");
        btn_regform3.setBounds(630,70,280,300);
        btn_regform3.setIcon(icon3);
        this.add(btn_regform3);
        this.add(label_exit);
        this.getContentPane().setBackground(Color.black);
        btn_regform.addActionListener(this);
        btn_regform2.addActionListener(this);
        btn_regform3.addActionListener(this);

   this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(940,600);
        this.setVisible(true);}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_regform){
            this.dispose();
            Student s=new Student();
        }
        if (e.getSource()==btn_regform2){
            this.dispose();
            Teacher t=new Teacher();
        }
        if(e.getSource()==btn_regform3){
            this.dispose();
            Exit ex=new Exit();
        }
    }
}
