package com.example.myfirstapp2

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp2.Constance.Constance
import com.example.myfirstapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {

            val resultValue = bindingClass.edValue.text.toString()

            bindingClass.imPhoto.visibility = View.VISIBLE
            when (resultValue) {

                Constance.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DIRECTOR_SUELDO}"
                    if(bindingClass.edPasswords.text.toString() == Constance.DIRECTOR_PASSWORD) {

                        bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.egor)

                    } else {
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.imPhoto.setImageResource(R.drawable.duly)
                    }
                }

                Constance.INGENER -> {

                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.INGENER_SUELDO}"
                    if(bindingClass.edPasswords.text.toString() == Constance.INGENER_PASSWORD) {

                        bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.andrey)

                    } else {
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.imPhoto.setImageResource(R.drawable.duly)
                    }

                }

                Constance.DVORNIK -> {

                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DVORNIK_SUELDO}"
                    if(bindingClass.edPasswords.text.toString() == Constance.DVORNIK_PASSWORD) {

                        bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.sergey)

                    } else {
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.imPhoto.setImageResource(R.drawable.duly)
                    }

                }

                else -> {

                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Нет такого работника"
                    bindingClass.imPhoto.setImageResource(R.drawable.duly)

                }


            }
        }

    }
}
