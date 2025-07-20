package templatemethod_pattern;

public class Cha 
        extends BebidaQuente {
    
    @Override
    protected void adicionarIngredientes() {
        System.out.println("Adicionando o saquinho de chá");
    }
    
    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando limão");
    }
    
    @Override
    protected boolean clienteQuerCondimentos() {
        return false;
    }
}