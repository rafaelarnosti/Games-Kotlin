package br.com.rafaelarnosti.games.Controller

import br.com.rafaelarnosti.games.Model.Game
import br.com.rafaelarnosti.games.Service.GameServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(value = "/game")
class GameController{

    @Autowired
     lateinit var gameServices : GameServices


    @GetMapping
    fun buscarTodos() : List<Game>{
        return gameServices.buscarTodos()
    }

    @PostMapping
    fun salvar(@RequestBody game : Game) {
        gameServices.Salvar(game)
    }


    @GetMapping(value = "/titulo/{titulo}")
    fun buscarPor(@PathVariable(value = "titulo") titulo : String) : List<Game>{
        return gameServices.buscarPor(titulo)
    }

    @DeleteMapping(value = "{id}")
    fun apagar(@PathVariable(value = "id") id : String){
        gameServices.apagar(id)
    }

}