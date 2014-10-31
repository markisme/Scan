/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scan;


import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MaGuangzhao
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public static InetAddress ip;   //目标ip
    public static int Mport = 65535;//最大端口
    public static int Tnum;         //最大线程数
    public static int total=0;
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextIp = new javax.swing.JTextField();
        start = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextR = new javax.swing.JTextArea();
        stop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        isAlive = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ThreadNum = new javax.swing.JFormattedTextField();
        jLabelNum = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        state = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("目标IP:");

        TextIp.setText("180.97.33.108");
        TextIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIpActionPerformed(evt);
            }
        });

        start.setText("开始端口扫描");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        TextR.setColumns(20);
        TextR.setRows(5);
        jScrollPane1.setViewportView(TextR);

        stop.setText("退出程序");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        jLabel2.setText("线程数:");

        isAlive.setText("判断主机存活");
        isAlive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isAliveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("幼圆", 1, 12)); // NOI18N
        jLabel3.setText("端口扫描小工具v2.4");

        jLabel4.setText("by maguangzhao,2014-10-28 14:48:24");

        ThreadNum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ThreadNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreadNumActionPerformed(evt);
            }
        });

        jLabelNum.setText("1-65535");

        jLabel5.setFont(new java.awt.Font("宋体", 0, 10)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("建议线程数不要超过2000");

        state.setFont(new java.awt.Font("宋体", 0, 10)); // NOI18N
        state.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(stop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(isAlive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addGap(7, 7, 7)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextIp, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ThreadNum, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelNum)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(state, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(65, 65, 65)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TextIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ThreadNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(isAlive)
                        .addGap(26, 26, 26)
                        .addComponent(start)
                        .addGap(28, 28, 28)
                        .addComponent(stop)
                        .addGap(26, 26, 26)
                        .addComponent(state))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIpActionPerformed

    //开始扫描按钮监听事件
    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed

        if(start.getText().equals("开始端口扫描")){
        //初始化数据目标IP、线程数
        String str = TextIp.getText();
        try {
            Tnum = Integer.parseInt(ThreadNum.getText());
        } catch (NumberFormatException e) {
            jLabelNum.setText("数值格式不合法！");
            return;
        }
        if (!(Tnum > 0 && Tnum <= 65535)) {
            jLabelNum.setText("数值范围不合法！");
            return;
        }
        try {
            // TODO add your handling code here:

            ip = InetAddress.getByName(str);
        } catch (UnknownHostException ex) {
            TextR.append("未知的主机或者IP格式不正确!请重试!\n");
            return;
        }
        TextR.append("开始扫描...\n");
        start.setText("正在扫描");
        //将所有端口分成Tnum部分，每个线程负责扫描一部分，实现多线程加速扫描
        for (int i = 1; i <=Tnum; i++) {
            new Thread(new scan(ip,  i,Tnum, TextR, start,state)).start();//根据构造函数传入变量

        }
        /*  while (true) {
         if (thread.getState().toString().equals("TERMINATED")) {
         break;
         }
         try {
         Thread.sleep(1000);
         } catch (InterruptedException ex) {
         Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
         TextR.append("扫描结束！\n");
         start.setText("开始扫描");
         */
        }
        else
        {
            
        }
    }//GEN-LAST:event_startActionPerformed

    //退出按钮监听事件
    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_stopActionPerformed

    private void ThreadNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreadNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThreadNumActionPerformed

    //判断主机存活按钮监听事件
    private void isAliveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAliveActionPerformed

        // TODO add your handling code here:
        String str = TextIp.getText();
        isAlive.setText("正在判断主机存活性");
        TextR.append("正在判断主机是否存活...\n");
        
         try {
            // TODO add your handling code here:

            ip = InetAddress.getByName(str);
        } catch (UnknownHostException ex) {
            TextR.append("未知的主机名或者IP格式不正确!请重试!\n");
            return;
        }

        
        boolean stat = true;
        try {
            stat = ip.isReachable(5000);
            System.out.println(stat);
        } catch (IOException ex) {
               Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (stat) {
            TextR.append("主机存活！\n");
        } else {
            TextR.append("主机不在线！\n");
        }
        isAlive.setText("判断主机存活");
    }//GEN-LAST:event_isAliveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextIp;
    private javax.swing.JTextArea TextR;
    private javax.swing.JFormattedTextField ThreadNum;
    private javax.swing.JButton isAlive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelNum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton start;
    private javax.swing.JLabel state;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
}
