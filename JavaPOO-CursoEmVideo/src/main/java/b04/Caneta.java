
package b04;

public class Caneta {
    
    private String modelo;
    private float ponta;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.getPonta());
    }
    
    // Construtor
    
    // Caso seja instanciado o objeto sem atributos
    public Caneta(){
        this.modelo = "Sem modelo definido.";
        this.ponta = 0.0f;
    }
    
    // Caso seja instanciado somente passando o modelo
    public Caneta(String modelo){
        this.modelo = modelo;
        this.ponta = 0.7f;
    }

    // Caso seja instanciado com ambos os atributos
    public Caneta(String modelo, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
}