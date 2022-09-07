package com.exam.liveui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.exam.liveui.adapter.LiveDataAdapter
import com.exam.liveui.data.LiveData
import com.exam.liveui.databinding.ActivityMainBinding
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var liveList = ArrayList<LiveData>()
    private lateinit var liveDataAdapter : LiveDataAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        liveList.add(LiveData("https://blog.ninjavan.co/en-ph/wp-content/uploads/sites/2/2021/11/live-selling-tips.png","5 min ago","Sample Live Caption Here !!",20,"1.2k"))
        liveList.add(LiveData("https://miro.medium.com/max/1200/1*gdxUtYaQyfuC8-jQl4eGdw.jpeg","1 hr ago","Winter is coming!! Promotion is here !!",60,"9.6k"))
        liveList.add(LiveData("https://blog.shopline.my/wp-content/uploads/2021/10/How_Facebook_Live_selling_is_so_much_easier_with_SHOPLINE_LIVE.jpg","6 hr ago","Grab the best offers now!",5,"122"))
        liveList.add(LiveData("https://uploads-ssl.webflow.com/6071145c72cc4375f77ec6fe/61037b9213c18ef1205704ab_Live%20streaming.jpg","12 hr ago","Morning live for New Products !!",30,"3.7k"))

        liveDataAdapter = LiveDataAdapter(liveList)
        binding.rvLiveSale.apply {
            setHasFixedSize(false)
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            adapter = liveDataAdapter
        }

    }
}