package com.joelkanyi.focusbloom.core.samples

import com.joelkanyi.focusbloom.core.domain.model.Task
import kotlinx.datetime.LocalDateTime

val sampleTasks = listOf(
    Task(
        name = "Google I/O Keynote",
        color = 0xFFAFBBF2,
        start = LocalDateTime.parse("2021-05-18T00:00:00"),
        end = LocalDateTime.parse("2021-05-18T01:00:00"),
        date = LocalDateTime.parse("2021-05-18T00:00:00"),
        current = "Focus",
        description = "Tune in to find out about how we're furthering our mission to organize the world’s information and make it universally accessible and useful.",
        focusSessions = 1,
        completed = false,
        focusTime = 25,
        shortBreakTime = 5,
        longBreakTime = 15,
        type = "work",
        consumedFocusTime = 0,
        consumedShortBreakTime = 0,
        consumedLongBreakTime = 0,
        inProgressTask = false,
    ),
)
