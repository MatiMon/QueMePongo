public class Prenda {
    TipoPrenda tipoPrenda;
    Material material;
    Color colorPrimario;
    Color colorSecundario;

    public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario) {
        if (tipoPrenda == null || material == null || colorPrimario == null) {
            throw new PrendaInvalidaException("no puede haber prendas sin tipo, material o color primario");
        }
        this.tipoPrenda = tipoPrenda;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }

    public Categoria getCategoria(){
        return tipoPrenda.categoria
    }
}
