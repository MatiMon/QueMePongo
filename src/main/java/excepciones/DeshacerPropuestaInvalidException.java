package excepciones;

public class DeshacerPropuestaInvalidException extends RuntimeException {
  public DeshacerPropuestaInvalidException(String s) {
    super("No se pudo deshacer la propuesta porque " + s);
  }
}
