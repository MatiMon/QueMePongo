public class AtuendoInvalidoException extends RuntimeException {
    public AtuendoInvalidoException(String s) {
        super("Atuendo invalido porque "+ s);
    }
}
