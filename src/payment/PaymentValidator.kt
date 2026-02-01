package payment

import payment.PaymentResuit.CardType

class PaymentValidator{
    fun check(payment: Payment) : Boolean{
        return when(payment.type){
            CardType.VISA -> payment.card.lenght == 16 && payment.card.startsWith(4)

        } && payment.sum > 0
    }
}