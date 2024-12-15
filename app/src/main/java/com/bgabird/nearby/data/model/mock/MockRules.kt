package com.bgabird.nearby.data.model.mock

import com.bgabird.nearby.data.model.Rule

val mockRules = listOf(
    Rule(
        id = "1",
        description = "Disponível até 31/11/2024",
        marketId = "1"
    ),

    Rule(
        id = "2",
        description = "Válido somente em dias úteis",
        marketId = "2"
    ),
)