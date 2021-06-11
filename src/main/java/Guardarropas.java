import java.util.List;
import java.util.stream.Collectors;

public class Guardarropas {
  private List<Prenda> prendas;
  //Criterio criterio;

  public Guardarropas(List<Usuario> propietarios) {
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

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public boolean contieneLaPrenda(Prenda prenda) {
    return this.prendas.contains(prenda);
  }

}
