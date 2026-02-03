sealed class NetworkResult{
    data class Success(val data: String) : NetworkResult()
    data class Error(val message : String, val code: Int): NetworkResult()
    object Loading: NetworkResult()
}
sealed class OrderStatus{
    object Created : OrderStatus()
    object Paid : OrderStatus()
    object Shipped : OrderStatus()
    data class Cancelled(val reason : String) : OrderStatus()
}
fun hadleOrder(status: OrderStatus){
    when(status){
        OrderStatus.Created -> println("Закз создан")
        OrderStatus.Paid -> println("Заказ оплачен")
        OrderStatus.Shipped -> println("Заказ отправлен")
        is OrderStatus.Cancelled -> println("Отменен ${status.reason}")
    }
}
fun hadleResult(result: NetworkResult){
    when(result){
        is NetworkResult.Success -> {
            println("Успех ${result.data}")
        }
        is ModuleResuit.ResourceProduced ->
            println("Произведено ${result.resorceName} ${result.amount}")
        is ModuleResuit.NotEnoughResources ->
            println("Недостаточно ${result.resourceName}" + "Нужно ${result.available}"
            )
        is NetworkResult.Error -> {
            println("Ошибка ${result.code} ${result.message}")
        }
        NetworkResult.Loading -> {
            println("Загрузка...")
        }
    }
}

fun main(){
    hadleOrder(OrderStatus.Created)
    hadleOrder(OrderStatus.Paid)
    hadleOrder(OrderStatus.Shipped)
    hadleOrder(OrderStatus.Cancelled("Нет товара на складе"))


    val success = NetworkResult.Success("Данные получены")
    val error = NetworkResult.Error("сервер не отвечает",500)
    val loading = NetworkResult.Loading

    hadleResult(success)
    hadleResult(error)
    hadleResult(loading)
}