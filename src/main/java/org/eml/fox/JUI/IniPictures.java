package org.eml.fox.JUI;


import java.awt.*;

public class IniPictures{
    public static Image getStart(){
        return start;
    }
    public static Image getDownload(){
        return download;
    }
    public static Image getMSLogin(){
        return msLogin;
    }
//    public static Image geticon(){
//        return icon;
//    }
    static Image start = Toolkit.getDefaultToolkit().getImage("src/main/resources/pictures/Start.jpg");
    static Image download = Toolkit.getDefaultToolkit().getImage("src/main/resources/pictures/Download.jpg");
    static Image msLogin = Toolkit.getDefaultToolkit().getImage("src/main/resources/pictures/Login_Microsoft.jpg");
//    static Image icon = Toolkit.getDefaultToolkit().getImage("src/main/resources/pictures/icon.jpg");
//    File start = new File("src/main/resources/pictures/Start.jpg");
//    Image image = ImageIO.read(new FileInputStream("src/main/resources/pictures/Start.jpg"));
//    image = ImageIO.read();
//    File download = new File("src/main/resources/pictures/Download.jpg");
//    File MSLogin = new File("src/main/resources/pictures/Login_Microsoft.jpg");
//
//    Image imag的e = new ImageIcon("src/main/resources/pictures/icon.ico").getImage();

}
