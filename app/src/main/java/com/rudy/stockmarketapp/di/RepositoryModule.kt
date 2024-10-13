package com.rudy.stockmarketapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.rudy.stockmarketapp.data.csv.CSVParser
import com.rudy.stockmarketapp.data.csv.CompanyListingsParser
import com.rudy.stockmarketapp.data.csv.IntradayInfoParser
import com.rudy.stockmarketapp.data.repository.StockRepositoryImpl
import com.rudy.stockmarketapp.domain.model.CompanyListing
import com.rudy.stockmarketapp.domain.model.IntradayInfo
import com.rudy.stockmarketapp.domain.repository.StockRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}