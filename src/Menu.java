import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    private JButton PerfBoton;
    private JPanel Header;
    private JLabel EspLogo;
    public JPanel Perfil;
    private  JPanel Contenido;
    private JButton historialDeCompraButton;
    private JButton editarPerfilButton;
    private JMenu Historial;
    private JMenu EditarPerfil;

    private CardLayout cardLayout;

    public Menu() {
        JFrame frame = new JFrame("Cine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        Contenido = new JPanel();
        cardLayout = new CardLayout();
        Contenido.setLayout(cardLayout);

        EdPerfil editarPerfilPanel = new EdPerfil();
        Historial historialPanel = new Historial();

        // Agregar tus componentes existentes al panel Contenido
        Contenido.add(editarPerfilPanel.getDato(), "perfil");
        Contenido.add(historialPanel.getHistRes(), "historial");

        frame.add(Contenido, BorderLayout.CENTER);
        frame.setVisible(true);

        JButton editarPerfilButton = new JButton("Editar Perfil");
        editarPerfilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(Contenido, "perfil");
            }
        });

        JButton historialDeCompraButton = new JButton("Historial de Compras");
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
    }
    public JPanel getContenido() {
        return Contenido;
    }


}
