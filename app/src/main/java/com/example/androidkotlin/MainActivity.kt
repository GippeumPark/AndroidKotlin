package com.example.androidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){ //class MainActivity : AppCompatActivity(), View.OnClickListener 이렇게 적어도 됨
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //메인읽은 것

        //min읽은 것 뒤에 작성해야 함
        //xml에 디자인한 2개의 버튼과 텍스트 뷰를 가져오기
        //import kotlinx.android.synthetic.main.activity_main.*를 추가하면 주석처리해도 에러 발생하지 않음
        //val btn1 = findViewById(R.id.btn1) as Button
        //val btn2 = findViewById(R.id.btn2) as Button
        //var text = findViewById(R.id.text) as TextView

        //위에 View.OnClickListener 적었을 경우
        //btn1.setOnClickListener(this)
        //btn2.setOnClickListener(this)

        //kotlin의 확장 기능을 이용ㅇ해서 xml 파일에 설정한 id를 클래스로 프로퍼티로 추가했기 때문에 선언하지 않아도 됨
        btn1.setOnClickListener(
            {text.visibility = View.VISIBLE
            })
        btn2.setOnClickListener(
            {text.visibility = View.INVISIBLE
            })

    }
}