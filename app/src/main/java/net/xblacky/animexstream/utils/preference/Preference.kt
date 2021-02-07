package net.xblacky.animexstream.utils.preference

import android.content.Context
import android.content.SharedPreferences
import net.xblacky.animexstream.utils.constants.C

class Preference(private val context: Context) {
    private val PREF_NAME = "AnimeXStream"
    private val BASE_URL = "BASE_URL"
    private val ORIGIN = "ORIGIN"
    private val REFERER = "REFERER"
    private val NIGHT_MODE = "NIGHT_MODE"
    private val PIP = "PIP"
    private val PRIVATE_MODE = 0
    private var sharedPreferences: SharedPreferences

    init {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
    }

    fun setNightMode(nightMode: Boolean) {
        val editor = sharedPreferences.edit()
        editor.putBoolean(NIGHT_MODE, nightMode)
        editor.apply()
    }

    fun getNightMode(): Boolean {
        return sharedPreferences.getBoolean(NIGHT_MODE, false)
    }

    fun setPIPMode(isPip: Boolean) {
        val editor = sharedPreferences.edit()
        editor.putBoolean(PIP, isPip)
        editor.apply()
    }

    fun getPIPMode(): Boolean {
        return sharedPreferences.getBoolean(PIP, true)
    }

    fun getBaseUrl(): String {
        return sharedPreferences.getString(BASE_URL, C.BASE_URL) ?: C.BASE_URL
    }

    fun setBaseUrl(baseUrl: String) {
        val editor = sharedPreferences.edit()
        editor.putString(BASE_URL, baseUrl)
        editor.apply()
    }


    fun getOrigin(): String {
        return sharedPreferences.getString(ORIGIN, C.ORIGIN) ?: C.ORIGIN
    }

    fun setOrigin(origin: String) {
        val editor = sharedPreferences.edit()
        editor.putString(ORIGIN, origin)
        editor.apply()
    }

    fun getReferrer(): String {
        return sharedPreferences.getString(REFERER, C.REFERER) ?: C.REFERER
    }

    fun setReferrer(ref: String) {
        val editor = sharedPreferences.edit()
        editor.putString(REFERER, ref)
        editor.apply()
    }

}