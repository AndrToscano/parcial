package com.uce.moviles.data.network.entities.jikan.anime

data class Data(
    val aired: Aired,
    val airing: Boolean,
    val approved: Boolean,
    val background: String,
    val broadcast: Broadcast,
    val demographics: List<Demographic>,
    val duration: String,
    val episodes: Int,
    val explicit_genres: List<Any>,
    val `external`: List<External>,
    val favorites: Int,
    val genres: List<Genre>,
    val images: Images,
    val licensors: List<Licensor>,
    val mal_id: Int,
    val members: Int,
    val popularity: Int,
    val producers: List<Producer>,
    val rank: Int,
    val rating: String,
    val relations: List<Relation>,
    val score: Double,
    val scored_by: Int,
    val season: String,
    val source: String,
    val status: String,
    val streaming: List<Streaming>,
    val studios: List<Studio>,
    val synopsis: String,
    val theme: Theme,
    val themes: List<ThemeX>,
    val title: String,
    val title_english: String,
    val title_japanese: String,
    val title_synonyms: List<Any>,
    val titles: List<Title>,
    val trailer: Trailer,
    val type: String,
    val url: String,
    val year: Int
)