package parking

import java.util.*

val slots = BooleanArray(10)

fun main() {
    slots[0] = true

    val scanner = Scanner(System.`in`)
    val action = scanner.next()

    if (action == "park") {
        val license = scanner.next()
        val color = scanner.next()

        var slot = 0
        while (slots[slot]) {
            slot++
        }

        slot++;
        println("$color car parked in spot $slot.")
    } else if (action == "leave") {
        val slot = scanner.nextInt()
        if (slots[slot - 1]) {
            slots[slot - 1] = false
            println("Spot $slot is free.")
        } else {
            println("There is no car in spot $slot.")
        }
    }
}
