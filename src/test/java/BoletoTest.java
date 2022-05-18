import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class BoletoTest {

    //codigo antigo
    @org.junit.jupiter.api.Test
    void deveeRetornarNumeroDaConta() {
        ContaLuz contaLuz = new ContaLuz(23123131, "conta de luz");

        Assertions.assertEquals("conta de luz", contaLuz.getName());
        Assertions.assertEquals(23123131, contaLuz.getBarCode());
    }

    //codigo refatorado

    @org.junit.jupiter.api.Test
    void deveeRetornarNumeroDaContaRefatorado() {
        ContaLuzRefatorado contaLuz = new ContaLuzRefatorado(56565656, "conta de agua");

        Assertions.assertEquals("conta de agua", contaLuz.getName());
        Assertions.assertEquals(56565656, contaLuz.getBarCode());
    }
}