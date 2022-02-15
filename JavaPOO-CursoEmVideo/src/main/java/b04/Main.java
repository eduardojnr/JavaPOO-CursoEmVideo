
package b04;

public class Main {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta(); // Sem atributos
        c1.status();
        System.out.println("");
        
        Caneta c2 = new Caneta(); // Somente o atributo modelo
        c2.setModelo("BIC");
        c2.status();
        System.out.println("");
        
        Caneta c3 = new Caneta(/*"Faber Castel", 0.9f*/); // Ambos os atributos
        c3.setModelo("Faber Castel");
        c3.setPonta(0.9f);
        c3.status();
    }
    
}