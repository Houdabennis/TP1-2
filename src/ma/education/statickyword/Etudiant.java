package ma.education.statickyword;

public class Etudiant {
    long id;
    String nom;
    static int nbEtudiants;

    public Etudiant(long id, String nom, int nb) {
        this.id = id;
        this.nom = nom;
        nbEtudiants += nb;
    }
     public static void main(String[] args) {
         Etudiant e1= new Etudiant(1, "AHMED", 20);
         Etudiant e2= new Etudiant(2, "SAID", 30);
      System.out.println(e1.id+e1.nom);
      System.out.println(e2.id+e2.nom);


     }

}