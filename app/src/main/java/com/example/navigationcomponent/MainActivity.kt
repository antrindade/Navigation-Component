package com.example.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigationcomponent.profile.ProfileFragment
import com.example.navigationcomponent.ui.start.StartFragment

class MainActivity : AppCompatActivity(), StartFragment.OnButtonClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.myContainer, StartFragment.newInstance())
            .commit()
    }

    override fun buttonClickd() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.myContainer, ProfileFragment.newInstance())
            .commit()
    }
}