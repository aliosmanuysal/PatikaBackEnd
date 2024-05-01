package core;

import javax.print.attribute.standard.JobStateReason;
import javax.swing.*;
import java.awt.*;

public class Helper {
    public static void setTheme() {
        for (
                UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
    }


    public static void showMsg(String str) {
        optionPaneTR();
        String msg;
        String title;

        switch (str) {
            case "fill" -> {
                msg = "Tüm Alanları Doldurunuz.";
                title = "HATA !";
            }
            case "done" -> {
                msg = "İşlem Başarılı.";
                title = "Sonuç";
            }
            case "notFound" -> {
                msg = "Kayıt Bulunamadı.";
                title = "Sonuç";
            }
            case "error" -> {
                msg = "Hatalı İşlem Yaptınız.";
                title = "HATA !";
            }
            default -> {
                msg = str;
                title = "Mesaj";
            }
        }


        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(String str){
        optionPaneTR();
        String msg;
        if(str.equals("sure")){
            msg = "Bu İşlemi Yapmak İstediğine Emin Misin ? ";
        }else {
            msg=str;
        }
        return JOptionPane.showConfirmDialog(null,msg,"Emin Misin?",JOptionPane.YES_NO_OPTION) == 0;
    }

    public static boolean isFieldEmpty(JTextField field) {
        return field.getText().trim().isEmpty();
    }

    public static boolean isFieldListEmpty(JTextField[] fieldList) {
        for (JTextField field : fieldList) {
            if (Helper.isFieldEmpty(field)) {
                return true;
            }
        }
        return false;
    }

public static int getLocationPoint(String type, Dimension size){
    return switch (type) {
        case "x" -> (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
        case "y" -> (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
        default -> 0;
    };
}


public static void optionPaneTR(){
        UIManager.put("OptionPane.okButtonText" , "Tamam");
        UIManager.put("OptionPane.yesButtonText" , "Evet");
        UIManager.put("OptionPane.noButtonText" , "Hayır");
}

}
