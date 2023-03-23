package org.eml.fox.JUI;


//import org.eml.fox.JUI.Listeners.TheActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    public LoginFrame(){
        this.setVisible(true);
        this.setSize(600,600);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setTitle("登录");
        //按钮
        JButton jbutton = new JButton();
        jbutton.setIcon((Icon) IniPictures.getmsLogin());
        //设置位置和宽高
        jbutton.setBounds(30,10,10,3);
        jbutton.addActionListener(e -> {
        });
        this.getContentPane().add(jbutton);
    }
}
