package com.rudy.stockmarketapp.data.mapper

import com.rudy.stockmarketapp.data.local.CompanyListingEntity
import com.rudy.stockmarketapp.data.remote.dto.CompanyInfoDto
import com.rudy.stockmarketapp.domain.model.CompanyInfo
import com.rudy.stockmarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing =
    CompanyListing(name = name, symbol = symbol, exchange = exchange)

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity =
    CompanyListingEntity(name = name, symbol = symbol, exchange = exchange)

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo =
    CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
