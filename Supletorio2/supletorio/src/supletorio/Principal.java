/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supletorio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author ESFOT
 */
public class Principal extends javax.swing.JFrame {

      //ArrayList<Producto> productos=new ArrayList<>();
      
    ClsControlador controller = new ClsControlador();
    ArrayList<Object>productos=new ArrayList<>();
    
    ArrayList<Object>ListaComputador=new ArrayList<>();
    
    ArrayList<Object>ListaAccesorio=new ArrayList<>();
    
    ArrayList<Object>ListaComponente=new ArrayList<>();
  
       
    
    
     String [][] Informacion;
    DefaultTableModel tblModelInformacion;
     
    
    /**
     * Creates new form Productos
     */
    public Principal() {
        initComponents();
        
        ListaComputador=controller.extraerObjetos("computador.dat");
        //llenarTablaComputador();
       ListaAccesorio = controller.extraerObjetos("accesorio.dat");
       //llenarTablaAccesorio();
       ListaComponente=controller.extraerObjetos("componente.dat");
       //llenarTablaComponente();
       
        //llenarTablaPro();
        
         
            productos.add("COMPUTADOR");
            productos.add("ACCESORIO");
            productos.add("COMPONENTE");
           
            
            cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel(productos.toArray()));
        
        
     PanelAccesorio.setVisible(false);
     PanelComponente.setVisible(false);
     Panelcomputador.setVisible(false);
     PanelMain.setVisible(false);
     btnRegistrarComputadores.setEnabled(false);
         ///////////////
        
    }

    
   /* public void limpiarTabla(){
       DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        while(modelo.getRowCount()>0)modelo.removeRow(0);
 
        TableColumnModel modCol = tblProductos.getColumnModel();
        while(modCol.getColumnCount()>0)modCol.removeColumn(modCol.getColumn(0));
    }
    */
    
    public void llenarTablaComputador(){
       
         
         int Capacidad=Integer.parseInt(txtCapacidadComputador.getText());
         int RAM=Integer.parseInt(txtRam.getText());
         String procesador=txtProcesador.getText();
         String nombre=txtNombre.getText();
         double precio=Double.parseDouble(txtPrecio.getText());
         
         String marca=txtMarca.getText();
         String tipo=txtTipoComputador.getText();  
     // String tipo, int capacidad, int RAM, String procesador, String nombre, double precio, String marca
     
         if(ListaComputador.size() > 0){                  
            Computador  compu = new Computador(nombre, precio, marca);
            DefaultTableModel model = (DefaultTableModel) tblProductos.getModel();
            for(int i = 0; i < ListaComputador.size(); i ++){
                compu = (Computador) ListaComputador.get(i);
                Object computadorG [] = {compu.getNombre(),compu.getPrecio(),compu.getMarca()};
                model.insertRow(i, computadorG);
            }
            
        }
    }
    
     
    public void llenarTablaAccesorio(){
         String tipoAc=txtTipoAc.getText();
         String color=txtColor.getText();
         String nombre=txtNombre.getText();
         double precio=Double.valueOf(txtPrecio.getText());
         String marca=txtMarca.getText();
     
         if(ListaAccesorio.size() > 0){                  
            Accesorio  ac = new Accesorio(tipoAc, color, nombre,precio, marca);
            DefaultTableModel modelac = (DefaultTableModel) tblProductos.getModel();
            for(int i = 0; i < ListaAccesorio.size(); i ++){
                ac = (Accesorio) ListaAccesorio.get(i);
                Object acG [] = {ac.getNombre(),ac.getMarca(),ac.getTipoAc(),ac.getColor()};
                modelac.insertRow(i, acG);
            }
        }
    }
    
    
      public void llenarTablaComponente(){
         String tipocom=txtTipoComponente.getText();
         int CapacidadCom=Integer.parseInt(txtCapacidadComponente.getText());
         int velocidadCom=Integer.parseInt(txtVelocidad.getText());
         String nombre=txtNombre.getText();
         double precio=Double.valueOf(txtPrecio.getText());
         String marca=txtMarca.getText();
      
         if(ListaComponente.size() > 0){        
             
            Componente  com = new Componente(tipocom, CapacidadCom, velocidadCom, nombre, precio, marca);
            DefaultTableModel modelcm = (DefaultTableModel) tblProductos.getModel();
            for(int i = 0; i < ListaComponente.size(); i ++){
                com = (Componente) ListaComponente.get(i);
                Object comG [] = {com.getNombre(),com.getPrecio(),com.getMarca(),com.getTipoCom(),com.getCapacidadCom(),com.getVelocidadCom()};
                modelcm.insertRow(i, comG);
            }
        }
    }
    
     
     
     
     
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbCategoria = new javax.swing.JComboBox<>();
        PanelMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Panelcomputador = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTipoComputador = new javax.swing.JTextField();
        txtCapacidadComputador = new javax.swing.JTextField();
        txtRam = new javax.swing.JTextField();
        txtProcesador = new javax.swing.JTextField();
        btnRegistrarComputadores = new javax.swing.JButton();
        PanelComponente = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTipoComponente = new javax.swing.JTextField();
        txtCapacidadComponente = new javax.swing.JTextField();
        txtVelocidad = new javax.swing.JTextField();
        btnRegistrarComponentes = new javax.swing.JButton();
        PanelAccesorio = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTipoAc = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        btnRegistrarAccesorios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO DE PRODUCTOS")));

        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        PanelMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("NOMBRE");

        jLabel2.setText("PRECIO");

        jLabel3.setText("MARCA");

        javax.swing.GroupLayout PanelMainLayout = new javax.swing.GroupLayout(PanelMain);
        PanelMain.setLayout(PanelMainLayout);
        PanelMainLayout.setHorizontalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        PanelMainLayout.setVerticalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(PanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(cmbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("INFORMACION"));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Marca", "Tipo", "Capacidad", "RAM", "Procesador", "color", "Velocidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("ARTICULOS"));

        Panelcomputador.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panelcomputador.setEnabled(false);

        jLabel4.setText("COMPUTADOR");

        jLabel5.setText("tipo");

        jLabel6.setText("capacidad");

        jLabel7.setText("RAM");

        jLabel8.setText("procesador");

        btnRegistrarComputadores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrarComputadores.setText("REGISTRAR");
        btnRegistrarComputadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarComputadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelcomputadorLayout = new javax.swing.GroupLayout(Panelcomputador);
        Panelcomputador.setLayout(PanelcomputadorLayout);
        PanelcomputadorLayout.setHorizontalGroup(
            PanelcomputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelcomputadorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelcomputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelcomputadorLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelcomputadorLayout.createSequentialGroup()
                        .addGroup(PanelcomputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelcomputadorLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelcomputadorLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTipoComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelcomputadorLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelcomputadorLayout.createSequentialGroup()
                                .addGroup(PanelcomputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(txtCapacidadComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelcomputadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarComputadores)
                .addGap(45, 45, 45))
        );
        PanelcomputadorLayout.setVerticalGroup(
            PanelcomputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelcomputadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelcomputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtTipoComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelcomputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCapacidadComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelcomputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelcomputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnRegistrarComputadores)
                .addContainerGap())
        );

        PanelComponente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelComponente.setEnabled(false);

        jLabel14.setText("COMPONENTE");

        jLabel15.setText("tipo");

        jLabel16.setText("capacidad");

        jLabel18.setText("Velocidad");

        btnRegistrarComponentes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrarComponentes.setText("REGISTRAR");
        btnRegistrarComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarComponentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelComponenteLayout = new javax.swing.GroupLayout(PanelComponente);
        PanelComponente.setLayout(PanelComponenteLayout);
        PanelComponenteLayout.setHorizontalGroup(
            PanelComponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelComponenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelComponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelComponenteLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTipoComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelComponenteLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelComponenteLayout.createSequentialGroup()
                        .addGroup(PanelComponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(txtCapacidadComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelComponenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarComponentes)
                .addGap(45, 45, 45))
        );
        PanelComponenteLayout.setVerticalGroup(
            PanelComponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelComponenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelComponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtTipoComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelComponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCapacidadComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelComponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarComponentes)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PanelAccesorio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelAccesorio.setEnabled(false);

        jLabel9.setText("ACCESORIO");

        jLabel10.setText("tipo");

        jLabel11.setText("Color");

        btnRegistrarAccesorios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrarAccesorios.setText("REGISTRAR");
        btnRegistrarAccesorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAccesoriosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAccesorioLayout = new javax.swing.GroupLayout(PanelAccesorio);
        PanelAccesorio.setLayout(PanelAccesorioLayout);
        PanelAccesorioLayout.setHorizontalGroup(
            PanelAccesorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAccesorioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelAccesorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAccesorioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnRegistrarAccesorios)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelAccesorioLayout.createSequentialGroup()
                        .addGroup(PanelAccesorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAccesorioLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTipoAc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelAccesorioLayout.createSequentialGroup()
                                .addGroup(PanelAccesorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        PanelAccesorioLayout.setVerticalGroup(
            PanelAccesorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAccesorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAccesorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtTipoAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAccesorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnRegistrarAccesorios))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panelcomputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(PanelComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Panelcomputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
        
         String opcion=cmbCategoria.getSelectedItem().toString();
         
         if(opcion.equals("COMPUTADOR")){
                Panelcomputador.setVisible(true);
                PanelComponente.setVisible(false);
                PanelAccesorio.setVisible(false);
                PanelMain.setVisible(true);
                
            }
            
            if(opcion.equals("COMPONENTE")){
                Panelcomputador.setVisible(false);
                PanelComponente.setVisible(true);
                PanelAccesorio.setVisible(false);
                PanelMain.setVisible(true);
    }
            
            if(opcion.equals("ACCESORIO")){
                Panelcomputador.setVisible(false);
                PanelComponente.setVisible(false);
                PanelAccesorio.setVisible(true);
                PanelMain.setVisible(true);
            }
            
         btnRegistrarComputadores.setEnabled(true);  
            
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnRegistrarComputadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarComputadoresActionPerformed
        // TODO add your handling code here:
        
        String tipo=txtTipoComputador.getText();
         int Capacidad=Integer.parseInt(txtCapacidadComputador.getText());
         int RAM=Integer.parseInt(txtRam.getText());
         String procesador=txtProcesador.getText();
         String nombre=txtNombre.getText();
         double precio=Double.valueOf(txtPrecio.getText());
         String marca=txtMarca.getText();
        
         Computador nuevoComputador = new Computador(tipo, Capacidad, RAM, procesador, nombre, precio, marca);
        
        ListaComputador.add(nuevoComputador);
        controller.escribirObjeto("computador.dat", ListaComputador);
        ListaComputador = controller.extraerObjetos("computador.dat");
//String tipo, int capacidad, int RAM, String procesador, String nombre, double precio, String marca
        Object ComputadorG [] = {nuevoComputador.getNombre(),nuevoComputador.getPrecio(),nuevoComputador.getMarca(),nuevoComputador.getTipo(),nuevoComputador.getCapacidad(),nuevoComputador.getRAM(),nuevoComputador.getProcesador()};
        DefaultTableModel model = (DefaultTableModel) tblProductos.getModel();
        model.addRow(ComputadorG);
      
        
    }//GEN-LAST:event_btnRegistrarComputadoresActionPerformed

    private void btnRegistrarAccesoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAccesoriosActionPerformed
        // TODO add your handling code here:
         String tipoAc=txtTipoAc.getText();
         String color=txtColor.getText();
         String nombreac=txtNombre.getText();
         double precioac=Double.valueOf(txtPrecio.getText());
         String marcaac=txtMarca.getText();  
         
         Accesorio newAccesorio = new Accesorio(tipoAc, color, nombreac, precioac, marcaac);
                
        ListaAccesorio.add(newAccesorio);
        controller.escribirObjeto("accesorio.dat", ListaAccesorio);
        ListaAccesorio = controller.extraerObjetos("accesorio.dat");
//String tipoAc, String Color, String nombre, double precio, String marca
        Object accesorioG [] = {newAccesorio.getNombre(),newAccesorio.getPrecio(),newAccesorio.getMarca(),newAccesorio.getTipoAc(), newAccesorio.getColor()};
        DefaultTableModel modelAc = (DefaultTableModel) tblProductos.getModel();
        modelAc.addRow(accesorioG);
        
        //txtPrecio.set;
    }//GEN-LAST:event_btnRegistrarAccesoriosActionPerformed

    private void btnRegistrarComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarComponentesActionPerformed
        // TODO add your handling code here:
         //////////////////////////////////////////////
         String tipocom=txtTipoComponente.getText();
         int CapacidadCom=Integer.parseInt(txtCapacidadComponente.getText());
         int velocidadCom=Integer.parseInt(txtVelocidad.getText());
         String nombrecom=txtNombre.getText();
         double preciocom=Double.valueOf(txtPrecio.getText());
         String marcacom=txtMarca.getText();
        ///String TipoCom, int capacidadCom, int velocidadCom, String nombre, double precio, String marca
          Componente newComponente = new Componente(tipocom, CapacidadCom, velocidadCom, nombrecom, preciocom, marcacom);
        
            
        ListaComponente.add(newComponente);
        controller.escribirObjeto("componente.dat", ListaComponente);
        ListaComponente = controller.extraerObjetos("componente.dat");

        Object componenteG [] = {newComponente.getNombre(),newComponente.getPrecio(),newComponente.getMarca(),newComponente.getTipoCom(),newComponente.getCapacidadCom(),newComponente.getVelocidadCom()};
        DefaultTableModel modelcom = (DefaultTableModel) tblProductos.getModel();
        modelcom.addRow(componenteG);
      
    }//GEN-LAST:event_btnRegistrarComponentesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAccesorio;
    private javax.swing.JPanel PanelComponente;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JPanel Panelcomputador;
    private javax.swing.JButton btnRegistrarAccesorios;
    private javax.swing.JButton btnRegistrarComponentes;
    private javax.swing.JButton btnRegistrarComputadores;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCapacidadComponente;
    private javax.swing.JTextField txtCapacidadComputador;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProcesador;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtTipoAc;
    private javax.swing.JTextField txtTipoComponente;
    private javax.swing.JTextField txtTipoComputador;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables
}
