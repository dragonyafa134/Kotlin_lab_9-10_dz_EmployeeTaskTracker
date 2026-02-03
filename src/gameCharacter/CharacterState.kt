package gameCharacter

sealed class CharacterState {
    object Idle : CharacterState()        //без действия
    object Running : CharacterState()
    data class Attack(val damage: Int) : CharacterState()  // Атака с уроном
    data class Death(val reason: String) : CharacterState()
}
