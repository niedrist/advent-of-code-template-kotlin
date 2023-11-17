package util

import java.io.File

object FileReader {

    // Reads the input file as a single string
    fun readResource(path: String) = File(ClassLoader.getSystemResource(path).file).readText()

    // Reads the input file as a list of strings where each line is an element
    fun asStrings(path: String) = readResource(path).split("\n")

    // Reads the input file, converts each line to an int, and returns them as a list
    fun asInts(path: String) = asStrings(path).map { it.toInt() }
}