
/* Criar a classe Caneta
 
 * Atributos:
 *   modelo -> String
 *    cor   -> String
 *   ponta  -> float
 *   carga  -> int
 *  tampada -> boolean

 * Métodos:
 *  rabiscar()
 *  tampar()
 *  destampar()
 *  status()

 */

package b02;

public class Caneta {
    
    String modelo;
    String cor;
    Float ponta; // Com float não será possível comparar com null no método status()
    Integer carga; // Com int não será possível comparar com null no método status()
    boolean tampada;
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Você precisa destampar a caneta para usá-la.");
        } else {
            System.out.println("Rabisco.");
        }
    }
    
    void tampar(){
        if (this.tampada == true){
            System.out.println("Essa caneta já está tampada.");
        } else {
            this.tampada = true;
            System.out.println("Caneta tampada com sucesso.");
        }
    }
    
    void destampar(){
        if (this.tampada == false){
            System.out.println("Essa caneta já está destampada.");
        } else {
            this.tampada = false;
            System.out.println("Caneta destampada com sucesso.");
        }
    }
    
    void status(){
        // Verifica se o modelo está definido
        if (this.modelo != null){
            System.out.println("Modelo: " + this.modelo);
        } else {
            System.out.println("Modelo: Não Encontrado.");
        }
        
        // Verifica se a cor está definida
        if (this.cor != null){
            System.out.println("Cor: " + this.cor);
        } else {
            System.out.println("Cor: Não Encontrada.");
        }
        
        // Verifica se a ponta está definida
        if (this.ponta != null){
            System.out.println("Ponta: " + this.ponta);
        } else {
            System.out.println("Ponta: Não Definida");
        }
               
        // Verifica se a carga está definida
        if (this.carga != null){
            System.out.println("Carga: " + this.carga);
        } else {
            System.out.println("Carga: Não Encontrada.");
        }
        
        // Imprime de maneira legível para o usuário
        if (this.tampada == true){
            System.out.println("Está tampada? Sim");
        } else {
            System.out.println("Está tampada? Não");
        }
    }
    
}