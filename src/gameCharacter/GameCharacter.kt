package gameCharacter

class GameCharacter(val name: String) {
    var state: CharacterState = CharacterState.Idle  // по умолчанию  бездействие

    fun changeState(newState: CharacterState) {
        state = newState
    }
}
