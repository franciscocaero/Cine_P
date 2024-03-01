import javax.swing.*;
import java.awt.*;

public class Historial {
    private JTextPane Reservas;
    public JPanel HistRes;

    public JPanel getHistRes() {
        JTextPane Reservas = new JTextPane();
        HistRes = new JPanel();
        HistRes.add(Reservas);
        return HistRes;
    }
}
