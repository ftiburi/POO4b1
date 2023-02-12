
public class Caneta {
   
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String m, String c, float p){ //metodo construtor
       this.modelo = m;
       this.cor = c;
       this.setPonta(p);
       this.tampar();

    }

    public String getModelo() {
      return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta =p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public String getCor(){
        return this.cor;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean t){
        this.tampada = t;
    }

    public void status(){
        System.out.println("Sobre a caneta");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("cor " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }
}
    
