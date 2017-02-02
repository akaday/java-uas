
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NoDua{

    public static void main(String[] args) throws IOException
    {
        //Inisialisasi
        String[] biodata;
        String tanggal;

        //Objek 1
        NoDua1 obj1 = new NoDua1();
        biodata     = obj1.dataBase();

        //Objek 2
        NoDua2 obj2 = new NoDua2();
        tanggal     = obj2.tglIndo(biodata[2]);
        
        String mytext = "Nama : " + biodata[0] + ", NIM : " + biodata[1] + ", tgl lahir:" + tanggal;

        //Objek 3
        NoSatu obj3 = new NoSatu();
        obj3.WriteString(mytext);
    }
    
}
