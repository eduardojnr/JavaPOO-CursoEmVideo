
package b03;

public class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        // Não funciona pois ponta está como Private
        c1.carga = 80;
        // Funciona pois está dentro de uma classe que já está
        // utilizando a classe caneta

        c1.tampar();
        c1.status();
    }
    
}