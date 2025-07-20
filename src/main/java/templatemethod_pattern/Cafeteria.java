package templatemethod_pattern;

public class Cafeteria {
    
    public static void main(String[] args) {
        
        System.out.println("Preparando Café\n");
        BebidaQuente cafe = new Cafe();
        cafe.prepararReceita();

        System.out.println("Preparando Chá");
        BebidaQuente cha = new Cha();
        cha.prepararReceita();
    }
}