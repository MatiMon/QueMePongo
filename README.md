# DIAGRAMA DE CLASES
https://lucid.app/lucidchart/cb67f6d0-83f3-4d61-bdcc-6678522fc7ba/edit?page=xIvGIxWKZMfx##


# DUDAS
* En el diagrama de clases propuse hacer un enum Criterio con las dos opciones que se nombran en el enunciado pero no estaba seguro si era algo necesario por lo que finalmente no lo llevé a código.

* Decidí agregar el atributo Usuario a los dos tipos de Propuesta porque a pesar de que no lo piden los requerimientos considero que de alguna forma se debe saber que usuario hizo la propuesta.

* El diagrama me quedó con varias flechas superpuestas, lo cuál se solucionaría si implementara a Propuesta como clase abstracta en lugar de interfaz, llevando todo el comportamiento y los datos a la superclase; dejando en las subclases solamente la sobre-escritura de los métodos aceptar() y deshacerPropuestaAceptada(); pero luego de leer el apunte de reificación me decidí por esta implementación ya que en caso de agregar más propuestas con atributos diferentes no se rompería el polimorfismo.
 
