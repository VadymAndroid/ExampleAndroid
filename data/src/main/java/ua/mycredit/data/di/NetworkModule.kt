package ua.mycredit.data.di

import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import ua.mycredit.data.BuildConfig
import ua.mycredit.data.net.AppServerSpec
import ua.mycredit.data.net.AppServerSpecCpa
import ua.mycredit.data.net.HeaderHolder
import java.util.concurrent.TimeUnit
import javax.inject.Named

@Module
class NetworkModule {

    @Provides
    fun provideApi(@Named("request") retrofit: Retrofit): AppServerSpec =
            retrofit.create(AppServerSpec::class.java)

    @Provides
    fun provideApiCpa(@Named("CPA") retrofit: Retrofit): AppServerSpecCpa =
            retrofit.create(AppServerSpecCpa::class.java)

    @Provides
    @Named("request")
    fun provideRetrofit(client: OkHttpClient): Retrofit =
            Retrofit.Builder()
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .baseUrl(BuildConfig.API)
                    .build()

    @Provides
    @Named("CPA")
    fun provideRetrofitCpa(client: OkHttpClient): Retrofit =
            Retrofit.Builder()
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .baseUrl("https://")
                    .build()

    @Provides
    fun provideOkHttpClient(interceptor: Interceptor, loggingInterceptor: HttpLoggingInterceptor): OkHttpClient =
            OkHttpClient.Builder()
                    .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                    .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                    .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
                    .addInterceptor(interceptor)
                    .addInterceptor(loggingInterceptor)
                    .build()

    @Provides
    fun provideLoggingInterceptor() = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    @Provides
    fun provideInterceptor() = Interceptor {
        val builder = it.request().newBuilder()

        HeaderHolder.values().forEach {
            builder.addHeader(it.key, it.header)
        }

        it.proceed(builder.build())
    }

    companion object {
        const val TIMEOUT = 20L
    }
}
