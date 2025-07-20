package interpreter_pattern;

public class Soma 
        implements Expressao{
    
    private final Expressao esquerda;
    private final Expressao direita;
    
    public Soma(Expressao esq, Expressao dir){
        this.direita = dir;
        this.esquerda = esq;
    }
    
    @Override
    public int interpretar(){
        return esquerda.interpretar() + direita.interpretar();   
    }
    
}
