import excepciones.DeshacerPropuestaInvalidException;

public class PropuestaAgregar implements Propuesta {

  private Prenda prenda;
  private Usuario usuario;
  private Guardarropas guardarropas;

  public PropuestaAgregar(Prenda prenda, Usuario usuario, Guardarropas guardarropas) {
    this.prenda = prenda;
    this.usuario = usuario;
    this.guardarropas = guardarropas;
    guardarropas.agregarPropuesta(this);
  }

  public Prenda getPrenda() {
    return prenda;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public Guardarropas getGuardarropas() {
    return guardarropas;
  }

  public void aceptar() {
    this.guardarropas.agregarPrenda(this.prenda);
    this.guardarropas.moverPropuestaACompletadas(this);
  }

  public void rechazar() {
    this.guardarropas.moverPropuestaACompletadas(this);
  }

  public void deshacerPropuestaAceptada() {
    if (!this.guardarropas.contieneLaPrenda(this.prenda)) {
      throw new DeshacerPropuestaInvalidException("no habia sido aceptada anteriormente");
    }
    this.guardarropas.getPrendas().remove(this.getPrenda());
  }
}
