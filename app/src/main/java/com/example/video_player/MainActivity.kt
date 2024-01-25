package com.example.video_player

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.video_player.databinding.ActivityMainBinding
import java.util.logging.Level.parse
import android.widget.VideoView
import android.widget.MediaController

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoView = findViewById<VideoView>(binding.testView.id)
        //creating media controller
        val mediaController = MediaController( this)
        mediaController.setAnchorView(videoView)

        //specify the location of the video file
        val uri:Uri = Uri.parse("android.resource://$packageName/raw/test")

        //setting mediaController and Uri, then starting the videoview
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()


    }

}