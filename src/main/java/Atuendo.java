import excepciones.AtuendoInvalidoException;

public class Atuendo {
  Prenda parteSuperior;
  Prenda parteInferior;
  Prenda calzado;
  Prenda accesorio;

  public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado) {
    validaciones(parteSuperior, parteInferior, calzado);
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
  }

  public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado, Prenda accesorio) {
    validaciones(parteSuperior, parteInferior, calzado);
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
    this.accesorio = accesorio;
  }

  public void validaciones(Prenda parteSuperior, Prenda parteInferior, Prenda calzado) {
    validarSiEsParteSuperior(parteSuperior);
    validarSiEsParteInferior(parteInferior);
    validarSiEsCalzado(calzado);
  }

  public void validarSiEsParteSuperior(Prenda prenda) {
    if (!prenda.esDeCategoria(Categoria.SUPERIOR)) {
      throw new AtuendoInvalidoException("el primer parametro debe ser una prenda superior");
    }
  }

  public void validarSiEsParteInferior(Prenda prenda) {
    if (!prenda.esDeCategoria(Categoria.INFERIOR)) {
      throw new AtuendoInvalidoException("el segundo parametro debe ser una prenda inferior");
    }
  }

  public void validarSiEsCalzado(Prenda prenda) {
    if (!prenda.esDeCategoria(Categoria.CALZADO)) {
      throw new AtuendoInvalidoException("el tercer parametro debe ser un calzado");
    }
  }
}
