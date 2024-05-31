/*
NIM              : 13020220116
Nama             : Zia Ul Haq Bahar
Hari/Tanggal     : Selasa, 28 Mei 2024
Waktu Pengerjaan : 08:00
*/

package id.bio;
import id.bio.view.BiodataForm;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

public class MainProgram {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(info.getName())){
            try{
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }catch(UnsupportedLookAndFeelException e){
                Logger.getLogger(MainProgram.class.getName()).log(Level.SEVERE, null, e);
            }
            }
        }
        new BiodataForm().setVisible(true);
    }
}
