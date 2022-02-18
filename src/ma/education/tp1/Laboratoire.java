package ma.education.tp1;

public class Laboratoire extends  Salle{
    String type ;

    public Laboratoire (long id ,String nom , String type){
        super(nom, id);
        this.type=type;

    }

}
