package com.example.dmovrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmovrecycler.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(
        JSONObject("{\"title\": \"Titulo genial\", \"channel\": \"Channel Name\", \"views\": \"6k views\", \"datePosted\": \"5 days ago\",\"duration\": \"05:00\"}"),
        JSONObject("{\"title\": \"Titulo estandar\", \"channel\": \"CanalChido\", \"views\": \"1 view\", \"datePosted\": \"10 days ago\",\"duration\": \"01:00\"}"),
        JSONObject("{\"title\": \"Titulo tituloso\", \"channel\": \"ElRubiusXD\", \"views\": \"99k views\", \"datePosted\": \"1 day ago\",\"duration\": \"10:00\"}"),
        JSONObject("{\"title\": \"Un titulo mas\", \"channel\": \"Loulogio\", \"views\": \"20k views\", \"datePosted\": \"30 days ago\",\"duration\": \"08:00\"}"),
        JSONObject("{\"title\": \"Titulo final\", \"channel\": \"MusicaChida\", \"views\": \"400 views\", \"datePosted\": \"1 month ago\",\"duration\": \"30:00\"}"),
        )

        binding.rvVideoEntries.adapter = MainAdapter(fakeVideoData)
    }
}