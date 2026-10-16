
package com.habithero.habithero;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HabitController {

    @GetMapping("/api/habits")
    public List<Habit> getHabits() {

        return List.of(
            new Habit(
                1L,
                "Sport machen",
                "3-mal pro Woche trainieren",
                3,
                true
            ),
            new Habit(
                2L,
                "Englisch lernen",
                "Jeden Tag 30 Minuten lernen",
                7,
                true
            ),
            new Habit(
                3L,
                "Lesen",
                "20 Seiten pro Tag lesen",
                7,
                true
            )
        );
    }
}
