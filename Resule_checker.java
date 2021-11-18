package mypackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Resule_checker extends  JFrame implements  ActionListener{
JLabel lbl_heading;
   JLabel lbl_iictmarks;
    JLabel lbl_oopmarks;
    JLabel lbl_pfmarks;
    JLabel lbl_engmarks;
    JLabel lbl_isemarks;
JTextField txtfield_iictmarks;
    JTextField txtfield_pfmarks;
    JTextField txtfield_oopmarks;
    JTextField txtfield_engmarks;
    JTextField txtfield_isemarks;
JButton btn_check_result;
 JLabel lbl_result;
 JButton btn_cancel;
    Resule_checker(){
btn_cancel=new JButton("Cancel");
btn_cancel.setBounds(50,350,130,40);
this.add(btn_cancel);
        lbl_heading=new JLabel("RESULT CHECK PORT ");
        lbl_heading.setBounds(30,0,370,90);
        lbl_heading.setFont(new Font("Algerian",Font.BOLD,35));
        lbl_heading.setForeground(Color.orange);
        lbl_result=new JLabel();
        lbl_result.setBounds(170,390,130,40);
        btn_check_result=new JButton("Check Result");
        btn_check_result.setBounds(210,350,130,40);
        lbl_iictmarks=new JLabel("IICT Marks");
        lbl_iictmarks.setBounds(20,100,100,40);
        lbl_iictmarks.setForeground(Color.white);
        lbl_pfmarks=new JLabel("PF Marks");
        lbl_pfmarks.setBounds(20,150,100,40);
  lbl_pfmarks.setForeground(Color.WHITE);
        lbl_oopmarks=new JLabel("OOP Marks");
        lbl_oopmarks.setBounds(20,200,100,40);
   lbl_oopmarks.setForeground(Color.WHITE);
        lbl_engmarks=new JLabel("ENG Marks");
        lbl_engmarks.setBounds(20,250,100,40);
       lbl_engmarks.setForeground(Color.WHITE);
        lbl_isemarks=new JLabel("ISE Marks");
        lbl_isemarks.setBounds(20,300,100,40);
lbl_isemarks.setForeground(Color.WHITE);
        txtfield_iictmarks=new JTextField();
        txtfield_iictmarks.setBounds(120,100,150,40);
        txtfield_pfmarks=new JTextField();
        txtfield_pfmarks.setBounds(120,150,150,40);
        txtfield_oopmarks=new JTextField();
        txtfield_oopmarks.setBounds(120,200,150,40);
        txtfield_engmarks=new JTextField();
        txtfield_engmarks.setBounds(120,250,150,40);
        txtfield_isemarks=new JTextField();
        txtfield_isemarks.setBounds(120,300,150,40);
       btn_cancel.addActionListener(this);
        this.add(lbl_heading);
        this.add(lbl_iictmarks);
        this.add(txtfield_iictmarks);
        this.add(lbl_pfmarks);
        this.add(txtfield_pfmarks);
        this.add(lbl_oopmarks);
        this.add(txtfield_oopmarks);
        this.add(lbl_engmarks);
        this.add(txtfield_engmarks);
        this.add(lbl_isemarks);
        this.add(txtfield_isemarks);
        this.add(btn_check_result);
        this.add(lbl_result);
        btn_check_result.addActionListener(this);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(null);
this.getContentPane().setBackground(Color.BLACK);
this.setVisible(true);
this.setSize(500,500);

    }
    public void actionPerformed(ActionEvent e){
if(e.getSource()==btn_check_result){
    String iict_marks=txtfield_iictmarks.getText();
    String pf_marks=txtfield_pfmarks.getText();
    String oop_marks=txtfield_oopmarks.getText();
    String eng_marks=txtfield_engmarks.getText();
    String ise_marks=txtfield_isemarks.getText();
int iict=Integer.parseInt(iict_marks);
int pf=Integer.parseInt(pf_marks);
int oop=Integer.parseInt(oop_marks);
int eng=Integer.parseInt(eng_marks);
int ise=Integer.parseInt(ise_marks);
int total=iict+pf+oop+eng+ise;
int t=total*100/500;
String grade;
if(t>=90){
    grade="A1";
}
  else  if(t<=90&&t>=80){
        grade="A";
    }
  else if(t<80&&t>=70){
        grade="B";}
    else if(t<70&&t>=50){
            grade="C";
        }
    else
        grade="F";

lbl_result.setText("YOU GOT "+ grade  +" GRADE");
lbl_result.setForeground(Color.white);
}
if(e.getSource()==btn_cancel){
    this.dispose();
    Student st=new Student();
}
    }
}
