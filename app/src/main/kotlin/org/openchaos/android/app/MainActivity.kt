package org.openchaos.android.app

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentActivity


class MainActivity : FragmentActivity() {
    private val TAG = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate()")
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        Log.d(TAG, "onResume()")
        super.onResume()
    }
}
