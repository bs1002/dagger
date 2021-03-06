package com.mahfuznow.dagger.battery

import android.util.Log
import javax.inject.Inject

class LithiumIonBattery @Inject constructor(): Battery {
    override fun charge() {
        Log.d("TAG", "Lithium Ion Battery is charging")
    }

    override fun discharge() {
        Log.d("TAG", "Lithium Ion Battery is discharging")
    }

    override fun toString(): String {
        return "Lithium-Ion Battery"
    }
}