package org.eml.fox.JUI;

//import org.eml.fox.Main;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        mainFrameSet();
        menuBarSet();
    }

    private void menuBarSet() {
        //条幅
        JMenuBar jMenuBar = new JMenuBar();
        //选项
        JMenu authormenu = new JMenu("关于");
        JMenu accountmenu = new JMenu("账号");
        JMenu onlinemenu = new JMenu("在线");

        JMenuItem loginItem = new JMenuItem("登陆");
        //添加对应选项
        accountmenu.add(loginItem);
        //添加条幅选项
        jMenuBar.add(accountmenu);
        jMenuBar.add(onlinemenu);
        jMenuBar.add(authormenu);
        this.setJMenuBar(jMenuBar);
        jMenuBar.setVisible(true);

    }

    private void mainFrameSet() {
        //设置窗口颜色
        this.setBackground(Color.white);
        //设置窗口大小
        this.setSize(864,530);
        //设置窗口名称，标题
        this.setTitle("末影我的世界启动器-1.0-SNAPSHOT");
        //设置窗口居中
        this.setLocationRelativeTo(null);
        //设置窗口关闭运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗口是否可见
        this.setVisible(true);
    }
}
