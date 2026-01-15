package kata

import kata.kotlin.dsl.Bluesky
import kata.kotlin.dsl.Client
import kata.kotlin.dsl.Company
import java.time.LocalDate
import java.time.Month

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val client = Client(
        "Jean",
        "DUPOND",
        Company(
            "Company",
            "Town"
        ),
        Bluesky(
            "@jeandupond.bsky.social"
        ),
        LocalDate.of(2002, Month.MARCH, 20)
    )

    println("Created client is : ${client.print}")
}