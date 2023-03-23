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
        //新增条幅
        JMenuBar jMenuBar = new JMenuBar();
        //增加选项组件
        JMenu authormenu = new JMenu("关于");
        JMenu accountmenu = new JMenu("账号");
        JMenu onlinemenu = new JMenu("在线");
        JMenu setmenu = new JMenu("设置");
        //嵌入选项组件
        JMenuItem loginItem = new JMenuItem("登录");
        JMenuItem friendsItem = new JMenuItem("好友");
        JMenuItem OnlineItem = new JMenuItem("联机");
        JMenuItem DevelopmentItem = new JMenuItem("开发团队");
        //添加对应选项
        accountmenu.add(loginItem);
        onlinemenu.add(friendsItem);
        onlinemenu.add(OnlineItem);
        authormenu.add(DevelopmentItem);
        //添加条幅选项
        jMenuBar.add(accountmenu);
        jMenuBar.add(onlinemenu);
        jMenuBar.add(setmenu);
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
        //设置窗口图标（测试）
        //Image icon = new Image("src/main/resources/icon.ico");
//        this.setIconImage(IniPictures.geticon());
        //设置窗口关闭运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗口是否可见
        this.setVisible(true);
    }
}
