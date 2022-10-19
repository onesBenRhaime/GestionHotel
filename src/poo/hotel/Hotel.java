package poo.hotel;
public class Hotel {
    private String nom ;
    private String adresse;
    private String categorie;
    private int nbChombres ;
    //declaration d'un tab des chombres
    public Chombre[]tabchm ;
    Directeur d1 ;
    //const
    public Hotel(String nom ,String categorie){
         this.nom=nom;
         this.categorie=categorie;
         nbChombres++; 
         tabchm=new Chombre[100];
    }
    public String toString(){
             return nom+ " sa categorie " +categorie+" il a  "+nbChombres ;
         }
    public void ajouterChambre(int i , double pr,int nbl,int num){
        
    tabchm[i].setPrix(pr);
    tabchm[i].setNbLits(nbl);
    tabchm[i].setNumero(num);
    }
    public void ajouterDirecteur (String n , String p){
       d1.setNom(n);
       d1.setPrenom(p);
    }
        
    public void affiche(){
         System.out.println(nom+ " sa categorie " +categorie+" il a  "+nbChombres+" sa  Directeur est  "+d1.getNom()+" "+d1.getPrenom());
    }
    
    
}//EndClass
