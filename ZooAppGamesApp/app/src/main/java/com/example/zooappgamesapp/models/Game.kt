package com.example.zooappgamesapp.models

import com.example.zooappgamesapp.R

data class Game (
    val id: Int,
    val name: String,
    val description: String,
    val imageRes: Int,
    val genre : String,
    val releaseDate: String,
    val isFavorite: Boolean = false
)

val gameList = listOf(
    Game(
        id = 1,
        name = "The Witcher 3: Wild Hunt",
        description = "Um RPG de mundo aberto com uma história envolvente e gráficos impressionantes.",
        imageRes = R.drawable.the_witcher_3,
        genre = "RPG",
        releaseDate = "2015-05-19"
    ),
    Game(
        id = 2,
        name = "Red Dead Redemption 2",
        description = "Explore o Velho Oeste em um dos jogos mais detalhados e emocionantes de todos os tempos.",
        imageRes = R.drawable.red_dead_rendemption_2,
        genre = "Aventura/Ação",
        releaseDate = "2018-10-26"
    ),
    Game(
        id = 3,
        name = "Cyberpunk 2077",
        description = "Um RPG futurista em uma cidade vibrante e cheia de ação.",
        imageRes = R.drawable.cyberpunk_2077,
        genre = "RPG/Ação",
        releaseDate = "2020-12-10"
    ),
    Game(
        id = 4,
        name = "Minecraft",
        description = "Um jogo sandbox onde a criatividade é o limite.",
        imageRes = R.drawable.minecraft,
        genre = "Sandbox",
        releaseDate = "2011-11-18"
    ),
    Game(
        id = 5,
        name = "Elden Ring",
        description = "Um RPG de ação em mundo aberto dos criadores de Dark Souls.",
        imageRes = R.drawable.elden_ring,
        genre = "RPG/Ação",
        releaseDate = "2022-02-25"
    ),
    Game(
        id = 6,
        name = "Counter-Strike: Global Offensive",
        description = "Um jogo de tiro tático com foco em trabalho em equipe.",
        imageRes = R.drawable.cs_go,
        genre = "FPS",
        releaseDate = "2012-08-21"
    ),
    Game(
        id = 7,
        name = "DOTA 2",
        description = "Um dos MOBAs mais populares do mundo.",
        imageRes = R.drawable.dota_2,
        genre = "MOBA",
        releaseDate = "2013-07-09"
    ),
    Game(
        id = 8,
        name = "League of Legends",
        description = "Um MOBA competitivo com milhões de jogadores ao redor do mundo.",
        imageRes = R.drawable.league_of_legends,
        genre = "MOBA",
        releaseDate = "2009-10-27"
    ),
    Game(
        id = 9,
        name = "Dark Souls III",
        description = "Uma experiência desafiadora em um mundo sombrio e fascinante.",
        imageRes = R.drawable.dark_souls_3,
        genre = "RPG/Ação",
        releaseDate = "2016-04-12"
    ),
    Game(
        id = 10,
        name = "Grand Theft Auto V",
        description = "Um jogo de ação em mundo aberto com uma narrativa marcante.",
        imageRes = R.drawable.gta_v,
        genre = "Aventura/Ação",
        releaseDate = "2013-09-17"
    ),
    Game(
        id = 11,
        name = "Valorant",
        description = "Um FPS tático com habilidades únicas para cada personagem.",
        imageRes = R.drawable.valorant,
        genre = "FPS",
        releaseDate = "2020-06-02"
    ),
    Game(
        id = 12,
        name = "Fortnite",
        description = "Um jogo de batalha real com construção e muito estilo.",
        imageRes = R.drawable.fortnite,
        genre = "Battle Royale",
        releaseDate = "2017-09-26"
    ),
    Game(
        id = 13,
        name = "Hades",
        description = "Um rogue-like cheio de ação baseado na mitologia grega.",
        imageRes = R.drawable.hades,
        genre = "Rogue-like",
        releaseDate = "2020-09-17"
    ),
    Game(
        id = 14,
        name = "Stardew Valley",
        description = "Um simulador de fazenda com elementos de RPG.",
        imageRes = R.drawable.stardew_valley,
        genre = "Simulação",
        releaseDate = "2016-02-26"
    ),
    Game(
        id = 15,
        name = "Terraria",
        description = "Um jogo de aventura em 2D com exploração e construção.",
        imageRes = R.drawable.terraria,
        genre = "Aventura/Sandbox",
        releaseDate = "2011-05-16"
    ),
    Game(
        id = 16,
        name = "The Sims 4",
        description = "Crie e controle personagens e suas vidas.",
        imageRes = R.drawable.the_sims_4,
        genre = "Simulação",
        releaseDate = "2014-09-02"
    ),
    Game(
        id = 17,
        name = "Hollow Knight",
        description = "Um jogo de plataforma e ação com uma atmosfera cativante.",
        imageRes = R.drawable.hollow_knight,
        genre = "Metroidvania",
        releaseDate = "2017-02-24"
    ),
    Game(
        id = 18,
        name = "Subnautica",
        description = "Explore um mundo subaquático cheio de mistérios.",
        imageRes = R.drawable.subnautica,
        genre = "Aventura/Survival",
        releaseDate = "2018-01-23"
    ),
    Game(
        id = 19,
        name = "Among Us",
        description = "Trabalhe em equipe e descubra o impostor.",
        imageRes = R.drawable.among_us,
        genre = "Multiplayer/Party",
        releaseDate = "2018-11-16"
    ),
    Game(
        id = 20,
        name = "Fallout 4",
        description = "Um RPG de mundo aberto em um cenário pós-apocalíptico.",
        imageRes = R.drawable.fallout_4,
        genre = "RPG/Ação",
        releaseDate = "2015-11-10"
    )
)
