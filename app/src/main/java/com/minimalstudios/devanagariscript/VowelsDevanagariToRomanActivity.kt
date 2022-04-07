package com.minimalstudios.devanagariscript

import android.os.Bundle
import com.minimalstudios.devanagariscript.databinding.ActivityVowelsDevanagariToRomanBinding

class VowelsDevanagariToRomanActivity : BaseCharacterLogicActivity() {

    private lateinit var binding: ActivityVowelsDevanagariToRomanBinding

    override val mappingUsed = mapVowelDevanagariToRoman

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVowelsDevanagariToRomanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        for (btn in listOf(
            binding.btnA, binding.btnAA,
            binding.btnI, binding.btnII,
            binding.btnU, binding.btnUU,
            binding.btnRRetro, binding.btnRRRetro,
            binding.btnLRetro, binding.btnLLRetro,
            binding.btnE, binding.btnAI,
            binding.btnO, binding.btnAU,
        )) {
            btn.setOnClickListener { assessUserInput(btn, binding.tvErrors) }
        }

        prepareRound()
    }

    override fun displayUI() {
        binding.tvDisplayChar.text = characterToDisplay
        binding.tvRemaining.text = getString(R.string.remaining, characterSetToDisplay.size)
        binding.tvErrors.text = getString(R.string.errors, errors)
    }
}