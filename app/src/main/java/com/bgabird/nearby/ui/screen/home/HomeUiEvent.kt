package com.bgabird.nearby.ui.screen.home

sealed class HomeUiEvent {
    data object OnFetchCategories : HomeUiEvent()
    data class OnFetchMarket(val categoryId: String) : HomeUiEvent()
}