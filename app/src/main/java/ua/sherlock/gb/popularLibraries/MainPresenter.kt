package ua.sherlock.gb.popularLibraries

class MainPresenter(val view: MainView) {
    val model = CountersModel()

    fun counterClick(id: Int) {
        when(id) {
            BUTTONS[0] -> {
                val nextValue = model.next(0)
                view.setButtonText(0, nextValue.toString())
            }
            BUTTONS[1] -> {
                val nextValue = model.next(1)
                view.setButtonText(1, nextValue.toString())
            }
            BUTTONS[2] -> {
                val nextValue = model.next(2)
                view.setButtonText(2, nextValue.toString())
            }
        }
    }
}