package templatemethod_pattern;

public abstract class BebidaQuente {
    
    public final void prepararReceita() {
        ferverAgua();
        adicionarIngredientes();
        despejarNoCopo();
        adicionarCondimentos();
    }

    protected abstract void adicionarIngredientes();
    protected abstract void adicionarCondimentos();

    private void ferverAgua(){ 
        System.out.println("Fervendo água"); 
    }
    
    private void despejarNoCopo(){ 
        System.out.println("Despejando no copo");
    }
}