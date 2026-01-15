package kata

import kata.kotlin.dsl.Client

val Client.print: String
    get() =  "${bluesky().handle()} ${company().name()}"
