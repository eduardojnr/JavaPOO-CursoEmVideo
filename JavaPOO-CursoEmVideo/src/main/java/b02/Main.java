
package b02;

public class Main {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Preta";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.tampada = true;
        
        c1.tampar();
        System.out.println("");
        c1.rabiscar();
        System.out.println("");
        c1.destampar();
        System.out.println("");
        c1.rabiscar();
        System.out.println("");
        c1.status();
    }
    
}