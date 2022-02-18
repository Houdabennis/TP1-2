package ma.education.tp1;


public class Test {

    public static void main (String []args){
        Salle o1 = new Salle();
        Salle o2 = new Salle("salle informatique  ");
        System.out.println(o2.nom);
        Salle o3 = new Salle("salle des cours ",2);
        System.out.println(o3.id);
        System.out.println(o3.nom);
    }
}