/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.net.*;
/**
 *
 * @author User
 */
public class NoLimaServer {
    public static void main(String args[]) throws IOException
    {
        //inisialisasi string yg d butuhkan
        String clientSentence;
        String capitalizedSentence = null;
        ServerSocket welcomeSocket = new ServerSocket(6789);

        //selalu aktifkan
        while(true)
        {
            //aktifkan socket tunnel
            Socket socket = welcomeSocket.accept();

            //Open Tunnel In
            BufferedReader getFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //ambil data from tunnel in
            clientSentence = getFromClient.readLine();

            //Output socket tunnel Out
            DataOutputStream outToClient = new DataOutputStream(socket.getOutputStream());
            //ubah k btk capital toUpperCase
            capitalizedSentence = clientSentence.toUpperCase() + '\n';
            //send sentence
            outToClient.writeBytes(capitalizedSentence + '\n');
        }
    }

}

