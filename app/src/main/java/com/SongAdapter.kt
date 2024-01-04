package com

import android.os.Parcel
import android.os.Parcelable
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.SongAdapter as SongAdapter1

abstract class SongAdapter(songList: Any, any: Any) : RecyclerView.Adapter<RecyclerView.ViewHolder>(),
    Parcelable {
    constructor(parcel: Parcel) : this(
        TODO("songList"),
        TODO("any")
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SongAdapter1> {
        override fun createFromParcel(parcel: Parcel): SongAdapter1 {
            return androidx.compose.foundation.layout.Box {
                val songAdapter1 = androidx.compose.foundation.layout.Box {
                    val songAdapter1 = SongAdapter1(parcel = parcel)
                    songAdapter1
                }
                songAdapter1
            }
        }

        override fun newArray(size: Int): Array<SongAdapter1?> {
            return arrayOfNulls(size)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

}
