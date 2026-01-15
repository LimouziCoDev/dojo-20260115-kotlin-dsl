package kata

import kata.kotlin.dsl.Client
import kata.kotlin.dsl.Company
import java.util.function.Consumer

val Client.print: String
    get() =  "${bluesky()?.handle()} ${company()?.name()}"

fun createClient(consumer: Consumer<ClientBuilder>): Client {
    val clientBuilder = ClientBuilder()
    consumer.accept(clientBuilder)
    return clientBuilder.build()
}

data class ClientBuilder(var firstName: String = "", var lastName: String = "") {
    fun build() = Client(firstName, lastName, null, null, null)
}
