package com.bgabird.nearby.ui.utils

import com.google.android.gms.maps.model.LatLng

fun findSouthwestPoint(points: List<LatLng>): LatLng {
    if (points.isEmpty()) return LatLng(0.0, 0.0)

    var southwestPoint = points[0]

    for (point in points) {
        if (
            point.latitude < southwestPoint.latitude ||
            (point.latitude == southwestPoint.latitude && point.longitude < southwestPoint.longitude)
        ) {
            southwestPoint = point
        }
    }

    return southwestPoint
}

fun findNorthwestPoint(points: List<LatLng>): LatLng {
    if (points.isEmpty()) return LatLng(0.0, 0.0)

    var northwestPoint = points[0]

    for (point in points) {
        if (
            point.latitude > northwestPoint.latitude ||
            (point.latitude == northwestPoint.latitude && point.longitude > northwestPoint.longitude)
        ) {
            northwestPoint = point
        }
    }

    return northwestPoint
}