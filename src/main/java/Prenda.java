public class Prenda {
    TipoPrenda tipoPrenda;
    Material material;
    Color colorPrimario;
    Color colorSecundario;
    Trama trama;

    public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario, Trama trama) {
        //Validaciones
        if (tipoPrenda == null || material == null || colorPrimario == null) {
            throw new PrendaInvalidaException("no puede haber prendas sin tipo, material o color primario");
        }
        if((tipoPrenda.categoria == Categoria.SUPERIOR || tipoPrenda.categoria == Categoria.INFERIOR) && material == Material.GOMA){
            throw new MaterialInconsistenteConPrendaSuperiorInferiorException("no puede haber prendas superiores o inferiores de goma");
        }

        //Configuracion
        if(trama == null){
            this.trama = Trama.LISA;
        } else this.trama = trama;

        this.tipoPrenda = tipoPrenda;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }

    public Categoria getCategoria(){
        return tipoPrenda.categoria;
    }
}
