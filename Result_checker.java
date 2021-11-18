package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Result_checker extends JFrame implements ActionListener {
JButton btn_check;
    JLabel label_total_days;
    JLabel label_present_day;
    JTextField textField_total_days;
    JTextField textField_present_days;
    JLabel lbl_attendance;
    Result_checker() {
         lbl_attendance=new JLabel("");
        lbl_attendance.setBounds(80,320,150,50);
  btn_check=new JButton("Check");
  btn_check.setBounds(180,290,90,50);
        textField_total_days=new JTextField();
       textField_total_days.setBounds(220,120,50,40);
        textField_present_days=new JTextField();
        textField_present_days.setBounds(220,240,50,40);
        label_total_days=new JLabel("Total days");
        label_total_days.setBounds(60,90,100,100);
   label_total_days.setFont(new Font("Arial",Font.BOLD,18));
        label_present_day=new JLabel("Attended days");
        label_present_day.setBounds(60,200,150,100);
        label_present_day.setFont(new Font("Arial",Font.BOLD,18));
        this.add(label_total_days);
        this.add(textField_total_days);
        this.add(label_present_day);
        this.add(textField_present_days);
        this.add(btn_check);
        this.add(lbl_attendance);
        btn_check.addActionListener(this);
        this.getContentPane().setBackground(Color.pink);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn_check){


        String total_days=textField_total_days.getText();
        String present_days=textField_present_days.getText();
        int t_days=Integer.parseInt(total_days);
        int p_days=Integer.parseInt(present_days);
        int attendace_per=(p_days*100)/t_days;
            lbl_attendance.setText("your attendance is "+ attendace_per+" % ");

        }
    }
}