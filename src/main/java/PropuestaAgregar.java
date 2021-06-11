public class PropuestaAgregar implements Propuesta {

  private Prenda prenda;
  private Guardarropas guardarropas;

  public PropuestaAgregar(Prenda prenda, Guardarropas guardarropas) {
    this.prenda = prenda;
    this.guardarropas = guardarropas;
  }

  public void modificar(boolean fueAceptada) {
    if (fueAceptada) {
      this.guardarropas.agregarPrenda(this.prenda);
    }
  }

  public void deshacerPropuestaAceptada() {
    this.guardarropas.getPrendas().remove(this.getPrenda());
  }

  public Prenda getPrenda() {
    return prenda;
  }

  public Guardarropas getGuardarropas() {
    return guardarropas;
  }
}
