package kata

import kata.kotlin.dsl.Client

fun Client.print(): String {
    return this.bluesky().handle() + " " + this.company().name()
}