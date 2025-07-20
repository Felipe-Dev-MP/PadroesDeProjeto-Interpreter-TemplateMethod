package templatemethod_pattern;

public class Cafe 
        extends BebidaQuente {
    
    @Override
    protected void adicionarIngredientes() {
        System.out.println("Adicionando pó de café");
    }
    
    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando açúcar e leite");
    }
}