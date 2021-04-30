import java.util.ArrayList;

public class ConfiguradorUniformes {
    ArrayList<Atuendo> atuendos;

    public void configurarAtuendo(Atuendo atuendo, String nombreInstitucion){
        atuendo.setInstitucion(nombreInstitucion);
        atuendos.add(atuendo);
    }

    public Atuendo generarSugerencia(Prenda parteSuperior, Prenda parteInferior, Prenda calzado){
        Atuendo sugerencia = new Atuendo(parteSuperior, parteInferior, calzado);
        return sugerencia;
    }

}
