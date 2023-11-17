import kotlin.system.measureNanoTime

abstract class BasicDay {

    fun run() {
        measureNanoTime {
            println("Solution Part 1\n${part1()}")
        }.let { println("Part 1 took $it ns\n") }

        measureNanoTime {
            println("Solution Part 2\n${part2()}")
        }.let { println("Part 2 took $it ns") }
    }

    abstract fun part1(): Any
    abstract fun part2(): Any
}