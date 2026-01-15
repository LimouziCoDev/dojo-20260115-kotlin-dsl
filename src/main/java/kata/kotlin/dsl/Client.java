package kata.kotlin.dsl;

import java.time.LocalDate;

public record Client(String firstName,
                     String lastName,
                     Company company,
                     Bluesky bluesky,
                     LocalDate dateOfBirth) {
}
