package kata

import kata.kotlin.dsl.Bluesky
import kata.kotlin.dsl.Client
import kata.kotlin.dsl.Company
import java.time.LocalDate

val Client.print: String
    get() =  "${bluesky()?.handle()} ${company()?.name()}"

fun createClient(consumer: (ClientBuilder) ->Unit): Client {
    val clientBuilder = ClientBuilder()
    consumer(clientBuilder)
    return clientBuilder.build()
}

class ClientBuilder {
    var firstName: String? = null
    var lastName: String? = null
    var bluesky: Bluesky? = null
    var company: Company? = null
    var dateOfBirth: LocalDate? = null

    fun build() = Client(firstName, lastName, company, bluesky, dateOfBirth)
}
