package interpreter_pattern;

public class Calculadora {
    public static void main(String[] args) {
        Expressao expr = new Subtracao(
            new Soma(new Numero(15), new Numero(10)), new Numero(4)
        );
        
        System.out.println("Resultado: " + expr.interpretar());
    }
}
