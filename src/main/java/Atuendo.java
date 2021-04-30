public class Atuendo {
    Prenda parteSuperior;
    Prenda parteInferior;
    Prenda calzado;

    public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado){
        if(parteSuperior.tipoPrenda.categoria == Categoria.SUPERIOR &&
                parteInferior.tipoPrenda.categoria == Categoria.INFERIOR &&
                calzado.tipoPrenda.categoria == Categoria.CALZADO){
            this.parteSuperior = parteSuperior;
            this.parteInferior = parteInferior;
            this.calzado = calzado;
        } else throw new AtuendoInvalidoException("el atuendo debe estar compuesto por una parte superior, una parte inferior y un calzado");
    }

    public Atuendo generarSugerencia(Prenda parteSuperior, Prenda parteInferior, Prenda calzado){
        Atuendo sugerencia = new Atuendo(parteSuperior, parteInferior, calzado);
        return sugerencia;
    }
}
