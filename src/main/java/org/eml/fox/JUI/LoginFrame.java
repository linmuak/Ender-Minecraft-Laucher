package org.eml.fox.JUI;


import org.eml.fox.JUI.Listeners.TheActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    public LoginFrame(){
        this.setSize(488,430);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setTitle("登陆");
        this.setVisible(true);
        //按钮
        JButton jbutton = new JButton("登陆");
        //设置位置和宽高
        jbutton.setBounds(300,100,50,30);
        jbutton.addActionListener(new TheActionListener());
        this.getContentPane().add(jbutton);
    }
}
