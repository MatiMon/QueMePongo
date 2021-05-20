public class Institucion {
  String nombre;
  Atuendo atuendo;

  public Institucion(String nombre, Atuendo atuendo) {
    this.nombre = nombre;
    this.atuendo = atuendo;
  }

  public String getNombre() {
    return nombre;
  }

  public Atuendo getAtuendo() {
    return atuendo;
  }
}
