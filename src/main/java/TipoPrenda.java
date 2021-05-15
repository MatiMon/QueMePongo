public enum TipoPrenda {
  ZAPATO(Categoria.CALZADO),
  CAMISA(Categoria.SUPERIOR),
  PANTALON(Categoria.INFERIOR),
  COLLAR(Categoria.ACCESORIOS),
  GORRA(Categoria.ACCESORIOS);

  Categoria categoria;

  TipoPrenda(Categoria categoria) {
    if (categoria == null) {
      throw new TipoPrendaInvalidaException("no puede haber tipos de prenda sin categoria");
    }
    this.categoria = categoria;
  }
}
