package com.example.androidkotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.util.Log
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_basic_widjet.*

class BasicWidjet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //hideBtn.setOnClickListener({Log.e("1", "@")}) 앞에 적으면 실행 안
        //mxl 파일을 전개해서 메모리에 로드하고 화면에 출력하는 코드
        setContentView(R.layout.activity_basic_widjet)

        //edit1.text = "문자열 설정"
        //val text : String = edit1.text //String으로 적으면 에러남
        //입력된 문자열을 String으로 가져오기
        val text : String = edit1.text.toString()
        //3글자 이상 입력할 수 없도록 설정
        edit1.setFilters(arrayOf<InputFilter>(InputFilter.LengthFilter(3)))

        //버튼을 누르면 키보드 숨기기
        hideBtn.setOnClickListener({
            //키보드 관리 객체 생성
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        //edit1의 키보드 제어권 뻇기
            imm.hideSoftInputFromWindow(edit1.windowToken, 0)
        })

        //버튼을 누르면 키보드 출력
        showBtn.setOnClickListener({
            //키보드 관리 객체 생성
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            //edit1에 입력하는 키보드를 화면에 출력
            imm.showSoftInput(edit1, 0)
        })
    }
}