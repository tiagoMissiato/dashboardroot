package br.com.xpinc.mobile.dashboardroot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.xpinc.mobile.featuremodule12.LoggerModule1
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loggerTest.text = LoggerModule1.logModule1()
    }
}
