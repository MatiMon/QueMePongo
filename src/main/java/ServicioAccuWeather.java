import excepciones.SuperoLimiteDiarioExcepcion;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicioAccuWeather implements ServiciosDeClima {
  AccuWeatherAPI apiClima = new AccuWeatherAPI();
  List<Map<String, Object>> condicionesClimaticas;
  int limiteDiario;
  int cantidadDiariaUsos;
  LocalDateTime fechaExpiracion;

  public ServicioAccuWeather(int limiteDiario) {
    this.limiteDiario = limiteDiario;
  }

  private List<Map<String, Object>> getClima(String ciudad) {
    validarUsosDiarios();
    if(LocalDateTime.now().isBefore(fechaExpiracion)){
      return condicionesClimaticas;
    }else{
      fechaExpiracion = LocalDateTime.now().plusHours(12);
      return apiClima.getWeather(ciudad);
    }
  }

  @Override
  public double probabilidadDePrecipitaciones(String ciudad) {
    return (double) getClima(ciudad).get(0).get("PrecipitationProbability");
  }

  @Override
  public int temperaturaEnFahrenheit(String ciudad) {
    HashMap<String, Object> temperatura = (HashMap<String, Object>) getClima(ciudad).get(0).get("Temperature");
    return (int) temperatura.get("Value");
  }

  private void validarUsosDiarios(){
    if(limiteDiario == cantidadDiariaUsos){
      throw new SuperoLimiteDiarioExcepcion();
    }
    cantidadDiariaUsos += 1; //si es un límite diario, esto debería resetearse a 0 cada vez que pasa un día, me quedo haciendo ruido
  }

}