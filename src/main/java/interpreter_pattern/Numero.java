package interpreter_pattern;

public class Numero 
        implements Expressao{
    
    private final int valor;

    public Numero(int valor){ 
        this.valor = valor; 
    }

    @Override
    public int interpretar(){ 
        return this.valor; 
    }
}
