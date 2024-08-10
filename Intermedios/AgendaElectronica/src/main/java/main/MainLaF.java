package main;

import InterfazGrafica.Principal;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class MainLaF {
    public static void main(String[] args) {
        // Configurar el Look and Feel a flatMaterialLighter
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("flatMaterialLighter".equals(info.getName())) { // Asegúrate de usar el nombre correcto
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Ejecutar la aplicación
        SwingUtilities.invokeLater(() -> {
            Principal principal = new Principal();
            principal.setVisible(true);
        });
    }
}
