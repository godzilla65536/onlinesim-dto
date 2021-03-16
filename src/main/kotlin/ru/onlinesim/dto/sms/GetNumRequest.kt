package ru.onlinesim.dto.sms

import com.fasterxml.jackson.annotation.JsonProperty

data class GetNumRequest(
    @JsonProperty("apikey")
    val apiKey: String,
    val service: String,
    val country: String,

    // Если передать этот параметр, запрос вернет номер
    val number: Boolean = true
)