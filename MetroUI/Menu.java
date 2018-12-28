package Praktikum10.MetroUI;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        form_awal(false);
        this.setExtendedState(this.getExtendedState() | Menu.MAXIMIZED_BOTH);
        Pencarian.setVisible(false);
        pSetting.setVisible(false);
    }
    
    public void form_awal(boolean xyz){
        panelMenu.setVisible(xyz);
        panelNavigasi.setVisible(xyz);
        lbSetting.setVisible(xyz);
        lbPencarian.setVisible(xyz);
    }
    
    public void login(){
        String id_user = txtIDUser.getText();
        String password = txtPassword.getText();
        
        if(id_user.equals("")){
            JOptionPane.showMessageDialog(this, "ID. User belum di isi!", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
        }else if(password.equals("")){
            JOptionPane.showMessageDialog(this, "Password belum di isi!", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
        }else if(!id_user.equals("171530030")||!password.equals("mahasiswa")){
            JOptionPane.showMessageDialog(this, "ID. User dan Password Salah!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }else{
            form_awal(true);
            panelLogin.setVisible(false);
        }
    }
    
    void set_color1(JPanel panel){
        panel.setBackground(Color.DARK_GRAY);
    }
    void set_color2(JPanel panel){
        panel.setBackground(new java.awt.Color(80, 80, 80));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtIDUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        panelMenu = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        mnAdd = new javax.swing.JPanel();
        d = new javax.swing.JLabel();
        mnProfile = new javax.swing.JPanel();
        c = new javax.swing.JLabel();
        mnReport = new javax.swing.JPanel();
        b = new javax.swing.JLabel();
        mnExit = new javax.swing.JPanel();
        a = new javax.swing.JLabel();
        panelNavigasi = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lbSetting = new javax.swing.JLabel();
        lbPencarian = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        pSetting = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelLogin.setBackground(java.awt.Color.darkGray);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/lock.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Login User");

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("ID User");

        txtIDUser.setBackground(java.awt.Color.darkGray);
        txtIDUser.setForeground(java.awt.Color.orange);
        txtIDUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDUser.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Password");

        txtPassword.setBackground(java.awt.Color.darkGray);
        txtPassword.setForeground(java.awt.Color.orange);
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(java.awt.Color.orange);
        btnLogin.setForeground(java.awt.Color.white);
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(26, 26, 26))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(5, 5, 5)
                .addComponent(txtIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.setBackground(java.awt.Color.darkGray);

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/crystal-wijaya.png"))); // NOI18N

        lblUsername.setBackground(java.awt.Color.white);
        lblUsername.setFont(new java.awt.Font("Bradley Hand ITC", 0, 18)); // NOI18N
        lblUsername.setForeground(java.awt.Color.white);
        lblUsername.setText("Crystal Widjaja");

        mnAdd.setBackground(new java.awt.Color(80, 80, 80));
        mnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnAddMouseExited(evt);
            }
        });

        d.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        d.setForeground(java.awt.Color.white);
        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/nav-menu.png"))); // NOI18N
        d.setText("Add");

        javax.swing.GroupLayout mnAddLayout = new javax.swing.GroupLayout(mnAdd);
        mnAdd.setLayout(mnAddLayout);
        mnAddLayout.setHorizontalGroup(
            mnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnAddLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(d)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnAddLayout.setVerticalGroup(
            mnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(d)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnProfile.setBackground(new java.awt.Color(80, 80, 80));
        mnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnProfileMouseExited(evt);
            }
        });

        c.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c.setForeground(java.awt.Color.white);
        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/nav-menu.png"))); // NOI18N
        c.setText("Profile");

        javax.swing.GroupLayout mnProfileLayout = new javax.swing.GroupLayout(mnProfile);
        mnProfile.setLayout(mnProfileLayout);
        mnProfileLayout.setHorizontalGroup(
            mnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnProfileLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(c)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnProfileLayout.setVerticalGroup(
            mnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnReport.setBackground(new java.awt.Color(80, 80, 80));
        mnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnReportMouseExited(evt);
            }
        });

        b.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b.setForeground(java.awt.Color.white);
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/nav-menu.png"))); // NOI18N
        b.setText("Report");

        javax.swing.GroupLayout mnReportLayout = new javax.swing.GroupLayout(mnReport);
        mnReport.setLayout(mnReportLayout);
        mnReportLayout.setHorizontalGroup(
            mnReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnReportLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(b)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnReportLayout.setVerticalGroup(
            mnReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnExit.setBackground(new java.awt.Color(80, 80, 80));
        mnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnExitMouseExited(evt);
            }
        });

        a.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        a.setForeground(java.awt.Color.orange);
        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/exit.png"))); // NOI18N
        a.setText("Exit");

        javax.swing.GroupLayout mnExitLayout = new javax.swing.GroupLayout(mnExit);
        mnExit.setLayout(mnExitLayout);
        mnExitLayout.setHorizontalGroup(
            mnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnExitLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(a)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnExitLayout.setVerticalGroup(
            mnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(lblFoto))
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(mnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mnReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mnReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelNavigasi.setBackground(new java.awt.Color(80, 80, 80));

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/nav-menu1.png"))); // NOI18N
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelNavigasiLayout = new javax.swing.GroupLayout(panelNavigasi);
        panelNavigasi.setLayout(panelNavigasiLayout);
        panelNavigasiLayout.setHorizontalGroup(
            panelNavigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigasiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMenu)
                .addContainerGap())
        );
        panelNavigasiLayout.setVerticalGroup(
            panelNavigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavigasiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(java.awt.Color.white);

        jPanel7.setBackground(java.awt.Color.darkGray);

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/close.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lbSetting.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbSetting.setForeground(java.awt.Color.white);
        lbSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/settings.png"))); // NOI18N
        lbSetting.setText("Setting");
        lbSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSettingMouseClicked(evt);
            }
        });

        lbPencarian.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbPencarian.setForeground(new java.awt.Color(255, 255, 255));
        lbPencarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/icons8-detective-24.png"))); // NOI18N
        lbPencarian.setText("Search");
        lbPencarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPencarianMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPencarian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSetting)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose)
                .addGap(20, 20, 20))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClose, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSetting)
                        .addComponent(lbPencarian)))
                .addGap(0, 0, 0))
        );

        jPanel5.setLayout(new javax.swing.OverlayLayout(jPanel5));

        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/material-design-hd-background.jpg"))); // NOI18N
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 1843, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel1);

        jPanel20.setOpaque(false);
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel20MouseClicked(evt);
            }
        });

        pSetting.setBackground(java.awt.Color.darkGray);
        pSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pSettingMouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Set Language");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Settings");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Indonesian", "Deutsch", "Espanol", "Japan" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Darkside", "Light" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Set Theme");

        javax.swing.GroupLayout pSettingLayout = new javax.swing.GroupLayout(pSetting);
        pSetting.setLayout(pSettingLayout);
        pSettingLayout.setHorizontalGroup(
            pSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSettingLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(pSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pSettingLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(134, Short.MAX_VALUE)))
        );
        pSettingLayout.setVerticalGroup(
            pSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSettingLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(492, Short.MAX_VALUE))
            .addGroup(pSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pSettingLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel41)
                    .addContainerGap(635, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addComponent(pSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel20);

        jPanel4.setBackground(java.awt.Color.darkGray);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Copyright 2018 Go-clean.com");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel36)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelNavigasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNavigasi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        login();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        panelMenu.setVisible(true);
        panelNavigasi.setVisible(false);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void mnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnExitMouseClicked
        int exit = JOptionPane.showConfirmDialog(this,
                "Apakah anda yakin ingin keluar dari aplikasi? ", "Konfirmasi",
                JOptionPane.YES_NO_OPTION);
        if (exit==JOptionPane.YES_OPTION){
            form_awal(false);
        }
    }//GEN-LAST:event_mnExitMouseClicked

    private void mnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAddMouseEntered
        set_color1(mnAdd);
    }//GEN-LAST:event_mnAddMouseEntered

    private void mnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAddMouseExited
        set_color2(mnAdd);
    }//GEN-LAST:event_mnAddMouseExited

    private void mnProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnProfileMouseEntered
        set_color1(mnProfile);
    }//GEN-LAST:event_mnProfileMouseEntered

    private void mnProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnProfileMouseExited
        set_color2(mnProfile);
    }//GEN-LAST:event_mnProfileMouseExited

    private void mnReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnReportMouseEntered
        set_color1(mnReport);
    }//GEN-LAST:event_mnReportMouseEntered

    private void mnReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnReportMouseExited
        set_color2(mnReport);
    }//GEN-LAST:event_mnReportMouseExited

    private void mnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnExitMouseEntered
        set_color1(mnExit);
    }//GEN-LAST:event_mnExitMouseEntered

    private void mnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnExitMouseExited
        set_color2(mnExit);
    }//GEN-LAST:event_mnExitMouseExited

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        panelMenu.setVisible(false);
        panelNavigasi.setVisible(true);
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lbPencarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPencarianMouseClicked
        Pencarian.setVisible(true);
    }//GEN-LAST:event_lbPencarianMouseClicked

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseClicked
        pSetting.setVisible(false);
    }//GEN-LAST:event_jPanel20MouseClicked

    private void lbSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSettingMouseClicked
       pSetting.setVisible(true);
    }//GEN-LAST:event_lbSettingMouseClicked

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void pSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSettingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pSettingMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbPencarian;
    private javax.swing.JLabel lbSetting;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel mnAdd;
    private javax.swing.JPanel mnExit;
    private javax.swing.JPanel mnProfile;
    private javax.swing.JPanel mnReport;
    private javax.swing.JPanel pSetting;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelNavigasi;
    private javax.swing.JTextField txtIDUser;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
