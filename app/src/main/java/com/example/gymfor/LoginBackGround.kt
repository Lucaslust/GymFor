package com.example.gymfor
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat

class LoginBackGround: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Define o layout que será exibido
        setContentView(R.layout.login_background)

        // Encontra o TextView pelo ID
        val textView: TextView = findViewById(R.id.textView)

        // Carrega a fonte personalizada
        val typeface = ResourcesCompat.getFont(this, R.font.satoshi_regular)

        // Aplica a fonte no TextView
        textView.typeface = typeface
    }
}
