package entry

import java.util.Date

fun main(args: Array<String>? = null) {
    Thread.sleep(5000)
    println("I am the daemon and the current time is " + Date())
}
