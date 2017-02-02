
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NoSatu {

    public static void main(String[] args) throws IOException
    {
        //Teks yg ingin d tulis. Type variable String
        String mytext = "Coba Tes";

        //Panggil 
        NoSatu nosatu = new NoSatu();
        String keterangan = nosatu.WriteString(mytext);
        System.out.println(keterangan);

    }

    public String WriteString(String mytext) throws IOException
    {
        FileOutputStream fos = null;
        File file;

        try {
            file    = new File("D://mydata.txt");
            fos = new FileOutputStream(file);

            if(!file.exists())
            {
                file.createNewFile();
            }

            byte[] byteData = mytext.getBytes();

            fos.write(byteData);
            fos.flush();

            return "Sukses";
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(NoSatu.class.getName()).log(Level.SEVERE, null, ex);
            return "Gagal";
        }
        finally{
            try{
                if(fos != null)
                {
                    fos.close();
                }
            }
            catch(IOException ioe){
                return "Stream Error";
            }
        }
    }
}
