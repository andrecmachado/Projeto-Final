package cadastro;

import java.io.Serializable;

public class CervejaAtual implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private  String nome;
    private  String nomeEmpresa;
    private  String tipo;
    private  String comentario;
    private  String Snota;
    
    public CervejaAtual(String nome,String nomeEmpresa,String tipo,String comentario,String Snota){
    	this.nome=nome;
        this.nomeEmpresa=nomeEmpresa;
        this.tipo=tipo;
        this.comentario=comentario;
        this.Snota=Snota;  
    }
      
    public String getNome(){
        return this.nome;
    }
    public String getnomeEmpresa(){
        return this.nomeEmpresa;
    }
    public String gettipo(){
        return this.tipo;
    }
    public String getComentario(){
        return this.comentario;
    }
    public String getSnota(){
        return this.Snota;
    }
           
}
