package contornos.ud3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumerosOpTest {
@Test
void testSumaDigitos() {
assertEquals(6, NumerosOp.sumaDigitos(123));
assertEquals(1, NumerosOp.sumaDigitos(1));
assertEquals(10, NumerosOp.sumaDigitos(190));
}

}
