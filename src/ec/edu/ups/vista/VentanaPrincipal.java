/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorJugador;
import ec.edu.ups.controlador.ControladorRuleta;
import ec.edu.ups.modelo.Jugador;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private final ImageIcon imagenRuleta = new ImageIcon(getClass().getResource("/imagenes/ruleta.png"));
    private final ImageIcon imagenRuletaGif = new ImageIcon(getClass().getResource("/imagenes/ruletaGif.gif"));
    private final Color verde = new Color(0, 153, 51);
    private final Font fuente = new Font("Dialog", Font.BOLD, 30);
    private final Font fuenteParImpar = new Font("Dialog", Font.BOLD, 16);
    private final Random randomico = new Random();

    private VentanaActualizarJugador ventanaActualizarJugador;
    private VentanaNuevoJugador ventanaNuevoJugador;
    private ControladorJugador controladorJugador;
    private ControladorRuleta controladorRuleta;

    public VentanaPrincipal() {
        initComponents();
        generarTabla();
        controladorJugador = new ControladorJugador();
        controladorRuleta = new ControladorRuleta();
        ventanaNuevoJugador = new VentanaNuevoJugador(controladorJugador, this);
        ventanaActualizarJugador = new VentanaActualizarJugador(controladorJugador, this);
        cargarDatos();
    }

    public final void generarTabla() {
        jPanelRuleta.removeAll();
        for (int i = 1; i < 37; i++) {
            JButton numero = new JButton(i + "");
            numero.setFont(fuente);
            numero.setForeground(Color.white);

            if (i % 2 != 0) {
                numero.setBackground(Color.black);
            } else {
                numero.setBackground(Color.red);
            }

            jPanelRuleta.add(numero);
        }
        jPanelRuleta.updateUI();

        JButton casilla = new JButton("0");
        casilla.setFont(fuente);
        casilla.setForeground(Color.white);
        casilla.setBackground(Color.black);

        JButton casillaPar = new JButton("par");
        casillaPar.setFont(fuenteParImpar);
        casillaPar.setForeground(Color.white);
        casillaPar.setBackground(Color.red);

        JButton casillaImpar = new JButton("impar");
        casillaImpar.setFont(fuenteParImpar);
        casillaImpar.setForeground(Color.white);
        casillaImpar.setBackground(Color.black);

        jPanelRuleta.add(casilla);
        jPanelRuleta.add(casillaPar);
        jPanelRuleta.add(casillaImpar);

        jPanelRuleta.updateUI();

    }

    public void pintarCasillaGanadora(int numGanador) {
        JButton ganador = (JButton) jPanelRuleta.getComponent(--numGanador);
        ganador.setBackground(verde);
    }

    public void cargarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) jTableJugadores.getModel();
        modelo.setRowCount(0);

        for (Jugador j : controladorJugador.getLista()) {
            Object[] rowData = {j.getId(), j.getNombre(), j.getSaldo(), j.getEstrategia()};
            modelo.addRow(rowData);
        }
        jTableJugadores.setModel(modelo);

        jTextFieldSaldoBanca.setText(controladorRuleta.getLista().get(0).getSaldo() + "");
    }

    public Jugador getJugadorSeleccionado() {
        return controladorJugador.buscar((long) jTableJugadores.getValueAt(jTableJugadores.getSelectedRow(), 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanelRuleta = new javax.swing.JPanel();
        jLabelRuleta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldGanador = new javax.swing.JTextField();
        jButtonGirar = new javax.swing.JButton();
        jButtonDetener = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldSaldoBanca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableJugadores = new javax.swing.JTable();
        jButtonNuevo = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jPanelJugadores = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldP1 = new javax.swing.JTextField();
        jTextFieldP2 = new javax.swing.JTextField();
        jTextFieldP3 = new javax.swing.JTextField();
        jTextFieldP4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldApuestaP1 = new javax.swing.JTextField();
        jTextFieldApuestaP2 = new javax.swing.JTextField();
        jTextFieldApuestaP3 = new javax.swing.JTextField();
        jTextFieldApuestaP4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNumeroP1 = new javax.swing.JTextField();
        jTextFieldNumeroP2 = new javax.swing.JTextField();
        jTextFieldNumeroP3 = new javax.swing.JTextField();
        jTextFieldNumeroP4 = new javax.swing.JTextField();
        jLabelP1 = new javax.swing.JLabel();
        jLabelP2 = new javax.swing.JLabel();
        jLabelP3 = new javax.swing.JLabel();
        jLabelP4 = new javax.swing.JLabel();
        jButtonApostarAleatorio = new javax.swing.JButton();
        jButtonEliminar1 = new javax.swing.JButton();
        jButtonNuevo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(192, 143, 37));

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));

        jPanelRuleta.setBackground(new java.awt.Color(192, 143, 37));
        jPanelRuleta.setLayout(new java.awt.GridLayout(0, 3));

        jLabelRuleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ruleta.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero Ganador");

        jTextFieldGanador.setEditable(false);
        jTextFieldGanador.setBackground(new java.awt.Color(192, 143, 37));
        jTextFieldGanador.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextFieldGanador.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldGanador.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonGirar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonGirar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonGirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ruleta-del-casino.png"))); // NOI18N
        jButtonGirar.setText("Girar");
        jButtonGirar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGirar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonGirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGirarActionPerformed(evt);
            }
        });

        jButtonDetener.setBackground(new java.awt.Color(255, 102, 102));
        jButtonDetener.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDetener.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/detener-la-violencia.png"))); // NOI18N
        jButtonDetener.setText("Detener");
        jButtonDetener.setEnabled(false);
        jButtonDetener.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDetener.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetenerActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Saldo de");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("La Banca");

        jTextFieldSaldoBanca.setEditable(false);
        jTextFieldSaldoBanca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSaldoBanca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(36, 36, 36)
                        .addComponent(jTextFieldSaldoBanca))
                    .addComponent(jPanelRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRuleta)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButtonDetener)
                                .addGap(41, 41, 41)
                                .addComponent(jButtonGirar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanelRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldSaldoBanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelRuleta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonGirar)
                            .addComponent(jButtonDetener))
                        .addGap(36, 36, 36))))
        );

        jTableJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Jugador", "Saldo", "Estrategia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableJugadores);
        if (jTableJugadores.getColumnModel().getColumnCount() > 0) {
            jTableJugadores.getColumnModel().getColumn(0).setMinWidth(35);
            jTableJugadores.getColumnModel().getColumn(0).setPreferredWidth(35);
            jTableJugadores.getColumnModel().getColumn(0).setMaxWidth(35);
        }

        jButtonNuevo.setBackground(new java.awt.Color(153, 255, 153));
        jButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas-1.png"))); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNuevo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas-1.png"))); // NOI18N
        jButtonNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(255, 102, 102));
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menos.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonModificar.setBackground(new java.awt.Color(255, 204, 102));
        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-circular.png"))); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jPanelJugadores.setBackground(new java.awt.Color(192, 143, 37));
        jPanelJugadores.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "  Jugadores en mesa  ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("P1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("P2");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("P3");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("P4");

        jTextFieldP1.setEditable(false);
        jTextFieldP1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldP2.setEditable(false);
        jTextFieldP2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldP3.setEditable(false);
        jTextFieldP3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldP3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldP4.setEditable(false);
        jTextFieldP4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldP4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apuesta");

        jTextFieldApuestaP1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldApuestaP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldApuestaP2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldApuestaP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldApuestaP3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldApuestaP3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldApuestaP4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldApuestaP4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numero");

        jTextFieldNumeroP1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNumeroP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldNumeroP2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNumeroP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldNumeroP3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNumeroP3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldNumeroP4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNumeroP4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelP1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelP2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelP3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelP4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonApostarAleatorio.setBackground(new java.awt.Color(255, 204, 153));
        jButtonApostarAleatorio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonApostarAleatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ruletaIcono.png"))); // NOI18N
        jButtonApostarAleatorio.setText("Apostar Aleatoriamente");
        jButtonApostarAleatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonApostarAleatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonApostarAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApostarAleatorioActionPerformed(evt);
            }
        });

        jButtonEliminar1.setBackground(new java.awt.Color(255, 102, 102));
        jButtonEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menos.png"))); // NOI18N
        jButtonEliminar1.setText("Eliminar");
        jButtonEliminar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEliminar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButtonNuevo1.setBackground(new java.awt.Color(153, 255, 153));
        jButtonNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas-1.png"))); // NOI18N
        jButtonNuevo1.setText("Agregar");
        jButtonNuevo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNuevo1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas-1.png"))); // NOI18N
        jButtonNuevo1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelJugadoresLayout = new javax.swing.GroupLayout(jPanelJugadores);
        jPanelJugadores.setLayout(jPanelJugadoresLayout);
        jPanelJugadoresLayout.setHorizontalGroup(
            jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldP1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldApuestaP1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                                .addComponent(jTextFieldNumeroP1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelP1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                        .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                                .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldP3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldApuestaP3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNumeroP3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                                .addComponent(jButtonApostarAleatorio)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEliminar1)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNuevo1)
                                .addGap(15, 15, 15)))
                        .addGap(16, 16, 16))
                    .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                        .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldP2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldApuestaP2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNumeroP2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jTextFieldP4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldApuestaP4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNumeroP4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelP4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanelJugadoresLayout.setVerticalGroup(
            jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                        .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelP1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelJugadoresLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldApuestaP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumeroP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldApuestaP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNumeroP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldApuestaP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelP3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumeroP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextFieldP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldApuestaP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelP4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumeroP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEliminar1)
                    .addComponent(jButtonApostarAleatorio)
                    .addComponent(jButtonNuevo1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonModificar)
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNuevo)
                                .addGap(7, 7, 7)
                                .addComponent(jButtonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonModificar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetenerActionPerformed
        Icon icono = new ImageIcon(imagenRuleta.getImage().getScaledInstance(jLabelRuleta.getWidth(), jLabelRuleta.getHeight(), Image.SCALE_DEFAULT));
        jLabelRuleta.setIcon(icono);
        this.repaint();
        int ganador = randomico.nextInt(37);
        jTextFieldGanador.setText(ganador + "");
        pintarCasillaGanadora(ganador);
        jButtonDetener.setEnabled(false);
    }//GEN-LAST:event_jButtonDetenerActionPerformed

    private void jButtonGirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGirarActionPerformed
        generarTabla();
        Icon icono = new ImageIcon(imagenRuletaGif.getImage().getScaledInstance(jLabelRuleta.getWidth(), jLabelRuleta.getHeight(), Image.SCALE_DEFAULT));
        jLabelRuleta.setIcon(icono);
        this.repaint();
        jTextFieldGanador.setText("");
        jButtonDetener.setEnabled(true);
    }//GEN-LAST:event_jButtonGirarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        ventanaNuevoJugador.setVisible(true);
        ventanaNuevoJugador.restaurar();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try {
            controladorJugador.eliminar(getJugadorSeleccionado());
            cargarDatos();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un jugador de la tabla");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed

        try {
            ventanaActualizarJugador.llenarDatos(getJugadorSeleccionado());
            ventanaActualizarJugador.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un jugador de la tabla");
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevo1ActionPerformed
        try {

            Jugador jugadorSeleccionado = getJugadorSeleccionado();

            if (jTextFieldP1.getText().isEmpty()) {
                jTextFieldP1.setText(jugadorSeleccionado.getNombre());
            } else if (jTextFieldP2.getText().isEmpty()) {
                jTextFieldP2.setText(jugadorSeleccionado.getNombre());
            } else if (jTextFieldP3.getText().isEmpty()) {
                jTextFieldP3.setText(jugadorSeleccionado.getNombre());
            } else if (jTextFieldP4.getText().isEmpty()) {
                jTextFieldP4.setText(jugadorSeleccionado.getNombre());
            } else {
                JOptionPane.showMessageDialog(this, "Ya estan ocupados todos los asientos en mesa");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un jugador de la tabla");
        }
    }//GEN-LAST:event_jButtonNuevo1ActionPerformed

    private void jButtonApostarAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApostarAleatorioActionPerformed
        if (!jTextFieldP1.getText().isEmpty()) {
            jTextFieldApuestaP1.setText(10.0 + "");
            jTextFieldNumeroP1.setText(randomico.nextInt(37) + "");
        }
        if (!jTextFieldP2.getText().isEmpty()) {
            jTextFieldNumeroP2.setText(randomico.nextInt(37) + "");
            jTextFieldApuestaP2.setText(10.0 + "");
        }
        if (!jTextFieldP3.getText().isEmpty()) {
            jTextFieldNumeroP3.setText(randomico.nextInt(37) + "");
            jTextFieldApuestaP3.setText(10.0 + "");
        }
        if (!jTextFieldP4.getText().isEmpty()) {
            jTextFieldNumeroP4.setText(randomico.nextInt(37) + "");
            jTextFieldApuestaP4.setText(10.0 + "");
        }

    }//GEN-LAST:event_jButtonApostarAleatorioActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApostarAleatorio;
    private javax.swing.JButton jButtonDetener;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonEliminar1;
    private javax.swing.JButton jButtonGirar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonNuevo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelP1;
    private javax.swing.JLabel jLabelP2;
    private javax.swing.JLabel jLabelP3;
    private javax.swing.JLabel jLabelP4;
    private javax.swing.JLabel jLabelRuleta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelJugadores;
    private javax.swing.JPanel jPanelRuleta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableJugadores;
    private javax.swing.JTextField jTextFieldApuestaP1;
    private javax.swing.JTextField jTextFieldApuestaP2;
    private javax.swing.JTextField jTextFieldApuestaP3;
    private javax.swing.JTextField jTextFieldApuestaP4;
    private javax.swing.JTextField jTextFieldGanador;
    private javax.swing.JTextField jTextFieldNumeroP1;
    private javax.swing.JTextField jTextFieldNumeroP2;
    private javax.swing.JTextField jTextFieldNumeroP3;
    private javax.swing.JTextField jTextFieldNumeroP4;
    private javax.swing.JTextField jTextFieldP1;
    private javax.swing.JTextField jTextFieldP2;
    private javax.swing.JTextField jTextFieldP3;
    private javax.swing.JTextField jTextFieldP4;
    private javax.swing.JTextField jTextFieldSaldoBanca;
    // End of variables declaration//GEN-END:variables
}
