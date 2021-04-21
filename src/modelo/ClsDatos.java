
package modelo;

public class ClsDatos {
    
    
    private float DatoA;
    private float DatoB;
    private float DatoC;
    
    
     
    public float getDatoA() {
        return DatoA;
    }

    public void setDatoA(float DatoA) {
        this.DatoA = DatoA;
    }

    public float getDatoB() {
        return DatoB;
    }

    public void setDatoB(float DatoB) {
        this.DatoB = DatoB;
    }

    public float getDatoC() {
        return DatoC;
    }

    public void setDatoC(float DatoC) {
        this.DatoC = DatoC;
    }


  private float calcularDiscriminante(){
      
      float discriminante;
      discriminante= (float) ((this.DatoB)*(this.DatoB)-4*(this.DatoA)*(this.DatoC));
      
      return discriminante;
    
      } 
  public float parteReal(){
      
      
      float x1;
      x1=(float) (-this.DatoB)/(2*this.DatoA);
              
      return x1;
  }  
  public float parteImaginaria(){
      
      
      float x2;
       x2= (float) calcularDiscriminante() /(2*this.DatoA);      
      
      return x2;
  }
  public float calculoParteImaginaria(){
      
      float x2;
       x2= (float) Math.sqrt((calcularDiscriminante())*(-1)) /(2*this.DatoA);      
      return x2;
  }
  
  public float calcularRaiz(){
      
      float raiz;
      raiz=(float) Math.sqrt(calcularDiscriminante())/(2*this.DatoA);
      return raiz;
  }
  
}    
    
    

