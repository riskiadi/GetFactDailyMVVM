package com.alkalynx.getfactdaily.data.network.responses.quote

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class QuoteModel(

	@field:SerializedName("fact")
	val fact: String? = null,

	@field:SerializedName("length")
	val length: Int? = null
) : Parcelable
