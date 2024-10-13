package com.rudy.stockmarketapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J3\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00160\u000f0\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00160\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/rudy/stockmarketapp/data/repository/StockRepositoryImpl;", "Lcom/rudy/stockmarketapp/domain/repository/StockRepository;", "api", "Lcom/rudy/stockmarketapp/data/remote/StockApi;", "db", "Lcom/rudy/stockmarketapp/data/local/StockDatabase;", "companyListingsParser", "Lcom/rudy/stockmarketapp/data/csv/CSVParser;", "Lcom/rudy/stockmarketapp/domain/model/CompanyListing;", "intradayInfoParser", "Lcom/rudy/stockmarketapp/domain/model/IntradayInfo;", "(Lcom/rudy/stockmarketapp/data/remote/StockApi;Lcom/rudy/stockmarketapp/data/local/StockDatabase;Lcom/rudy/stockmarketapp/data/csv/CSVParser;Lcom/rudy/stockmarketapp/data/csv/CSVParser;)V", "dao", "Lcom/rudy/stockmarketapp/data/local/StockDao;", "getCompanyInfo", "Lcom/rudy/stockmarketapp/util/Resource;", "Lcom/rudy/stockmarketapp/domain/model/CompanyInfo;", "symbol", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompanyListings", "Lkotlinx/coroutines/flow/Flow;", "", "fetchFromRemote", "", "query", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIntradayInfo", "app_debug"})
@javax.inject.Singleton
public final class StockRepositoryImpl implements com.rudy.stockmarketapp.domain.repository.StockRepository {
    private final com.rudy.stockmarketapp.data.remote.StockApi api = null;
    private final com.rudy.stockmarketapp.data.local.StockDatabase db = null;
    private final com.rudy.stockmarketapp.data.csv.CSVParser<com.rudy.stockmarketapp.domain.model.CompanyListing> companyListingsParser = null;
    private final com.rudy.stockmarketapp.data.csv.CSVParser<com.rudy.stockmarketapp.domain.model.IntradayInfo> intradayInfoParser = null;
    private final com.rudy.stockmarketapp.data.local.StockDao dao = null;
    
    @javax.inject.Inject
    public StockRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.rudy.stockmarketapp.data.remote.StockApi api, @org.jetbrains.annotations.NotNull
    com.rudy.stockmarketapp.data.local.StockDatabase db, @org.jetbrains.annotations.NotNull
    com.rudy.stockmarketapp.data.csv.CSVParser<com.rudy.stockmarketapp.domain.model.CompanyListing> companyListingsParser, @org.jetbrains.annotations.NotNull
    com.rudy.stockmarketapp.data.csv.CSVParser<com.rudy.stockmarketapp.domain.model.IntradayInfo> intradayInfoParser) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCompanyListings(boolean fetchFromRemote, @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.rudy.stockmarketapp.util.Resource<java.util.List<com.rudy.stockmarketapp.domain.model.CompanyListing>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getIntradayInfo(@org.jetbrains.annotations.NotNull
    java.lang.String symbol, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.rudy.stockmarketapp.util.Resource<java.util.List<com.rudy.stockmarketapp.domain.model.IntradayInfo>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCompanyInfo(@org.jetbrains.annotations.NotNull
    java.lang.String symbol, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.rudy.stockmarketapp.util.Resource<com.rudy.stockmarketapp.domain.model.CompanyInfo>> continuation) {
        return null;
    }
}