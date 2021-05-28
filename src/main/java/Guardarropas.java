import java.util.List;
import java.util.stream.Collectors;

public class Guardarropas {
  private List<Prenda> prendas;
  private List<Propuesta> propuestasPendientes;
  private List<Propuesta> propuestasCompletadas;
  private List<Usuario> propietarios;
  //Criterio criterio;

  public Guardarropas(List<Usuario> propietarios) {
    this.propietarios = propietarios;
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }

  List<Prenda> generarPrendasPorTemperatura(int temperatura) {
    return prendas.stream().filter(prenda -> prenda.getTemperaturaMaximaAdecuada() < temperatura).collect(Collectors.toList());
  }

  public void agregarPropuesta(Propuesta propuesta) {
    propuestasPendientes.add(propuesta);
  }

  public void moverPropuestaACompletadas(Propuesta propuesta) {
    propuestasPendientes.remove(propuesta);
    propuestasCompletadas.add(propuesta);
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public List<Propuesta> getPropuestasPendientes() {
    return propuestasPendientes;
  }

  public List<Propuesta> getPropuestasCompletadas() {
    return propuestasCompletadas;
  }

  public boolean contieneLaPrenda(Prenda prenda) {
    return this.prendas.contains(prenda);
  }

}
