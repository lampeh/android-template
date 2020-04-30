package org.openchaos.android.app

import android.os.Bundle
import android.util.Log
import androidx.preference.PreferenceFragmentCompat


@Suppress("unused") // PreferenceFragments referenced in layout XML only
class SettingsFragment : PreferenceFragmentCompat() {
    private val TAG = this.javaClass.simpleName

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        Log.d(TAG, "onCreatePreferences()")
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }
}
