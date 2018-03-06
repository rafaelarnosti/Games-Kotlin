package br.com.rafaelarnosti.games.Repository

import br.com.rafaelarnosti.games.Model.Game
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface GameRepository: MongoRepository<Game,String>