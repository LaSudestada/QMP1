@SuppressWarnings("checkstyle:MissingJavadocType")
public class Prenda {
  private Tipo tipo;
  private String material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(Tipo tipo, String material, Color colorPrimario) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public Tipo getTipo() {
    return tipo;
  }

  public String getMaterial() {
    return material;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }
}
