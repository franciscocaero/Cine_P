import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaCambiar {
    private JButton editarPerfilButton;
    private JButton historialDeCompraButton;
    private JPanel Contenido;
    private CardLayout cardLayout;

    public PantallaCambiar() {
        JFrame frame = new JFrame("Cine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        Contenido = new JPanel();
        cardLayout = new CardLayout();
        Contenido.setLayout(cardLayout);

        EdPerfil editarPerfilPanel = new EdPerfil();
        Historial historialPanel = new Historial();

        Contenido.add(editarPerfilPanel.getDato(), "perfil");
        Contenido.add(historialPanel.getHistRes(), "historial");

        editarPerfilButton = new JButton("Editar Perfil");
        editarPerfilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(Contenido, "perfil");
            }
        });

        historialDeCompraButton = new JButton("Historial de Compras");
        historialDeCompraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(Contenido, "historial");
            }
        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(editarPerfilButton);
        buttonsPanel.add(historialDeCompraButton);

        frame.add(buttonsPanel, BorderLayout.NORTH);
        frame.add(Contenido, BorderLayout.CENTER);

        frame.setVisible(true);
    }
    public JPanel getContenido() {
        return Contenido;
    }

}