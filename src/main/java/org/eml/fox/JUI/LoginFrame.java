package org.eml.fox.JUI;


//import org.eml.fox.JUI.Listeners.TheActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    public LoginFrame(){
        //按钮
        JButton jbutton = new JButton("登录");
        //设置位置和宽高
        jbutton.setBounds(300,100,50,30);
        jbutton.addActionListener(e -> {
            JFrame jFrame = new JFrame();
            jFrame.setSize(488,430);
            jFrame.setAlwaysOnTop(true);
            jFrame.setLocationRelativeTo(null);
            jFrame.setTitle("登录");
            jFrame.setVisible(true);
        });
        this.getContentPane().add(jbutton);
    }
}
