package interfaces;

@FunctionalInterface
public interface PredicatStringI {
    boolean test(String chaine);

    default PredicatStringI not(){
        return (chaine) -> !test(chaine);
    }

    default PredicatStringI and(PredicatStringI predicatStringI){
        return (chaine) -> predicatStringI.test(chaine) && test(chaine);
    }
}
