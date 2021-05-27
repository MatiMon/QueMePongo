import java.util.ArrayList;
import java.util.List;

public class ConfiguradorUniformes {
  List<Atuendo> atuendos;

  public void configurarAtuendo(Atuendo atuendo, String nombreInstitucion) {
    atuendos.add(atuendo);
  }

  public Atuendo generarSugerencia(Prenda parteSuperior, Prenda parteInferior, Prenda calzado) {
    Atuendo sugerencia = new Atuendo(parteSuperior, parteInferior, calzado);
    return sugerencia;
  }

}
