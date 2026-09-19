package com.example.irbulucu

import android.content.Context
import android.graphics.Typeface
import android.hardware.ConsumerIrManager
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.ScrollView
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    private var ir: ConsumerIrManager? = null
    private val prefs by lazy { getSharedPreferences("ir_codes", Context.MODE_PRIVATE) }

    // --- Arayüz ---
    private lateinit var cbProtos: Map<Proto, CheckBox>
    private lateinit var rbFull: RadioButton
    private lateinit var seekDelay: SeekBar
