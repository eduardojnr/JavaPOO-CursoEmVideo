
package b05;

public class ContaBanco {
    
    public int numConta;
    protected String tipo; //CC ou CP
    private String dono;
    private float saldo;
    private boolean status;
    
    // Métodos Personalizados
    public void abrirConta(String tipoEscolhido){
        this.setTipo(tipoEscolhido); // this.tipo = tipoEscolhido;
        this.setStatus(true); // this.status = true;
        if (tipoEscolhido.equalsIgnoreCase("CC")){
            this.setSaldo(50); // this.saldo = 50;
        } else if (tipoEscolhido.equalsIgnoreCase("CP")){
            this.setSaldo(150); // this.saldo = 150;
        }
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta em débito");
        } else { // Significa que o saldo é exatamente 0
            this.setStatus(false);
        }
    }
    
    public void depositar(float valorDeposito){
        if (this.isStatus()){ // Verifica se o valor é true
            this.setSaldo(this.getSaldo() + valorDeposito);
        }
    }
    
    public void sacar(float valorSaque){
        if (this.isStatus() == true){
            if (this.getSaldo() >= valorSaque){
                this.setSaldo(this.getSaldo() - valorSaque);
            }
        }
    }
    
    public void pagarMensal(){
        float valorAnuidade = 0;
        if (this.getTipo().equalsIgnoreCase("CC")){
            valorAnuidade = 12;
        } else if (this.getTipo().equalsIgnoreCase("CP")){
            valorAnuidade = 20;
        }
        
        if (this.isStatus()){
            // Admitindo que a conta pode ficar em débito
            this.setSaldo(this.getSaldo() - valorAnuidade);
        } 
    }
    
    // Construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
        
}