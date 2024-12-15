package com.bgabird.nearby.data.model.mock

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.bgabird.nearby.data.model.Market

val loremIpsum = LoremIpsum(25)
val words = loremIpsum.values

val mockMarkets = listOf(
    Market(
        id = "1",
        categoryId = "1",
        name = "Mercado",
        description = "Mercado descrição muito barato, ${words.joinToString(" ")}",
        coupons = 10,
//        rules = mockRules,
        latitude = -12.32323123123,
        longitude = -46.234234242,
        address = "Av. Paulista - Bela Vista",
        phone = "(11) 87287-3213",
        cover = "https://images.unsplash.com/photo-1501523460185-2aa5d2a0f981?q=80&w=400&h=300"
    ),
    Market(
        id = "2",
        categoryId = "2",
        name = "Mercado 2",
        description = "Mercado descrição muito barato",
        coupons = 8,
//        rules = emptyList(),
        latitude = -12.52323123123,
        longitude = -46.534234242,
        address = "Av. Raimundo - Tiete Plaza",
        phone = "(11) 87287-3333",
        cover = "https://images.unsplash.com/photo-1501523460185-2aa5d2a0f981?q=80&w=400&h=300"
    ),
)
