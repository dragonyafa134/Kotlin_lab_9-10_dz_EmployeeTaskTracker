package payment

fun main(){
    val processor = PaymentProcessor()
    val  payment = listOf(
        PaymentResuit.Payment("24_$32_4", 100, PaymentResuit.CardType.VISA)
    )
    payment.forEach { payment ->
        println("${payment.type} ${payment.card.take(4)}")
        val result = processor.pay(payment)
        processor.show(result)

    }

    val generatorR = generator.performAction(manager)
    val labR = lab.performAction(manager)

    handleModuleResulr(generatorR)
    handleModuleResulr(labR)

    println()
    manager.printAll()

}