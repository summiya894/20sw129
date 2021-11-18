package mypackage;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Refistration_Form extends JFrame implements ActionListener{
    //JLABEL
    JLabel label_name;
    JLabel label_password;
    JLabel  label_email;
    JLabel label_gender;
    JLabel label_city;
    JLabel label_country;
    JLabel label_phone_no;
    //JTEXTFIELD
    JTextField textfield_name;
    JPasswordField textfield_password;
    JTextField textfield_email;

    JTextField textfield_country;
    JTextField textfield_phone_no;
    //JRADIO BUTTON
    JRadioButton radio_btn_male;
    JRadioButton radio_btn_female;
    //JCOMBO BOX
    JComboBox comboBox_city;
    //JCHECK BOX
    JCheckBox checkbox_terms;

    //JBUTTON
    JButton button_register;
    JButton button_clear;
    //ICON
    ImageIcon icon;

    //group button
    ButtonGroup group;
    //label
    JLabel label_form;
    JLabel label_icon;
    ImageIcon icon_label;
    JButton btn_cancel;
    Refistration_Form(){
        btn_cancel=new JButton("cancel");
        btn_cancel.setBounds(185,485,100,50);
         this.add(btn_cancel);
        label_form=new JLabel("My App");
        label_form.setBounds(280,0,300,100);
        label_form.setFont(new Font("ALGERIAN",Font.BOLD,40));
        label_icon=new JLabel();
        icon_label=new ImageIcon("registration_form.jfif");
        label_icon.setBounds(0,0,200,90);
        label_icon.setIcon(icon_label);
        this.add(label_icon);
        this.add(label_form);

        icon=new ImageIcon("Icon.png");
        setIconImage(icon.getImage());
        label_name=new JLabel("Name :");
        label_name.setBounds(50,70,100,100);
        label_password=new JLabel("Password :");
        label_password.setBounds(50,120,100,100);
        label_email=new JLabel("Email :");
        label_email.setBounds(50,170,100,100);
        label_gender=new JLabel("Gender :");
        label_gender.setBounds(50,220,100,100);
        label_city=new JLabel("City :");
        label_city.setBounds(50,270,100,100);
        label_country=new JLabel("Country :");
        label_country.setBounds(50,320,100,100);
        label_phone_no=new JLabel("Phone no :");
        label_phone_no.setBounds(50,370,100,100);

        //JTEXTFIELD
        textfield_name=new JTextField();
        textfield_name.setBounds(210,95,240,40);
        textfield_password=new JPasswordField();
        textfield_password.setBounds(210,145,240,40);
        textfield_email=new JTextField();
        textfield_email.setBounds(210,195,240,40);

        textfield_country=new JTextField();
        textfield_country.setBounds(210,345,240,40);

        textfield_phone_no=new JTextField();
        textfield_phone_no.setBounds(210,395,240,40);
//JRADIO BUTTON
        radio_btn_male=new JRadioButton("male ");
        radio_btn_male.setBounds(210,245,100,50);
        radio_btn_female=new JRadioButton("female ");
        radio_btn_female.setBounds(320,245,100,50);
//JCOMBO BOX
        String cntry[]={"Lahore","karachi","Islamabad","Peshawar","Rawalpindi"};
        comboBox_city=new JComboBox(cntry);
        comboBox_city.setBounds(210,295,240,40);

        //JCHECKBOX
        checkbox_terms=new JCheckBox("Are you agree on this terms and conditionds");
        checkbox_terms.setBounds(50,430,190,70);

        //JBUTTON
        button_register=new JButton("REGISTER");
        button_register.setBounds(50,485,100,50);
        button_clear=new JButton("CLEAR");
        button_clear.setBounds(350,485,100,50);
        group=new ButtonGroup();
        group.add(radio_btn_female);
        group.add(radio_btn_male);
        this.add(label_name);
        this.add(textfield_name);
        this.add(label_password);
        this.add(textfield_password);
        this.add(label_email);
        this.add(textfield_email);
        this.add(label_gender);
        this.add(radio_btn_male);
        this.add(radio_btn_female);
        this.add(label_city);
        this.add(comboBox_city);
        this.add(label_country);
        this.add(textfield_country);
        this.add(label_phone_no);
        this.add(textfield_phone_no);
        this.add(checkbox_terms);
        this.add(button_register);
        this.add(button_clear);
        btn_cancel.addActionListener(this);
        button_clear.addActionListener(this);
        this.getContentPane().setBackground(Color.pink);
        checkbox_terms.setBackground(Color.pink);
        radio_btn_male.setBackground(Color.pink);
        radio_btn_female.setBackground(Color.pink);

        button_register.addActionListener(this);
        this.setTitle("Registration Form");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,600);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button_clear){
            textfield_phone_no.setText("");
            textfield_name.setText("");
            textfield_password.setText("");
            textfield_country.setText("");
            textfield_email.setText("");
        }
        else if(e.getSource()==button_register){
            if(checkbox_terms.isSelected()==true){

                JOptionPane.showMessageDialog(this,"Name :"+textfield_name.getText()+" Password "+textfield_password.getText()+" Email "+textfield_email.getText()+" " +
                        "Country"+textfield_country.getText()+" Phone number :"+textfield_phone_no.getText()+ "city :"+comboBox_city.getSelectedItem());
            }
            else
                JOptionPane.showMessageDialog(this,"first agree on terms and conditions");
        }
        if(e.getSource()==btn_cancel){
            this.dispose();
            Student stud=new Student();
        }
    }
}

