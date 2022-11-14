import interfaces.PredicatStringI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private PredicatStringI nulle;
    private PredicatStringI vide;
    @BeforeEach
    public void init(){
        this.nulle = (chaine) -> chaine == null;

        this.vide = (chaine) -> chaine.isEmpty();
    }

    @Test
    public void testPredicatString(){
        Assertions.assertEquals(true, nulle.test(null));
        Assertions.assertEquals(false, nulle.not().test(null));
    }
}