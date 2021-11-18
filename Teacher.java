package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.ActiveEvent;
public class Teacher extends
        JFrame implements  ActionListener{
   JButton btn_sessional_marks;
    JButton btn_timetable;
    JButton btn_exit;
JLabel lbl;
    Teacher(){
        lbl=new JLabel("TEACHERS PORTAL ");
        lbl.setFont(new Font("algerian",Font.ITALIC,29));
        lbl.setForeground(Color.BLACK);
        lbl.setBounds(200,0,300,500);
   btn_sessional_marks=new JButton("Sessional Marks Distribution");
  btn_sessional_marks.setBounds(50,50,150,100);
  btn_sessional_marks.setBackground(Color.BLACK);
  btn_sessional_marks.setFont(new Font("Akaya Telivigala",Font.ITALIC,15));
  btn_sessional_marks.setForeground(Color.orange);
  btn_timetable=new JButton("TimeTable");
        btn_timetable.setBackground(Color.BLACK);
        btn_timetable.setFont(new Font("Akaya Telivigala",Font.ITALIC,15));
        btn_timetable.setForeground(Color.orange);
   btn_timetable.setBounds(50,200,150,100);
   btn_exit=new JButton("Exit");
        btn_exit.setBackground(Color.BLACK);
        btn_exit.setFont(new Font("Akaya Telivigala",Font.ITALIC,15));
        btn_exit.setForeground(Color.orange);
   btn_exit.setBounds(50,350,150,100);
        this.add(lbl);
   this.add(btn_sessional_marks);
  this.add(btn_timetable);
  this.add(btn_exit);
btn_sessional_marks.addActionListener(this);
btn_timetable.addActionListener(this);
btn_exit.addActionListener(this);
  this.getContentPane().setBackground(Color.PINK);
  this.setLayout(null);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn_timetable){
            this.dispose();
            Check_timetable c=new Check_timetable();
        }
        if(e.getSource()==btn_sessional_marks){
            this.dispose();
            Sessional_Marks s=new Sessional_Marks();
        }
   if(e.getSource()==btn_exit){
       this.dispose();
       Exit ex=new Exit();
   }
    }
}
