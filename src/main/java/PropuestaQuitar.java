public class PropuestaQuitar implements Propuesta {

  private Prenda prenda;
  private Guardarropas guardarropas;

  public PropuestaQuitar(Prenda prenda, Guardarropas guardarropas) {
    this.prenda = prenda;
    this.guardarropas = guardarropas;
  }

  public void modificar(boolean fueAceptada) {
    if (fueAceptada) {
      this.guardarropas.quitarPrenda(this.prenda);
    }
  }

  public void deshacerPropuestaAceptada() {
    this.guardarropas.getPrendas().add(this.getPrenda());
  }

  public Prenda getPrenda() {
    return prenda;
  }

  public Guardarropas getGuardarropas() {
    return guardarropas;
  }
}
