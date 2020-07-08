package com.historymakers.navigationexample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(var name: String) : Parcelable