package org.eml.fox.JUI;

import javax.swing.*;

public class LoginFrame extends JFrame {
    public LoginFrame(){
        this.setVisible(true);
        this.setSize(500,500);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setTitle("登录");
        this.setLayout(null);
        //按钮
        JButton jbutton = new JButton("登录微软账户");
        JButton jbutton2 = new JButton("登录Mojang账户");
        JButton jbutton3 = new JButton("其它登录");
        jbutton.setBounds(175,125,150,25);
        jbutton2.setBounds(175,175,150,25);
        jbutton3.setBounds(175,225,150,25);
        jbutton.addActionListener(e -> {
        });
        this.getContentPane().add(jbutton);
        this.getContentPane().add(jbutton2);
        this.getContentPane().add(jbutton3);
    }
}
