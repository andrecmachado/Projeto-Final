package cadastro;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.*;
import javax.swing.text.*;
import javax.swing.JLabel;

public class Lista extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JList<String> jListCervejas;
    private JButton detalhes;
    private JButton remover;
    private JPanel panel;
    private JTextField textField;
    private JLabel lblPesquisarNaLista;
    
    public Lista() {
        initComponents();
    }
    
    private void initComponents() {
        
        jListCervejas = new javax.swing.JList<>();
        final DefaultListModel model = new DefaultListModel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista");
        setBounds(new java.awt.Rectangle(300, 150, 0, 0));
        setPreferredSize(new java.awt.Dimension(360, 440));
        setResizable(false);

        Acervo acervo = Acervo.getInstance();
        List<CervejaAtual> cervejas = acervo.getAcervo();
        for (CervejaAtual cerveja : cervejas) {
            model.addElement(cerveja.getNome());
        }        
        
        jListCervejas.setModel(model);
        detalhes = new JButton("Ver detalhes");
        detalhes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
            	verDetalhes();
            }
            
        });
        
        remover = new JButton("Remover");
        remover.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
            	remover();			
            }
        	
        });
        
        getContentPane().add(jListCervejas, BorderLayout.CENTER);
        JPanel pane = new JPanel();
        pane.add(detalhes, BorderLayout.WEST);
        pane.add(remover, BorderLayout.EAST);
        getContentPane().add(pane, BorderLayout.SOUTH);
        
        panel = new JPanel();
        getContentPane().add(panel, BorderLayout.NORTH);
        
        lblPesquisarNaLista = new JLabel("Pesquisar na lista:");
        panel.add(lblPesquisarNaLista);
        
        textField = new JTextField();
        textField.getDocument().addDocumentListener(
			new DocumentListener() {
				public void insertUpdate(DocumentEvent e) {
					pesquisarLista(textField.getText()); 
		        }
				public void removeUpdate(DocumentEvent e) {
					pesquisarLista(textField.getText());  
		        }
		        public void changedUpdate(DocumentEvent e) { }
			});
        
        	panel.add(textField);
        	textField.setColumns(10);
        	pack();
        
    		}
    
    	public void pesquisarLista(String texto) {
    		int pos = jListCervejas.getNextMatch(texto, 0, Position.Bias.Forward);
    		jListCervejas.setSelectedIndex(pos);
    		jListCervejas.ensureIndexIsVisible(pos);
    	}

    protected void verDetalhes() {
        int selectedIndex = jListCervejas.getSelectedIndex();
        if (selectedIndex >= 0) {
            List<CervejaAtual> cervejas = Acervo.getInstance().getAcervo();
            CervejaAtual cerveja = cervejas.get(selectedIndex);
            
            String message = "Nome: " + cerveja.getNome() + "\nNome Empresa: " + cerveja.getnomeEmpresa() + "\nTipo: " + cerveja.gettipo() + "\nNota: "+cerveja.getSnota() + "\nComentario: " + cerveja.getComentario();
            JOptionPane.showMessageDialog(this, message, "Detalhes da Cerveja", JOptionPane.INFORMATION_MESSAGE);
        } else {
        	JOptionPane.showMessageDialog(this, "NÃ£o foi possÃ­vel realizar a operaÃ§Ã£o. Selecione uma cerveja para proceder!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
	
    protected void remover() {
        int selectedIndex = jListCervejas.getSelectedIndex();
        if(selectedIndex >= 0) {
            String nome = jListCervejas.getSelectedValue();
            Acervo.getInstance().removeCerveja(nome);
			
            DefaultListModel<String> model = (DefaultListModel<String>) jListCervejas.getModel();
            model.remove(selectedIndex);
						
            JOptionPane.showMessageDialog(this, "Cerveja removida com sucesso", "Detalhes da Cerveja", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "NÃ£o foi possÃ­vel realizar a operaÃ§Ã£o. Selecione uma cerveja para proceder!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
