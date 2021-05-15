public class MaterialInconsistenteConPrendaSuperiorInferiorException extends RuntimeException {
  public MaterialInconsistenteConPrendaSuperiorInferiorException(String s) {
    super("La prenda es invalida porque " + s);
  }
}
