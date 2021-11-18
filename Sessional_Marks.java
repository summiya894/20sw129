package mypackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Sessional_Marks extends JFrame implements ActionListener {
    JLabel lbl;
    JLabel lbl_sessionmarks;
    JLabel lbl_mid;
    JLabel lbl_final;
    JTextField txtfield_session;
    JTextField txtfield_mid;
    JTextField txtfield_final;
    JButton btn_total;

JButton btn;

    Sessional_Marks(){


        btn=new JButton("Exit");
        btn.setBounds(350,400,80,30);

        txtfield_session=new JTextField();
        txtfield_session.setBounds(190,100,50,50);
        txtfield_mid=new JTextField();
        txtfield_mid.setBounds(190,200,50,50);

        txtfield_final=new JTextField();
        txtfield_final.setBounds(190,300,50,50);

        lbl=new JLabel("MARKS DISTRIBUTION");
lbl.setBounds(50,00,350,100);
lbl.setFont(new Font("algerian", Font.BOLD,30));
        lbl_sessionmarks=new JLabel("  Sessional Marks");
        lbl_sessionmarks.setBounds(50,100,100,60);
        lbl_mid=new JLabel("Mid Marks");
        lbl_mid.setBounds(50,200,100,60);
        lbl_final=new JLabel("Final Marks");
        lbl_final.setBounds(50,300,100,60);
btn_total=new JButton("Total");
      btn_total.setBounds(150,400,100,60);
        this.setLayout(null);
this.add(lbl);

this.add(lbl_sessionmarks);
this.add(txtfield_session);
        this.add(lbl_mid);
this.add(txtfield_mid);
        this.add(lbl_final);
this.add(txtfield_final);
this.add(btn_total);

this.add(btn);
btn_total.addActionListener(this);
btn.addActionListener(this);
this.getContentPane().setBackground(Color.gray);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn_total){
            String mid=txtfield_mid.getText();
            String session=txtfield_session.getText();
String final_marks=txtfield_final.getText();
int s=Integer.parseInt(session);
int m=Integer.parseInt(mid);
int f=Integer.parseInt(final_marks);
int total=s+m+f;

btn_total.setText(""+total);

        }
    if(e.getSource()==btn){
        this.dispose();
        Teacher t=new Teacher();
    }
    }

}
