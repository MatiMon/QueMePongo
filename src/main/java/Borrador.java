public class Borrador {
  TipoPrenda tipoPrenda;
  Material material;
  Color colorPrimario;
  Color colorSecundario;
  Trama trama;
  int temperaturaMaximaAdecuada;

  public Prenda crearPrenda() {
    return new Prenda(tipoPrenda, material, colorPrimario, colorSecundario, trama, temperaturaMaximaAdecuada);
  }

  //Setters
  public void setTipoPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public void setColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setTrama(Trama trama) {
    this.trama = trama;
  }

  public void setTemperaturaMaximaAdecuada(int temperaturaMaximaAdecuada) {
    this.temperaturaMaximaAdecuada = temperaturaMaximaAdecuada;
  }
}
