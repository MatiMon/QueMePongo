public class Atuendo {
    Prenda parteSuperior;
    Prenda parteInferior;
    Prenda calzado;
    String institucion;

    public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado){
        if(parteSuperior.tipoPrenda.categoria == Categoria.SUPERIOR &&
                parteInferior.tipoPrenda.categoria == Categoria.INFERIOR &&
                calzado.tipoPrenda.categoria == Categoria.CALZADO){
            this.parteSuperior = parteSuperior;
            this.parteInferior = parteInferior;
            this.calzado = calzado;
        } else throw new AtuendoInvalidoException("el atuendo debe estar compuesto por una parte superior, una parte inferior y un calzado");
    }

    public void setInstitucion(String nombre){
        this.institucion = nombre;
    }
}
