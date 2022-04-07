package com.minimalstudios.devanagariscript

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

abstract class BaseCharacterLogicActivity : AppCompatActivity() {

    abstract val mappingUsed: Map<String, String>
    lateinit var characterSetToDisplay: MutableSet<String>
    lateinit var characterToDisplay: String
    lateinit var characterResult: String

    var correct = 0
    var errors = 0

    private var errorButtons = mutableListOf<Button>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        characterSetToDisplay = mappingUsed.keys.toMutableSet()
    }

    fun prepareRound() {
        // Finish activity upon emptied set
        if (characterSetToDisplay.size == 0) {
            finish()
            return
        }

        // Reset normal button's text color
        if (errorButtons.size > 0) {
            for (btn in errorButtons) {
                btn.setTextColor(ContextCompat.getColor(this, R.color.white))
            }
            errorButtons = mutableListOf()
        }

        // Get next character
        characterToDisplay = characterSetToDisplay.random()
        characterResult = mappingUsed[characterToDisplay].toString()

        displayUI()
    }

    abstract fun displayUI()

    fun assessUserInput(btn: Button, tvErrors: TextView) {
        if (btn.text != characterResult) {
            btn.setTextColor(ContextCompat.getColor(this, R.color.red))
            errorButtons.add(btn)
            errors++
            tvErrors.text = getString(R.string.errors, errors)
        } else {
            correct++
            characterSetToDisplay.remove(characterToDisplay)
            prepareRound()
        }
    }
}