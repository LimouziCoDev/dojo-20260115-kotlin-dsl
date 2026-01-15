package kata.kotlin.dsl;

import java.time.LocalDate;
import java.time.Month;

public class Sample {

    public static void main(String[] args) {
        final var client = new Client(
                "Jean",
                "DUPOND",
                new Company(
                        "Company",
                        "Town"
                ),
                new Bluesky(
                        "@jeandupond.bsky.social"
                ),
                LocalDate.of(2002, Month.MARCH, 20)
        );

        System.out.printf("Created client is : %s%n", client);
    }
}
