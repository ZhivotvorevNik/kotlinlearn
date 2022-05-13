open class Weapon (val damag: Int, val name: String) {
    open fun getDamage(): Int {
        return this.damag
    }
    fun atack () {
        println("${name} наносит урон ${this.getDamage()}")
    }
}

interface Fireball {
    fun getMagicDamage (): Int = 42
}

class MagicWeapon (damage: Int, name: String): Weapon (damage, name), Fireball {
    override fun getDamage(): Int {
        return super.getDamage() + super.getMagicDamage();
    }
}

//class SimpleClass () {}

fun main() {
    val magicBlunt = MagicWeapon(15, "Посох огня")
    magicBlunt.atack()
}