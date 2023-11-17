package example

import BasicDay
import util.FileReader

val d = FileReader.asInts("example.txt")

fun main() = Day01.run()

object Day01 : BasicDay() {
    override fun part1() = d.first()

    override fun part2() = d.sum()
}