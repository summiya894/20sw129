package mypackage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Check_timetable extends JFrame implements ActionListener {
    JLabel lbl_heading;
    JTable table;
String column[][]=new String[13][5];
JButton btn_cancel;
    Check_timetable(){
        btn_cancel=new JButton("Cancel");
        btn_cancel.setBounds(150,400,150,50);
this.add(btn_cancel);
        String data[]={"SUBJECT","CLASS","Timing"};
         lbl_heading=new JLabel("TIME TABLE");
         lbl_heading.setBounds(100,40,300,50);
lbl_heading.setFont(new Font("algerian", Font.BOLD,26));
lbl_heading.setForeground(Color.cyan);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("yes connection is done");
            Connection connet = DriverManager.getConnection("jdbc:mysql://localhost:3306/tanzeela", "root", "");
            if (connet != null)
                System.out.println("connected");

            Statement stm = connet.createStatement();
            ResultSet rs = stm.executeQuery("Select * from summaiya");
            int i = 0;
            while (rs.next()) {
                column[i][0] = rs.getString(1);
                column[i][1] =rs.getString(2);
                column[i][2] =rs.getString(3);

                i++;
            }
this.setLayout(null);
         this.add(lbl_heading);
         btn_cancel.addActionListener(this);
         table=new JTable(column,data);
table.setBounds(40,150,400,200);
         this.add(table);
this.getContentPane().setBackground(Color.PINK);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(500,500);
         this.setVisible(true);
     }
        catch(Exception e){

        }}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_cancel){
            this.dispose();
            Teacher   t=new Teacher();
        }
    }
}
