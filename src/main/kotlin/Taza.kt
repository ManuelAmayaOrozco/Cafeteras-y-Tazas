class Taza(color: Color, capacidad: Int) {
    var color: Color = Color.blanco

    var capacidad: Int = 50

    var cantidad: Int = 0

    fun llenar() {
        this.cantidad = this.capacidad
    }

    fun llenar(cafe: Int) {
        this.cantidad += cafe
    }

    override fun toString(): String {
        return "Taza(color = ${this.color}, capacidad = ${this.capacidad} c.c., cantidad = ${this.cantidad} c.c.)"
    }
}