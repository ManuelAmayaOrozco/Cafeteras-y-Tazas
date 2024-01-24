class Cafetera(ubicacion: String) {
    var ubicacion: String = ubicacion

    var capacidad: Int = 1000

    var cantidad: Int = 0

    constructor(ubicacion: String, capacidad: Int): this(ubicacion) {
        this.ubicacion = ubicacion
        this.cantidad = capacidad
    }

    constructor(ubicacion: String, capacidad: Int, cantidad: Int): this(ubicacion) {
        if (cantidad > capacidad) {
            this.ubicacion = ubicacion
            this.capacidad = capacidad
            this.cantidad = capacidad
        }
        else {
            this.ubicacion = ubicacion
            this.capacidad = capacidad
            this.cantidad = cantidad
        }
    }

    fun llenar() {
        this.cantidad = this.capacidad
    }

    fun servirTaza(taza: Taza) {
        val cantnec = taza.capacidad - taza.cantidad
        if (this.cantidad > 0) {
            if ((taza.cantidad + this.cantidad) <= taza.capacidad) {
                taza.llenar(cantnec)
                this.cantidad = 0
            }
            else{
                taza.llenar(cantnec)
                this.cantidad -= cantnec
            }
        }
        else {
            println("No hay café para servir.")
        }
    }

    fun vaciar() {
        this.cantidad = 0
    }

    fun agregarCafe() {
        this.cantidad += 200
    }

    fun agregarCafe(cafe: Int) {
            this.cantidad += cafe
    }

    override fun toString(): String {
        return "Cafetera(ubicación = ${this.ubicacion}, capacidad = ${this.capacidad} c.c., cantidad = ${this.cantidad} c.c.)"
    }
}