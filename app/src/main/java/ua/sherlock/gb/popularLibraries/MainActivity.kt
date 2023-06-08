package ua.sherlock.gb.popularLibraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ua.sherlock.gb.popularLibraries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {
    private var vb: ActivityMainBinding? = null
    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        val listener = View.OnClickListener {
            presenter.counterClick(it.id)
        }

        vb?.btnCounter1?.setOnClickListener (listener)
        vb?.btnCounter2?.setOnClickListener (listener)
        vb?.btnCounter3?.setOnClickListener (listener)

    }

    override fun setButtonText(index: Int, text: String) {
        when(index) {
            0 -> vb?.btnCounter1?.text = text
            1 -> vb?.btnCounter2?.text = text
            2 -> vb?.btnCounter3?.text = text
        }
    }
}