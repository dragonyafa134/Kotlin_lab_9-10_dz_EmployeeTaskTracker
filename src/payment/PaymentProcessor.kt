package payment

class PaymentProcessor{
    private  val validator = PaymentValidator()

}
fun pay(payment: PaymentResuit.Payment) : PaymentResuit{
    val validator = null
    if (!validator.check(payment)){
        return PaymentResuit.Error("Ошибка")
    }
    return when(payment.type){
        PaymentResuit.CardType.VISA -> PaymentResuit.Success("VISA")
    }
}

fun show(result: PaymentResuit){
    when(result){
        is PaymentResuit.Success -> println("Успех ${result.id}")
        PaymentResuit.Processing -> println("В обработке")
        else -> {}
    }
}