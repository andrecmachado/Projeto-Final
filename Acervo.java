package cadastro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class Acervo implements Serializable {

    private List<CervejaAtual> acervo = new ArrayList<CervejaAtual>();
    private static Acervo meuAcervo;
    File agd = new File("agenda.poo");
    private static final long serialVersionUID = 12313333;

    public List<CervejaAtual> getAcervo() {
    	return this.acervo;
    }

    public void addCerveja(CervejaAtual cerveja) {
    	this.acervo.add(cerveja);
    }
    
    public void removeCerveja(String nome) {
    	for (CervejaAtual cerveja : acervo) {
            if (cerveja.getNome() != null && cerveja.getNome().equalsIgnoreCase(nome)) {
            	acervo.remove(cerveja);
            	return;
            }
    	}
    }

    public static Acervo getInstance() {
    	if (meuAcervo == null) {
            meuAcervo = new Acervo();
    	}
        return meuAcervo;
    }

    void open (File agd) throws IOException, ClassNotFoundException {
    	this.agd = agd;
    	if (agd.exists()) {
            ObjectInputStream in = new ObjectInputStream (new FileInputStream(agd));
            acervo = (ArrayList<CervejaAtual>) in.readObject();
            in.close();
    	}
    }

    public void save() throws IOException {
    	ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream(agd));
    	out.writeObject(acervo);
    	out.close();
    }

    public boolean temCerveja(String nome) {
    	for (CervejaAtual cerveja : acervo) {
    		if (cerveja.getNome() != null && cerveja.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
    	}	
    	return false;
    }

    void setVisible(boolean b) {
        //
    }

}
