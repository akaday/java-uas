
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NoTiga extends NoDua2 {
    
    public static void main(String[] args) 
    {

        Date date               = new Date();
        System.out.println(date);

        DateFormat dateFormat   = new SimpleDateFormat("yyyy-MM-dd");
        String tgl_sekarang     = dateFormat.format(date);
        System.out.println(tgl_sekarang);

        NoTiga nodua2       = new NoTiga();
        String format_ind   = nodua2.tglIndo(tgl_sekarang);
        System.out.println(format_ind);

    }

}
