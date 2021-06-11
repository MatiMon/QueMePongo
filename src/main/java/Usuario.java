import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
  private List<Guardarropas> listaDeGuardarropas;
  private List<Propuesta> propuestasPendientes;
  private List<Propuesta> propuestasCompletadas;

  public void proponerAgregar(Prenda prenda, Guardarropas guardarropas) {
    Propuesta propuesta = new PropuestaAgregar(prenda, guardarropas);
    propuestasPendientes.add(propuesta);
  }

  public void proponerQuitar(Prenda prenda, Guardarropas guardarropas) {
    Propuesta propuesta = new PropuestaQuitar(prenda, guardarropas);
    propuestasPendientes.add(propuesta);
  }

  public List<Propuesta> verPropuestas(Guardarropas guardarropas) {
    return propuestasPendientes.stream()
        .filter(propuesta -> propuesta.getGuardarropas().equals(guardarropas))
        .collect(Collectors.toList());
  }

  public void aceptarPropuesta(Propuesta propuesta) {
    propuesta.modificar(true);
    propuestasPendientes.remove(propuesta);
    propuestasCompletadas.add(propuesta);
  }

  public void rechazarPropuesta(Propuesta propuesta) {
    propuesta.modificar(false);
    propuestasPendientes.remove(propuesta);
    propuestasCompletadas.add(propuesta);
  }

  public void deshacerPropuestaAceptada(Propuesta propuesta) {
    propuesta.deshacerPropuestaAceptada();
  }

  public List<Propuesta> getPropuestasPendientes() {
    return propuestasPendientes;
  }

  public List<Propuesta> getPropuestasCompletadas() {
    return propuestasCompletadas;
  }

  public void agregarGuardarropas(Guardarropas guardarropas) {
    this.listaDeGuardarropas.add(guardarropas);
  }

  public void quitarGuardarropas(Guardarropas guardarropas){
    this.listaDeGuardarropas.remove(guardarropas);
  }


}
