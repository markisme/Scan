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
import javax.swing.JLabel;
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
    private final JLabel state;

    //scan类构造函数
    public scan(InetAddress ipr, int i, int numt, JTextArea Textarea, JButton start1, JLabel state1) {
        index = i;
        ip = ipr;
        Threadnum = numt;
        this.TextR = Textarea;
        this.start = start1;
        this.state = state1;
    }

    @Override
    public void run() {
        int i;
        for (i = index; i <= MainFrame.Mport; i += Threadnum) {
            state.setText("正在扫描端口：" + i);

            try {
                socket = new Socket(ip, i);
                socket.close();
                TextR.append(i + "\n");
                //socket.close();
            } catch (IOException e) {
                // e.printStackTrace();
                // TextR.append("端口" + i + "关闭"+"\n");
            }
            System.out.println(Thread.activeCount());
            //当仅剩下主线程与当前线程时表示所有端口扫描完成
            if (Thread.activeCount() == MainFrame.mainthread_num + 1) {
                TextR.append("扫描结束.\n");
                start.setText("开始扫描");
                state.setText("扫描结束！");
            }
        }
    }

}
