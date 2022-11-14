package interfaces;

public interface PredicatStringGeneriqueI<T> {
    boolean test(String chaine);

    default PredicatStringGeneriqueI not(){
        return (chaine) -> !test(chaine);
    }

    default PredicatStringGeneriqueI and(PredicatStringI predicatStringI){
        return (chaine) -> predicatStringI.test(chaine) && test(chaine);
    }

    default PredicatStringGeneriqueI or(PredicatStringI predicatStringI){
        return  (chaine) -> predicatStringI.test(chaine) || test(chaine);
    }

    default PredicatStringGeneriqueI xor(PredicatStringI predicatStringI){
        return  (chaine) -> predicatStringI.test(chaine) ^ test(chaine);
    }
}
