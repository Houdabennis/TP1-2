package ma.education.tp1;

import static java.lang.System.out;

public class AccesSamePackage {

    public static void main(String[] args) {
        Salle S = new Salle("SallaB");
        out.println(S.id);
        out.println(S.nom);
    }
}
