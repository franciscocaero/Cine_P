import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menu para  perfil");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Menu menu = new Menu();
            frame.add(menu.Perfil);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setVisible(true);
        });
    }
}