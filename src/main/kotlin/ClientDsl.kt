package kata

import kata.kotlin.dsl.Client

val Client.print: String
    get() =  this.bluesky().handle() + " " + this.company().name()
