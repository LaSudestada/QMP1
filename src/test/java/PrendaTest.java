import org.testng.annotations.Test;

public class PrendaTest {
  @Test
  public void test() {
    Prenda zapasToper = new Prenda(new Tipo(Categoria.CALZADO), "Cuero", new Color(0, 0, 0));
    zapasToper.setColorSecundario(new Color(255, 255, 255));
  }
}
