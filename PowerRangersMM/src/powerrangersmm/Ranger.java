package powerrangersmm;


public abstract class Ranger {
    String nome;
    String cor;
    String armaPrincipal;
    
    public void atacar(){
        System.out.println("Usando" + this.armaPrincipal);
    }
    
    public void defender(){
        System.out.println("Defendendo");
        
    }
    
    public abstract void transformar(){
        
    }
}

