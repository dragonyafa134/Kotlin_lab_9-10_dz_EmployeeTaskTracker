enum class Pri {
    LOW,
    MEDIUM,
    HIGH
}

data class Task( val title: String,
                 val description: String,
                 val priority: Pri,
                 val isCompleted: Boolean = false  )
