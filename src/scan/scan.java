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
    private static int num;
    private final JTextArea TextR;
    private final JButton start;

    public scan(int n, InetAddress ipr, int numr, JTextArea Textarea, JButton start1) {
        ip = ipr;
        index = n;
        num = numr;
        this.TextR = Textarea;
        this.start = start1;
    }

    @Override
    public void run() {
        for (int i = num * index; (i <= 65535) && (i < num * (index + 1)); i++) {
            try {
                socket = new Socket(ip, i);
                socket.close();
                TextR.append(i + "\n");
                //socket.close();
            } catch (IOException e) {
                // e.printStackTrace();
                // TextR.append("端口" + i + "关闭"+"\n");
            }
            if (i == num) {
                TextR.append("扫描结束.\n");
                start.setText("开始扫描");
            }

        }

    }

}
