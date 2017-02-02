
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NoLimaClient {

    public static void main(String[] args) throws IOException {
        //teks yg ingin d kirim
        String mysentence = "teks kecil";

        //inisialisasi port, port yg d gunakan 6789
        Socket socket = new Socket("localhost", 6789);

        //Output socket tunnel Out
        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
        //send sentence
        outToServer.writeBytes(mysentence + '\n');

        //Output Tunel In, menerima data
        BufferedReader getFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //ambil data from socket tunnel in
        String answer = getFromClient.readLine();
        // tampilkan data yg telah d ubah
        System.out.println(answer);
    }
}
