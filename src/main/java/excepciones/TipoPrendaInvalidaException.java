package excepciones;

public class TipoPrendaInvalidaException extends RuntimeException {
  public TipoPrendaInvalidaException(String causa) {
    super("La categoria es invalida porque " + causa);
  }
}
