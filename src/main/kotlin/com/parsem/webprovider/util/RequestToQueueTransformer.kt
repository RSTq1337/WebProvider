package com.parsem.webprovider.util

import com.parsem.webprovider.dto.CarSpecsRequestQueue
import com.parsem.webprovider.dto.api.CarSpecsRequest
import java.text.SimpleDateFormat
import java.util.*

class RequestToQueueTransformer {

    companion object {
        fun toRequestQueue(carSpecsRequest: CarSpecsRequest): CarSpecsRequestQueue {

            val sdf = SimpleDateFormat("hhmmssms")
            val currentDate = sdf.format(Date())

            return CarSpecsRequestQueue(
                requestId = carSpecsRequest.phoneNumber+currentDate,
                phoneNumber = carSpecsRequest.phoneNumber,
                brands = carSpecsRequest.brands,
                models = carSpecsRequest.models,
                generations = carSpecsRequest.generations,
                fromYear = carSpecsRequest.fromYear,
                toYear = carSpecsRequest.toYear,
                fromPrice = carSpecsRequest.fromPrice,
                fromPriceUSD = carSpecsRequest.fromPriceUSD,
                toPrice = carSpecsRequest.toPrice,
                toPriceUSD = carSpecsRequest.toPriceUSD,
                fromEngineVolume = carSpecsRequest.fromEngineVolume,
                toEngineVolume = carSpecsRequest.toEngineVolume,
                fromMileage = carSpecsRequest.fromMileage,
                toMileage = carSpecsRequest.toMileage,
                city = carSpecsRequest.city,
                engineTypes = carSpecsRequest.engineTypes,
                colors = carSpecsRequest.colors)
        }
    }
}