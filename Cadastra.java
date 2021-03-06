package cadastro;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Dimension;

public class Cadastra extends JFrame {
	
	private static final long serialVersionUID = 1L;

	private JButton btCadastrar;
    private JButton btLimpar;
    private JLabel lbNome;
    private JLabel lbEmpresa;
    private JLabel lbTipo;
    private JLabel lbNota;
    private JLabel lbComentario;
    private JComboBox cbNota;
    private JTextArea tfComentario;
    private JTextField tfEmpresa;
    private JTextField tfTipo;
    private JTextField tfNome;
    
    public Cadastra() {
    	setPreferredSize(new Dimension(360, 440));
    	setSize(new Dimension(360, 440));
    	getContentPane().setSize(new Dimension(400, 350));
    	setResizable(true);
        initComponents();
    }

    private void initComponents() {
        
        lbNome = new JLabel();
        tfNome = new JTextField();
        lbEmpresa = new JLabel();
        tfEmpresa = new JTextField();
        lbTipo = new JLabel();
        tfTipo = new JTextField();
        lbNota = new JLabel();
        lbComentario = new JLabel();
        cbNota = new JComboBox();
        btCadastrar = new JButton();
        btLimpar = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Breja");
        setBounds(new java.awt.Rectangle(300, 150, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                windowClose(evt);
            }
        });

        lbNome.setText("Nome da Cerveja");
        lbEmpresa.setText("Empresa");

        tfEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnaActionPerformed(evt);
            }
        });

        lbTipo.setText("Tipo");
        lbNota.setText("Nota");
        lbComentario.setText("ComentÃ¡rio");

        cbNota.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
        cbNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        tfComentario = new JTextArea();
        
                tfComentario.setColumns(20);
                tfComentario.setRows(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lbComentario)
        					.addContainerGap(661, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(tfComentario, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lbNome)
        						.addComponent(lbEmpresa)
        						.addComponent(lbNota)
        						.addComponent(lbTipo))
        					.addGap(10)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(cbNota, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addContainerGap())
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(tfTipo, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        								.addComponent(tfEmpresa)
        								.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
        							.addContainerGap(65, Short.MAX_VALUE))))))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(47)
        			.addComponent(btCadastrar)
        			.addGap(64)
        			.addComponent(btLimpar)
        			.addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lbNome)
        				.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lbEmpresa)
        				.addComponent(tfEmpresa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lbTipo)
        				.addComponent(tfTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lbNota)
        				.addComponent(cbNota, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(29)
        			.addComponent(lbComentario)
        			.addGap(13)
        			.addComponent(tfComentario, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btCadastrar)
        				.addComponent(btLimpar))
        			.addContainerGap(13, Short.MAX_VALUE))
        );
        layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {btCadastrar, btLimpar});
        getContentPane().setLayout(layout);
        pack();
    }

    private void notaActionPerformed(java.awt.event.ActionEvent evt) {
        //
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { // Apaga os caracteres escritos                                     
        tfNome.setText("");
        tfEmpresa.setText("");
        tfTipo.setText("");
        tfComentario.setText("");
        cbNota.setSelectedIndex(0);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { // Gravar os dados cadastrados
    	
        String nome = tfNome.getText();
        String nomeEmpresa = tfEmpresa.getText();
        String tipo = tfTipo.getText();
        String comentario = tfComentario.getText();
        int selecionado = cbNota.getSelectedIndex();
        String Snota = Integer.toString(selecionado + 1);
        
        if (nome == null || nome.trim().equals("")) { // Se o nome for null ou o nome, retirando os espaÃƒÂ§os em branco, for igual a ""
            JOptionPane.showMessageDialog(this, "NÃ£o foi possÃ­vel adicionar. ForneÃ§a o nome da Cerveja!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean temCerveja = Acervo.getInstance().temCerveja(nome);
            if (temCerveja) {
        	JOptionPane.showMessageDialog(this, "NÃ£o foi possÃ­vel adicionar. Cerveja com mesmo nome jÃ¡ cadastrado!", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
	        CervejaAtual cerveja = new CervejaAtual(nome ,nomeEmpresa,tipo , comentario, Snota);
	        Acervo acervo = Acervo.getInstance();
	        acervo.addCerveja(cerveja);
	        
	        JOptionPane.showMessageDialog(this, "Adicionado com sucesso!", "InformaÃ§Ã£o", JOptionPane.INFORMATION_MESSAGE);
	        this.dispose();
            }
        }
    }
    

    private void txtnaActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void windowClose(java.awt.event.WindowEvent evt) {
        
    }

}
