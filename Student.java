package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student extends JFrame  implements ActionListener {
    JButton btn_result_Checker;
    JButton btn_attendance;
    JButton btn_registration;
    JButton btn_exit;
JLabel lbl_heading;

    Student() {

        lbl_heading =new JLabel("STUDENTS PORTAL ");
        lbl_heading.setBounds(30,20,650,70);
        lbl_heading.setFont(new Font("ALGERIAN",Font.BOLD,60));
        lbl_heading.setForeground(Color.BLACK);
        this.add(lbl_heading);
        btn_attendance = new JButton("Attendance");
        btn_attendance.setBackground(Color.BLACK);
        btn_attendance.setForeground(Color.WHITE);
        btn_attendance.setBounds(160, 120, 190, 100);
        btn_result_Checker = new JButton("Result");
btn_result_Checker.setBackground(Color.BLACK);
        btn_result_Checker.setBounds(160, 250, 190, 100);
        btn_result_Checker.setForeground(Color.WHITE);
        btn_registration = new JButton("Registration");
   btn_registration.setBackground(Color.BLACK);
        btn_registration.setForeground(Color.WHITE);
        btn_registration.setBounds(160, 380, 190, 100);
        btn_exit = new JButton("Close");
        btn_exit.setForeground(Color.WHITE);
        btn_exit.setBackground(Color.BLACK);
        btn_exit.setBounds(160, 500, 190, 100);
        this.add(btn_attendance);
        this.add(btn_result_Checker);
        this.add(btn_registration);
        this.add(btn_exit);
        btn_attendance.addActionListener(this);
        btn_result_Checker.addActionListener(this);
        btn_registration.addActionListener(this);
        btn_exit.addActionListener(this);
        this.getContentPane().setBackground(Color.pink);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 700);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_attendance) {
            this.dispose();
            Attendance_check ac = new Attendance_check();
        } else if (e.getSource()==btn_result_Checker){
            this.dispose();
            Resule_checker rc=new Resule_checker();;

        }
        else if(e.getSource()==btn_registration){
            this.dispose();
            Refistration_Form rf=new Refistration_Form();
        }
        else if( e.getSource()==btn_exit){
            this.dispose();
            Exit ex=new Exit();
        }
    }
}