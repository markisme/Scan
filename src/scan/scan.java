/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scan;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 *
 * @author MaGuangzhao
 */
public class scan implements Runnable {

    // private ServerSocket serverSocket;
    private Socket socket;
    private final int index;
    private static InetAddress ip;
    private static int Threadnum;
    private final JTextArea TextR;
    private final JButton start;
    
    //scan类构造函数
    public scan(InetAddress ipr, int i,  int numt, JTextArea Textarea, JButton start1) {
        index = i;
        ip = ipr;
        Threadnum = numt;
        this.TextR = Textarea;
        this.start = start1;
    }

    @Override
    public void run() {
        int i;
        for (i = index;i <=MainFrame.Mport; i+=Threadnum) {
            try {
                socket = new Socket(ip, i);
                socket.close();
                TextR.append(i + "\n");
                //socket.close();
            } catch (IOException e) {
                // e.printStackTrace();
                // TextR.append("端口" + i + "关闭"+"\n");
            }
        }
        if (i == MainFrame.Mport) {
            TextR.append("扫描结束.\n");
            start.setText("开始扫描");
        }
    }
}
