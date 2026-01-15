package kata

import kata.kotlin.dsl.Bluesky
import kata.kotlin.dsl.Company
import java.time.LocalDate
import java.time.Month

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val client = createClient {
       firstName = "Jean"
       lastName = "DUPOND"
       company = Company(
            "Company",
            "Town"
        )
       bluesky = Bluesky(
            "@jeandupond.bsky.social"
        )
       dateOfBirth = LocalDate.of(2002, Month.MARCH, 20)
    }

    println("Created client is : ${client.print}")
}