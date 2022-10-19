
package poo.hotel;
public class Directeur {
     public String nom ; 
     public String prenom ;
     //
     public Directeur (){
       nom="";
       prenom="";}
        public Directeur (String n , String p){
           this.nom=n;
          this.prenom=p;}
        public void setNom(String n) {nom=n;}
        public void setPrenom(String p) {prenom=p;}
        public String getNom() {
		return nom;
	}
        public String getPrenom() {
		return prenom;
	} 
        public String toString(){
             return " le nom du directeur "+nom+" "+prenom;
      }
   
    
}//End
