package gameCharacter

class Main {
    fun handleState(state: CharacterState) {
        when (state) {
            is CharacterState.Idle -> println("Персонаж бездействует")
            is CharacterState.Running -> println("Персонаж бежит")
            is CharacterState.Attack -> println("Персонаж атакует с уроном ${state.damage}")
            is CharacterState.Death -> println("Персонаж погиб: ${state.reason}")
        }
    }

    fun main() {
        val hero = GameCharacter("Герой")

        handleState(hero.state)
        hero.changeState(CharacterState.Running)
        handleState(hero.state)
        hero.changeState(CharacterState.Attack(damage = 50))
        handleState(hero.state)
        hero.changeState(CharacterState.Death(reason = "Поражение"))
        handleState(hero.state)
    }
}