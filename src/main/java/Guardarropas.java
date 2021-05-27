import java.util.List;
import java.util.stream.Collectors;

public class Guardarropas {
  private List<Prenda> prendas;

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  List<Prenda> generarPrendasPorTemperatura(int temperatura){
    return prendas.stream().filter(prenda -> prenda.getTemperaturaMaximaAdecuada() < temperatura).collect(Collectors.toList());
  }
}
