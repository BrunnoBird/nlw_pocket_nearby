package com.bgabird.nearby.ui.screen.home

import com.bgabird.nearby.data.model.Category
import com.bgabird.nearby.data.model.Market
import com.google.android.gms.maps.model.LatLng

data class HomeUiState(
    val categories: List<Category>? = null,
    val markets: List<Market>? = null,
    val marketLocations: List<LatLng>? = null
)
