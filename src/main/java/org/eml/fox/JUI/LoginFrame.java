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
        //设置位置和宽高
        jbutton.setBounds(175,125,150,25);
        jbutton2.setBounds(175,175,150,25);
        jbutton.addActionListener(e -> {
        });
        this.getContentPane().add(jbutton);
        this.getContentPane().add(jbutton2);
    }
}
