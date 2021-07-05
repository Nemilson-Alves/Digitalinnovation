package one.digitalinnovation.colletion

fun main() {
    val nomes = arrayOf("Nemilson", "Nemias", "Raphael", "Kalel", "Zenia", "Maria Alice")

    for(nome in nomes){
    nomes.sort()
    nomes.forEach {println(it)}}
}