/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NoDua2 {

    public String tglIndo(String tglss)
    {
        String[] exp_Tgl = tglss.split("-");
        int f_no = Integer.parseInt(exp_Tgl[1]);
        String blnIndo = this.bulanIndo(f_no);

        String format_baru = exp_Tgl[2]+" "+blnIndo+" "+exp_Tgl[0];

        return format_baru;
    }

    public String bulanIndo(int bulan)
    {
        String[] data = {"","Januari","Februari","Maret"};
        return data[bulan];
    }
}
