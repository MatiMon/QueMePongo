# DIAGRAMA DE CLASES
https://lucid.app/lucidchart/ef411622-5971-47cf-bd33-72a6086923ac/edit?page=0_0#


# DUDAS
* El enunciado se contradice con el requerimiento de la iteración anterior que solicita que no se puedan crear prendas sin tipo, material o color; pero para poder cumplir con el 2do y 3er requerimiento de esta entrega se agregaron un constructor que recibe únicamente el tipoPrenda y los setters de material y colorPrimario.
Normalmente deberíamos clarificar con el analista funcional.

* Qué materiales son insconsistentes con cada TipoPrenda? Se estableció que no puede haber prendas superiores e inferiores de goma pero se deben especificar los casos concretos.

* Qué implica que una prenda sea válida (el documento indica "quiero poder guardar una prenda solamente si esta es válida")? Por el momento las únicas validaciones eran: no puede haber prendas sin tipo, material ni color primario; no puede haber prendas superiores e inferiores de goma. Pero ambas fueron definidas en el constructor que recibe todos esos parámetros; con el nuevo requerimiento de poder definir primero sólo el tipoPrenda, estas validaciones deberían estar en los setters?
