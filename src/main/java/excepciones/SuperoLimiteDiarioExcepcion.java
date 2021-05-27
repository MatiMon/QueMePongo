package excepciones;

public class SuperoLimiteDiarioExcepcion extends RuntimeException {
  public SuperoLimiteDiarioExcepcion() {
    super("Se ha superado el límite diario de usos");
  }
}
