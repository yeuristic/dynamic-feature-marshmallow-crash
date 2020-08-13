package com.yeuristic.dynamicfeaturemarshmallowcrash.default_download

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DefaultDownloadData(
    val title: String,
    val description: String,
    val modules: List<String>
) : Parcelable