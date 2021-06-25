package com.example.game

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.random.Random

var x = Random.nextInt(10, 100)
var random1 = 0
var result = 0
var res = 0



class MainActivity2 : AppCompatActivity() {

    private var tv_countView: TextView? = null
   private var button: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var manisler =
            arrayListOf<Int>(-8, -9, -6, -7, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        manisler.shuffle()

        var buttonlar = arrayListOf<Any>()
        buttonlar.shuffle()


        var belgi = arrayListOf<String>("+", "-", "*", "/")
        belgi.shuffle()
        amel.text = belgi[0]

        startTimer()

        if (amel.text.toString() == "/") {
            var random2 = Random.nextInt(10, 100)
            numberTwo.text = "$random2"
            random1 = x * random2
            numberOne.text = "$random1"
            buttonlar.add(x)
            buttonlar.add(x + manisler[0])
            buttonlar.add(x + manisler[1])
            buttonlar.add(x + manisler[2])
            manisler.shuffle()
            buttonlar.shuffle()
            button1.text = buttonlar[0].toString()
            button2.text = buttonlar[1].toString()
            button3.text = buttonlar[2].toString()
            button4.text = buttonlar[3].toString()
            buttonlar.clear()

            button1.setOnClickListener {
                if (button1.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"

                } else {

                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button2.setOnClickListener {
                if (button2.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"

                } else {

                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button3.setOnClickListener {
                if (button3.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"

                } else {

                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button4.setOnClickListener {
                if (button4.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"

                } else {

                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
        } else if (amel.text.toString() == "*") {
            var random2 = Random.nextInt(10, 100)
            random1 = Random.nextInt(10, 100)
            numberTwo.text = "$random2"
            numberOne.text = "$random1"
            x = random1 * random2
            numberOne.text = "$random1"
            buttonlar.add(x)
            buttonlar.add(x + manisler[0])
            buttonlar.add(x + manisler[1])
            buttonlar.add(x + manisler[2])
            manisler.shuffle()
            buttonlar.shuffle()
            button1.text = buttonlar[0].toString()
            button2.text = buttonlar[1].toString()
            button3.text = buttonlar[2].toString()
            button4.text = buttonlar[3].toString()
            buttonlar.clear()

            button1.setOnClickListener {
                if (button1.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button2.setOnClickListener {
                if (button2.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button3.setOnClickListener {
                if (button3.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button4.setOnClickListener {
                if (button4.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
        } else if (amel.text.toString() == "+") {
            var random2 = Random.nextInt(10, 100)
            numberTwo.text = "$random2"
            random1 = x - random2
            numberOne.text = "$random1"
            buttonlar.add(x)
            buttonlar.add(x + manisler[0])
            buttonlar.add(x + manisler[1])
            buttonlar.add(x + manisler[2])
            manisler.shuffle()
            buttonlar.shuffle()
            button1.text = buttonlar[0].toString()
            button2.text = buttonlar[1].toString()
            button3.text = buttonlar[2].toString()
            button4.text = buttonlar[3].toString()
            buttonlar.clear()

            button1.setOnClickListener {
                if (button1.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button2.setOnClickListener {
                if (button2.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button3.setOnClickListener {
                if (button3.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button4.setOnClickListener {
                if (button4.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
        } else if (amel.text.toString() == "-") {
            var random2 = Random.nextInt(10, 100)
            numberTwo.text = "$random2"
            random1 = x + random2
            numberOne.text = "$random1"
            buttonlar.add(x)
            buttonlar.add(x + manisler[0])
            buttonlar.add(x + manisler[1])
            buttonlar.add(x + manisler[2])
            manisler.shuffle()
            buttonlar.shuffle()
            button1.text = buttonlar[0].toString()
            button2.text = buttonlar[1].toString()
            button3.text = buttonlar[2].toString()
            button4.text = buttonlar[3].toString()
            buttonlar.clear()

            button1.setOnClickListener {
                if (button1.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button2.setOnClickListener {
                if (button2.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button3.setOnClickListener {
                if (button3.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button4.setOnClickListener {
                if (button4.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
        }

    }

    //Danniy jiberiwwwwwwwwwwwwwwwwwwwww
     fun intent() {
        val basildi = Intent(this, MainActivity3::class.java)
        basildi.putExtra("duris", result)
        basildi.putExtra("qate", res)
        startActivity(basildi)
    }
    //Danniy jiberiwwwwwwwwwwwwwwwwwwwww


    //Timerrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
    fun startTimer() {
        val timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                countView.text =(millisUntilFinished/1000).toString()
            }

            override fun onFinish() {
                intent()
                finishAffinity()
            }
        }
        timer.start()
    }
    //Timerrrrrrrrrrrrrrrrrrrrrrrrrrrrrr



    //Rekursiyaaaaaaaaaaaaaaaaaaaaaaaa
    fun funkstiya() {
        var manisler =
            arrayListOf<Int>(-5, -4, -3, -2, -1, 1, 2, 3, 4, 5)
        manisler.shuffle()

        var buttonlar = arrayListOf<Any>()
        buttonlar.shuffle()


        var belgi = arrayListOf<String>("+", "-", "*", "/")
        belgi.shuffle()
        amel.text = belgi[0]



        if (amel.text.toString() == "/") {
            var random2 = Random.nextInt(10, 100)
            numberTwo.text = "$random2"
            random1 = x * random2
            numberOne.text = "$random1"
            buttonlar.add(x)
            buttonlar.add(x + manisler[0])
            buttonlar.add(x + manisler[1])
            buttonlar.add(x + manisler[2])
            manisler.shuffle()
            buttonlar.shuffle()
            button1.text = buttonlar[0].toString()
            button2.text = buttonlar[1].toString()
            button3.text = buttonlar[2].toString()
            button4.text = buttonlar[3].toString()
            buttonlar.clear()

            button1.setOnClickListener {
                if (button1.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button2.setOnClickListener {
                if (button2.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button3.setOnClickListener {
                if (button3.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button4.setOnClickListener {
                if (button4.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
        } else if (amel.text.toString() == "*") {
            var random2 = Random.nextInt(10, 100)
            random1 = Random.nextInt(10, 100)
            numberTwo.text = "$random2"
            numberOne.text = "$random1"
            x = random1 * random2
            numberOne.text = "$random1"
            buttonlar.add(x)
            buttonlar.add(x + manisler[0])
            buttonlar.add(x + manisler[1])
            buttonlar.add(x + manisler[2])
            manisler.shuffle()
            buttonlar.shuffle()
            button1.text = buttonlar[0].toString()
            button2.text = buttonlar[1].toString()
            button3.text = buttonlar[2].toString()
            button4.text = buttonlar[3].toString()
            buttonlar.clear()

            button1.setOnClickListener {
                if (button1.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button2.setOnClickListener {
                if (button2.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button3.setOnClickListener {
                if (button3.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button4.setOnClickListener {
                if (button4.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
        } else if (amel.text.toString() == "+") {
            var random2 = Random.nextInt(10, 100)
            numberTwo.text = "$random2"
            random1 = x - random2
            numberOne.text = "$random1"
            buttonlar.add(x)
            buttonlar.add(x + manisler[0])
            buttonlar.add(x + manisler[1])
            buttonlar.add(x + manisler[2])
            manisler.shuffle()
            buttonlar.shuffle()
            button1.text = buttonlar[0].toString()
            button2.text = buttonlar[1].toString()
            button3.text = buttonlar[2].toString()
            button4.text = buttonlar[3].toString()
            buttonlar.clear()

            button1.setOnClickListener {
                if (button1.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button2.setOnClickListener {
                if (button2.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button3.setOnClickListener {
                if (button3.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button4.setOnClickListener {
                if (button4.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
        } else if (amel.text.toString() == "-") {
            var random2 = Random.nextInt(10, 100)
            numberTwo.text = "$random2"
            random1 = x + random2
            numberOne.text = "$random1"
            buttonlar.add(x)
            buttonlar.add(x + manisler[0])
            buttonlar.add(x + manisler[1])
            buttonlar.add(x + manisler[2])
            manisler.shuffle()
            buttonlar.shuffle()
            button1.text = buttonlar[0].toString()
            button2.text = buttonlar[1].toString()
            button3.text = buttonlar[2].toString()
            button4.text = buttonlar[3].toString()
            buttonlar.clear()

            button1.setOnClickListener {
                if (button1.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button2.setOnClickListener {
                if (button2.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button3.setOnClickListener {
                if (button3.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
            button4.setOnClickListener {
                if (button4.text == x.toString()) {
                    result++
                    sshyotchik1.text = "Duris: $result"
                } else {
                    res++
                    sshyotchik2.text = "Qate: $res"
                }
                funkstiya()
            }
        }
    }
    //Rekursiyaaaaaaaaaaaaaaaaaaaaaaaa
}