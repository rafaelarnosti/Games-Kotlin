package br.com.rafaelarnosti.games.Service

import br.com.rafaelarnosti.games.Model.Game
import br.com.rafaelarnosti.games.Repository.GameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GameServices{

    @Autowired
    lateinit var gameRepository : GameRepository

    fun buscarTodos() : List<Game>
    {
        return gameRepository.findAll()
    }

    fun Salvar(game : Game)
    {
        gameRepository.save(game)
    }

}