package com.example.wnrapp_app

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		GeneratedPluginRegistrant.registerWith(this)
	  }
	}
