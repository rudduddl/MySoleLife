package com.example.mysolelife.contentsList

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mysolelife.R

class ContentsListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contents_list)

        val rv : RecyclerView = findViewById(R.id.rv)

        val items = ArrayList<ContentsModel>()
        items.add(ContentsModel("title1", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FOtaMq%2Fbtq67OMpk4W%2FH1cd0mda3n2wNWgVL9Dqy0%2Fimg.png", "https://philosopher-chan.tistory.com/1249"))
        items.add(ContentsModel("title2", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FFtY3t%2Fbtq65q6P4Zr%2FWe64GM8KzHAlGE3xQ2nDjk%2Fimg.png", "https://philosopher-chan.tistory.com/1248"))
        items.add(ContentsModel("title3", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FeEO4sy%2Fbtq69SgK8L3%2FttCUxYHx9aPNebNwkPcI21%2Fimg.png", "https://philosopher-chan.tistory.com/1246"))
        items.add(ContentsModel("title4", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbdIKDG%2Fbtq64M96JFa%2FKcJiYgKuwKuP3fIyviXm90%2Fimg.png", "https://philosopher-chan.tistory.com/1247"))
        items.add(ContentsModel("title5", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FK917N%2Fbtq64SP5gxj%2FNzsfNAykamW7qv1hdusp1K%2Fimg.png", "https://philosopher-chan.tistory.com/1245"))
        items.add(ContentsModel("title6", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FNNrYR%2Fbtq64wsW5VN%2FqIaAsfmFtcvh4Bketug9m0%2Fimg.png", "https://philosopher-chan.tistory.com/1244"))
        items.add(ContentsModel("title7", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FlOnja%2Fbtq69Tmp7X4%2FoUvdIEteFbq4Z0ZtgCd4p0%2Fimg.png", "https://philosopher-chan.tistory.com/1243"))
        items.add(ContentsModel("title8", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmBh5u%2Fbtq651yYxop%2FX3idRXeJ0VQEoT1d6Hln30%2Fimg.png", "https://philosopher-chan.tistory.com/1242"))
        items.add(ContentsModel("title9", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fl2KC3%2Fbtq64lkUJIN%2FeSwUPyQOddzcj6OAkPKZuk%2Fimg.png", "https://philosopher-chan.tistory.com/1241"))
        items.add(ContentsModel("title10", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F123LP%2Fbtq65qy4hAd%2F6dgpC13wgrdsnHigepoVT1%2Fimg.png", "https://philosopher-chan.tistory.com/1240"))
        items.add(ContentsModel("title11", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fekn5wI%2Fbtq66UlN4bC%2F8NEzlyot7HT4PcjbdYAINk%2Fimg.png", "https://philosopher-chan.tistory.com/1239"))
        items.add(ContentsModel("title12", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcOYyBM%2Fbtq67Or43WW%2F17lZ3tKajnNwGPSCLtfnE1%2Fimg.png", "https://philosopher-chan.tistory.com/1238"))
        items.add(ContentsModel("title13", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fbtig9C%2Fbtq65UGxyWI%2FPRBIGUKJ4rjMkI7KTGrxtK%2Fimg.png", "https://philosopher-chan.tistory.com/1237"))
        items.add(ContentsModel("title14", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FznKK4%2Fbtq665AUWem%2FRUawPn5Wwb4cQ8BetEwN40%2Fimg.png", "https://philosopher-chan.tistory.com/1236"))
        items.add(ContentsModel("title15", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FblYPPY%2Fbtq66v0S4wu%2FRmuhpkXUO4FOcrlOmVG4G1%2Fimg.png", "https://philosopher-chan.tistory.com/1235"))

        val rvAdapter = ContentsRVAdapter(baseContext, items)
        rv.adapter = rvAdapter

        rv.layoutManager = GridLayoutManager(this, 2)

        rvAdapter.itemClick = object : ContentsRVAdapter.ItemClick {

            override fun onClick(view : View, position : Int) {

                Toast.makeText(baseContext, items[position].title, Toast.LENGTH_SHORT).show()

                val intent = Intent(this@ContentsListActivity, ContentsShowActivity::class.java)
                intent.putExtra("url", items[position].webUrl)
                startActivity(intent)
            }
        }
    }
}