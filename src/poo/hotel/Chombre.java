
package poo.hotel;

public class Chombre {
  private double prix ;
  private int nbList ; 
  private int numero ; 
  
  //const par defaut 
    public Chombre(){
       prix=0.0;
       nbList=0;
       numero=0;
    }
    //co,st par parametre
    public Chombre(double prix , int nbList , int numero ){
        this.prix=prix;
        this.nbList=nbList;
        this.numero=numero;
    }
    public void setNbLits(int nb) {nbList=nb;}
    public void setNumero(int num) {numero=num;}
    public void setPrix(double pr) {prix=pr;}
    public String toString(){
             return "numero de chombre est "+numero+ " de le liste numero "+nbList+" sa prix est "+prix;
      }
    
}//€nd
