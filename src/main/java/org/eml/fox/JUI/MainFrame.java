package org.eml.fox.JUI;

//import org.eml.fox.Main;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        //设置界面颜色
        this.setBackground(Color.white);
        //设置界面大小
        this.setSize(864,524);
        this.setTitle("末影我的世界启动器-1.0-SNAPSHOT");
        //设置界面是否可见
        this.setVisible(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面关闭运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
