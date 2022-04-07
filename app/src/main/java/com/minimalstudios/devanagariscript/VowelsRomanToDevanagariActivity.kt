package com.minimalstudios.devanagariscript

import android.os.Bundle
import com.minimalstudios.devanagariscript.databinding.ActivityVowelsRomanToDevanagariBinding

class VowelsRomanToDevanagariActivity : BaseCharacterLogicActivity() {

    private lateinit var binding: ActivityVowelsRomanToDevanagariBinding

    override val mappingUsed = mapVowelRomanToDevanagari

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVowelsRomanToDevanagariBinding.inflate(layoutInflater)
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