import excepciones.DeshacerPropuestaInvalidException;

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
    if (!this.guardarropas.contieneLaPrenda(this.prenda)) {
      throw new DeshacerPropuestaInvalidException("no habia sido aceptada anteriormente");
    }
    this.guardarropas.getPrendas().remove(this.getPrenda());
  }

  public Prenda getPrenda() {
    return prenda;
  }

  public Guardarropas getGuardarropas() {
    return guardarropas;
  }
}
