import interfaces.PredicatStringI;

public class Main {
    public static void main(String[] args) {
        PredicatStringI nulle = (chaine) -> chaine == null;
        PredicatStringI nonNulle = (chaine) -> nulle.not().test(chaine);

        PredicatStringI vide = (chaine) -> chaine.isEmpty();
        PredicatStringI nonVide = (chaine) -> vide.not().test(chaine);

        PredicatStringI nonNulleEtNonVide = (chaine) -> nonVide.and(nonNulle).test(chaine);
    }
}
