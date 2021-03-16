package ru.onlinesim.dto.sms

data class GetNumbersStatsResponse(
    val name: String?,
    val position: Int?,
    val code: Int?,
    val other: String?,
    val new: Boolean?,
    val enabled: Boolean?,
    val services: Map<String, Service>
)

