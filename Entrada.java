package cadastro;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Entrada extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private Container container;
    private JButton btCadastrar;
//    private JButton btSair;
    private JButton btPesquisar;
    private JPanel panel;
    private JMenuBar menuBar;
    private JMenu mnOpcoes;
    private JMenuItem mntmSalvar;
    private JMenuItem mntmSair;

    public static void main(String args[]) {
	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
		new Entrada().setVisible(true);
            }
	});
    }
    
    
    public Entrada() {
        
        super("Sistema de Avaliação de Cervejas");
        container = getContentPane();
        container.setLayout(new GridLayout(0,1));
        GerenciadorBotoes btManager = new GerenciadorBotoes();
        
        panel = new JPanel();
        getContentPane().add(panel);
        
            btCadastrar = new JButton();  
            panel.add(btCadastrar);
            btCadastrar.setText("Cadastrar Cervejas");
            btCadastrar.setActionCommand("1");
            btCadastrar.addActionListener(btManager);
            
            btPesquisar = new JButton();
            panel.add(btPesquisar);
            btPesquisar.setText("Listar Cervejas");
            btPesquisar.setActionCommand("2");
            btPesquisar.addActionListener(btManager);
            
/*            btSair = new JButton();
            panel.add(btSair);
            btSair.setText("Sair");
            btSair.setActionCommand("3");
            btSair.addActionListener(btManager);
 */           
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	setBounds(new java.awt.Rectangle(300, 150, 0, 0));
        
        setSize(300, 200);
	setResizable(false);
	
	menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
	mnOpcoes = new JMenu("Opções");
	menuBar.add(mnOpcoes);
	
	mntmSalvar = new JMenuItem("Salvar");
	mnOpcoes.add(mntmSalvar);
	
	mntmSair = new JMenuItem("Sair");
	mntmSair.setActionCommand("3");
	mntmSair.addActionListener(btManager);
	mnOpcoes.add(mntmSair);
        
    }
    
    private class GerenciadorBotoes implements ActionListener {
        public GerenciadorBotoes() {}

        @Override
        public void actionPerformed(ActionEvent e) {
            if (null != e.getActionCommand()) {
                if ("1".equals(e.getActionCommand())) {
                    new Cadastra().setVisible(true);
                } else if("2".equals(e.getActionCommand())){
        			new Lista().setVisible(true);
                } else if("3".equals(e.getActionCommand())){
                	System.exit(0);
            	}
            }
        }
    }
    



}
