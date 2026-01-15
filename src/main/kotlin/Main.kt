package kata

fun main() {
    val client = createClient {
        firstName = "Jean"
        lastName = "DUPOND"
        company {
            name = "Company"
            city = "Town"
        }
        bluesky {
            handler = "@jeandupond.bsky.social"
        }
        dateOfBirth = 2003 March 20
    }

    println("Created client is : ${client.print}")
}