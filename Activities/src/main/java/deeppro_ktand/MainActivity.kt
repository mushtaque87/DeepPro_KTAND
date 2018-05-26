package deeppro_ktand

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import deeppro_ktand.ViewModel.LoginViewModel

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

var viewModel: LoginViewModel = LoginViewModel()
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setActivity()
        //setSupportActionBar(toolbar)

        loginButton.setOnClickListener { onClick(loginButton) }
        signUpBtn.setOnClickListener{ onClick(signUpBtn) }
        forgetPassowrdBtn.setOnClickListener { onClick(forgetPassowrdBtn) }

    }

    fun setActivity(){
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.loginButton -> {
                println("Login Clicked")
                viewModel.doLogin(usernameTextEdit.text.toString(),passwordTextEdit.text.toString())
            }
            R.id.signUpBtn -> {
                println("SignUp Clicked")
            }
            R.id.forgetPassowrdBtn-> {
                println("ForgetPassword Clicked")
            }
            else -> { //your code
                println("Button Unidentified")

            }
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
