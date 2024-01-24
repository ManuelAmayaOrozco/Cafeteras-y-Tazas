import kotlin.random.Random

/*
Desarrolla un programa con las siguientes clases:

- Clase Cafetera con atributos ubicacion (nombre de la sala o habitación dónde se encuentra), capacidad (la cantidad máxima de café que puede contener la cafetera) y cantidad (la cantidad actual de café
que hay en la cafetera).

Implementa, al menos, lo siguiente:

    * En la clase se debe establecer la capacidad máxima en 1000 (c.c.) y la cantidad actual en cero (cafetera vacía).
    * Constructor primario con la ubicacion.
    * Constructor secundario con la ubicación y la capacidad máxima de la cafetera. Inicializa la cantidad actual de café igual a la capacidad máxima.
    * Constructor secundario con la ubicacion, la capacidad máxima y la cantidad actual. Si la cantidad actual es mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
    * llenar(): hace que la cantidad actual sea igual a la capacidad.
    * servirTaza(Taza): simula la acción de servir una taza con la capacidad que tenga la taza. Si la cafetera tiene café, llenará la taza y restará la cantidad servida en la cantidad de la cafetera. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. Actualizar la cantidad de la cafetera y aplicar el método adecuado de la taza.
    * vaciar(): pone la cantidad de café actual en cero.
    * agregarCafe(Int): añade a la cafetera la cantidad de café indicada. Por defecto añade 200 c.c. No se puede añadir más cantidad que su capacidad máxima, si ocurriera esta circunstancia, simplemente llenaríamos la cantidad de la cafetera a su capacidad máxima.
    * toString(): debe retornar por ejemplo "Cafetera(ubicación = Salón, capacidad = 1000 c.c., cantidad = 0 c.c.)"

- Clase Taza, que tendrá los atributos color, capacidad y cantidad.

Implementa, al menos, lo siguiente:

    * Un único constructor con el color (por defecto blanco) y la capacidad (por defecto 50 c.c.). La clase también contendrá un atributo con la cantidad que se establcerá a 0.
    * La propiedad cantidad debe modificarse para que si el valor que recibe es mayor que la capacidad de la taza, solo establezca el valor de dicha capacidad.
    * El método llenar() que establecerá la cantidad de la taza a su máxima capacidad.
    * El método "sobrecargado" llenar(Int) que establecerá la cantidad de la taza a la cantidad pasada como argumento al método.
    * Sobreescribir el método toString(), que debe retornar por ejemplo "Taza(color = BLANCO, capacidad = 50 c.c., cantidad = 30 c.c.)"

- Clase enumerada Color, que contendrá los colores disponibles: blanco, negro, gris, azul y verde.

En el programa principal se deben crear 3 cafeteras de capacidad 1000, 750 y 500 c.c. con 0, 750 y 200 c.c de cantidad respectivamente. 
Para crear cada cafetera, debéis utilizar un constructor diferente.
También debéis generar una lista de 20 tazas con la capacidad de 50, 75 y 100 de manear aleatoria.
Implementar el resto de comentarios TODO de la función main().

NOTA:
la sobrecarga de métodos se refiere a la capacidad de definir varios métodos en una clase con el mismo nombre pero con diferentes parámetros. 
Esto permite que una clase tenga varios métodos con la misma firma (nombre de método) pero con listas de parámetros diferentes.

La sobrecarga de métodos facilita la legibilidad del código y proporciona flexibilidad al programador al permitirle utilizar el mismo nombre de 
método para realizar operaciones similares pero con diferentes conjuntos de datos.

*/

fun main() {

    //TODO: Crear 3 cafeteras en la Sala, Cocina y Oficina
    val cafetera1 = Cafetera("Sala")
    val cafetera2 = Cafetera("Cocina")
    val cafetera3 = Cafetera("Oficina")


    //TODO: Crear una lista de 20 tazas con capacidades aleatorias
    val listatazas = listOf(Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),Taza(Color.blanco, (0..100).random()),)
   
    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.
    println(cafetera1.toString())
    println(cafetera2.toString())
    println(cafetera3.toString())
    for (taza in listatazas) {
        println(taza.toString())
    }
    
    println("**********************************************")
    println("Llenar la cafetera1 de café...")
    println("Vaciar la cafetera2...")
    println("Agregar café a la cafetera2 a la mitad de su capacidad...")
    println("Agregar 400 c.c. de café a la cafereta3...")

    //TODO: Llenar la cafetera1 de café.
    cafetera1.llenar()


    //TODO: Vaciar la cafetera2.
    cafetera2.vaciar()


    //TODO: Agregar café a la cafetera2 a la mitad de su capacidad.
    cafetera2.agregarCafe(cafe = (cafetera2.capacidad / 2))


    //TODO: Agregar 400 c.c. de café a la cafereta3
    cafetera3.agregarCafe(400)


    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras
    println(cafetera1.toString())
    println(cafetera2.toString())
    println(cafetera3.toString())


    println("**********************************************")
    println("Servir café en las tazas...")

    //TODO: Servir café en las tazas... siempre que haya café en la cafetera y en el orden cafetera1, cafetera2 y cafetera3.
    for (taza in listatazas) {
        while (cafetera1.cantidad != 0) {
            cafetera1.servirTaza(taza)
        }
        while (cafetera2.cantidad != 0) {
            cafetera2.servirTaza(taza)
        }
        while (cafetera3.cantidad != 0) {
            cafetera3.servirTaza(taza)
        }
    }


    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.
    println(cafetera1.toString())
    println(cafetera2.toString())
    println(cafetera3.toString())
    for (taza in listatazas) {
        println(taza.toString())
    }


}
