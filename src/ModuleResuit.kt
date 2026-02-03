import java.time.temporal.TemporalAmount

sealed class ModuleResuit {
    data class Success(val message: String) : ModuleResuit ()
    data class ResourceProduced(
        val resorceName: String, val amount: Int
    ) : ModuleResuit()
    data class NotEnoughResources(
        val resourceName : String,
        val required: Int,
        val available: Int
    ) : ModuleResuit()
    data class Error(val reason : String) : ModuleResuit()
}