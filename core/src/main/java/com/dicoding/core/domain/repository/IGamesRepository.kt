package com.dicoding.core.domain.repository

import com.dicoding.core.data.Resource
import com.dicoding.core.domain.model.Game
import kotlinx.coroutines.flow.Flow

interface IGamesRepository {
    fun getAllGames(page: Int, page_size: Int): Flow<Resource<List<Game>>>
    fun getFavoriteGames(): Flow<List<Game>>
    fun setFavoriteGames(game: Game, state: Boolean)
    fun clearFavoriteGames()
    fun getDetailGame(id: String): Flow<Resource<Game>>
}