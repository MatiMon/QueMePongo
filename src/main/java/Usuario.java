import java.util.List;

public class Usuario {
  private List<Guardarropas> listaDeGuardarropas;

  public void proponerAgregar(Prenda prenda, Guardarropas guardarropas) {
    Propuesta propuesta = new PropuestaAgregar(prenda, this, guardarropas);
  }

  public void proponerQuitar(Prenda prenda, Guardarropas guardarropas) {
    Propuesta propuesta = new PropuestaQuitar(prenda, this, guardarropas);
  }

  public List<Propuesta> verPropuestas(Guardarropas guardarropas) {
    return guardarropas.getPropuestasPendientes();
  }

  public void aceptarPropuesta(Propuesta propuesta) {
    propuesta.aceptar();
  }

  public void rechazarPropuesta(Propuesta propuesta) {
    propuesta.rechazar();
  }

}
