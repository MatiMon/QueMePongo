public class Prenda {
  TipoPrenda tipoPrenda;
  Material material;
  Color colorPrimario;
  Color colorSecundario;
  Trama trama;

  public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario, Trama trama) {
    validaciones(tipoPrenda, material, colorPrimario);

    //Configuracion
    if (trama == null) {
      this.trama = Trama.LISA;
    } else this.trama = trama;

    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public Prenda(TipoPrenda tipoPrenda) {
    if (tipoPrenda == null) {
      throw new PrendaInvalidaException("no puede haber prendas sin tipo");
    }
    this.tipoPrenda = tipoPrenda;
    this.trama = trama;
  }

  public Categoria getCategoria() {
    return tipoPrenda.categoria;
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

  public boolean esDeCategoria(Categoria categoria) {
    return this.getCategoria().equals(categoria);
  }

  public void validaciones(TipoPrenda tipoPrenda, Material material, Color colorPrimario) {
    validarTipoPrendaNotNull(tipoPrenda);
    validarMaterialNotNull(material);
    validarColorNotNull(colorPrimario);
    validarPrendaSuperiorDeGoma(tipoPrenda, material);
  }

  public void validarTipoPrendaNotNull(TipoPrenda tipo) {
    if (tipo == null) {
      throw new PrendaInvalidaException("no puede haber prendas sin tipo");
    }
  }

  public void validarMaterialNotNull(Material material) {
    if (material == null) {
      throw new PrendaInvalidaException("no puede haber prendas sin material");
    }
  }

  public void validarColorNotNull(Color color) {
    if (color == null) {
      throw new PrendaInvalidaException("no puede haber prendas sin color primario");
    }
  }

  public void validarPrendaSuperiorDeGoma(TipoPrenda tipoPrenda, Material material) {
    if ((tipoPrenda.categoria == Categoria.SUPERIOR || tipoPrenda.categoria == Categoria.INFERIOR) && material == Material.GOMA) {
      throw new MaterialInconsistenteConPrendaSuperiorInferiorException("no puede haber prendas superiores o inferiores de goma");
    }
  }

}
