package payment

sealed class PaymentResuit{
    data class Success(val id: String) : PaymentResuit()
    data class Error(val reason : String) : PaymentResuit()
    object Processing : PaymentResuit()

    enum class CardType{
        VISA, MASTERCARD, MIR, UNKNOWN
    }

    data class Payment(
        val card : String,
        val sun : Int,
        val type: CardType = CardType.UNKNOWN
    )
}