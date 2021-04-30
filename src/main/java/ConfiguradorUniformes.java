import java.util.ArrayList;

public class ConfiguradorUniformes {
    ArrayList<Atuendo> atuendos;

    public void configurarAtuendo(Atuendo atuendo, String nombreInstitucion){
        atuendo.setInstitucion(nombreInstitucion);
        atuendos.add(atuendo);
    }

}
