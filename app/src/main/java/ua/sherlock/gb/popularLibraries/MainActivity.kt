package ua.sherlock.gb.popularLibraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ua.sherlock.gb.popularLibraries.databinding.ActivityMainBinding

val BUTTONS = listOf(R.id.btn_counter1, R.id.btn_counter2, R.id.btn_counter3)
val INDEXES = listOf(0,1,2)

class MainActivity : AppCompatActivity(), MainView {
    private var vb: ActivityMainBinding? = null
    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        val listener = View.OnClickListener {
            val index = BUTTONS.indexOf(it.id)
            presenter.counterClick(BUTTONS[index])
        }

        vb?.btnCounter1?.setOnClickListener (listener)
        vb?.btnCounter2?.setOnClickListener (listener)
        vb?.btnCounter3?.setOnClickListener (listener)

    }

    override fun setButtonText(index: Int, text: String) {
        when(index) {
            INDEXES[0] -> vb?.btnCounter1?.text = text
            INDEXES[1] -> vb?.btnCounter2?.text = text
            INDEXES[2] -> vb?.btnCounter3?.text = text
        }
    }
}