package ma.education.tp1;

public class Salle {
    public static long id;
  public static String nom;

    //  private long id;
  // private String nom ;
    //protected long id;
   // protected String nom;
    public Salle() {

    }

  public Salle(String nom){
        this.nom= nom;
    }
    public Salle(String nom, long id){
        this.id=id;
        this.nom=nom;
        Object o1=null;
        assert o1 != null;
        o1.equals(id);
    }


}

