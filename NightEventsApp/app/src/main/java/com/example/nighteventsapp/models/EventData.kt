package com.example.nighteventsapp.models

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.nighteventsapp.R

data class Event(
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val location: String,
    val isFavorite: MutableState<Boolean> = mutableStateOf(false),
    val isSubscribed: MutableState<Boolean> = mutableStateOf(false),
    val imageRes: Int
)

val eventList = listOf(
    Event(
        id = 1,
        title = "Conferência de Tecnologia 2024",
        description = "Tendências em tecnologia.",
        date = "2024-12-15",
        location = "Parque Tecnológico",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img1
    ),
    Event(
        id = 2,
        title = "Hackathon Internacional",
        description = "48 horas de inovação.",
        date = "2024-12-20",
        location = "Centro de Inovação",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img2
    ),
    Event(
        id = 3,
        title = "Feira de Startups",
        description = "Empreendedorismo em alta.",
        date = "2024-12-18",
        location = "Auditório Central",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img3
    ),
    Event(
        id = 4,
        title = "Workshop de IA",
        description = "Aprenda sobre Inteligência Artificial.",
        date = "2024-12-22",
        location = "Laboratório 3",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img4
    ),
    Event(
        id = 5,
        title = "Encontro de Desenvolvedores",
        description = "Networking e palestras.",
        date = "2024-12-10",
        location = "Sala de Conferências 1",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img5
    ),
    Event(
        id = 6,
        title = "Palestra sobre Blockchain",
        description = "Futuro das transações digitais.",
        date = "2024-12-12",
        location = "Anfiteatro",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img6
    ),
    Event(
        id = 7,
        title = "Seminário de Sustentabilidade",
        description = "Tecnologia verde.",
        date = "2024-12-19",
        location = "Auditório Verde",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img7
    ),
    Event(
        id = 8,
        title = "Maratona de Programação",
        description = "Desafios para programadores.",
        date = "2024-12-25",
        location = "Sala Multiuso",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img8
    ),
    Event(
        id = 9,
        title = "Curso de Kotlin Avançado",
        description = "Aprenda Kotlin com especialistas.",
        date = "2024-12-28",
        location = "Laboratório 2",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img9
    ),
    Event(
        id = 10,
        title = "Oficina de UX Design",
        description = "Melhore suas habilidades em design de experiência.",
        date = "2024-12-30",
        location = "Sala de Design",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img10
    ),
)