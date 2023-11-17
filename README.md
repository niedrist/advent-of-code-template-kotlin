# Advent of Code Template for Kotlin
This is a template for anyone who wants to solve the [Advent of Code](https://adventofcode.com/) challenges in Kotlin. It provides a simple way to run your code and measure the execution time. Additionally, it comes with some nice utility functions to simplify the parsing of the input data.

## How to use
1. Clone this repository
2. Copy/paste the input data for each day into the `src/main/resources` directory ([Example](src/main/resources/example.txt))
3. Create a new package/class for every daily puzzle you want to solve in the `src/main/kotlin` directory ([Example](src/main/kotlin/example/Example.kt))
   1. Make sure to extend the `BasicDay` class
   2. You can use the utility functions in [FileReader](src/main/kotlin/util/FileReader.kt) to simplify the parsing of the input data
4. Have fun

## Execution time measurement
The execution time of your code is measured automatically if you implement your solution as `BasicDay` (follow the instructions above). The result will be printed to the console after the execution of your code.

This can be especially useful if you want or need to improve the performance of your solution. Some puzzles can be quite challenging in terms of performance. Even if your solution is theoretically correct, the actual execution time may exceed the [heath death of the universe](https://en.wikipedia.org/wiki/Heat_death_of_the_universe).