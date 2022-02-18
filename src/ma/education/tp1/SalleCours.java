package ma.education.tp1;

public class SalleCours extends  Salle {
    int nbPlaces;


public SalleCours (long id ,String nom , int  nbPlaces  ){

super(nom, id);
this.nbPlaces=nbPlaces;
}
}