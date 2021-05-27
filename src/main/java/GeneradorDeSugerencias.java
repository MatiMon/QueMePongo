import java.util.List;

public class GeneradorDeSugerencias {
  ServiciosDeClima clima = new ServicioAccuWeather(10);
  String ciudad;

  List<Prenda> generarPrendasAptas(Guardarropas guardarropas){
    return guardarropas.generarPrendasPorTemperatura(clima.temperaturaEnFahrenheit(ciudad));
  }

  //List<Atuendo> generarSugerencia(List<Prenda> prendasAptas){
  //TODO
  // }
}
