/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3_ps18851_phamvinhsang_lab7;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextArea;

/**
 *
 * @author Sang
 */
public class ClientThread implements Runnable{
    Socket client;
    JTextArea txtServer;
    InputStream in;
    BufferedInputStream bin;
    DataInputStream dis;
    OutputStream out;
    String me = "";
    Date date = new Date();
    SimpleDateFormat now = new SimpleDateFormat("HH:mm:ss");
    String dateNow = now.format(date);
    public ClientThread(Socket client, JTextArea txtServer) {
        this.client = client;
        this.txtServer = txtServer;
        try {
            in = client.getInputStream();
            bin = new BufferedInputStream(in);
            dis = new DataInputStream(bin);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void run() {
        String s = "";
        while(true) {
            try {
                s = dis.readLine();
                txtServer.append("At " + dateNow + ": \n    " + s + "\n\r");
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
