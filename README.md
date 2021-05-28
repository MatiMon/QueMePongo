# DIAGRAMA DE CLASES
https://lucid.app/lucidchart/cb67f6d0-83f3-4d61-bdcc-6678522fc7ba/edit?page=xIvGIxWKZMfx##


# DUDAS
* En el diagrama de clases propuse hacer un enum Criterio con las dos opciones que se nombran en el enunciado pero no estaba seguro si era algo necesario por lo que finalmente no lo llevé a código.

* El diagrama me quedó con algunas flechas superpuestas (ya se que no estaría bien tomar decisiones de diseño en base a esto pero a veces es signo de que hay cosas que se pueden mejorar), cosa que se solucionaría si implementara a Propuesta como clase abstracta en lugar de interfaz, llevando todo el comportamiento y los datos a la superclase; dejando en las subclases solamente la sobre-escritura de los métodos modificar() y deshacerPropuestaAceptada(); pero luego de leer el apunte de reificación me decidí por esta implementación ya que en caso de agregar más propuestas con atributos diferentes no se rompería el polimorfismo.

* No encontré otra forma de obtener las Propuestas de un Guardarropas en Usuario (usuario.verPropuestas(Guardarropas guardarropas)) que agregando el metodo getGuardarropas() en la interfaz Propuesta. Es una solución que aporta polimorfismo pero siento que no está del todo bien ya que implícitamente estoy obligando que todos los que implementen la interfaz tengan un atributo Guardarropas.
