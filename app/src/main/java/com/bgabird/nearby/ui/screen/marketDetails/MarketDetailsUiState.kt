package com.bgabird.nearby.ui.screen.marketDetails

import com.bgabird.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null
)
