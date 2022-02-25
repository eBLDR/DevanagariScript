package com.minimalstudios.devanagariscript

import android.os.Bundle
import com.minimalstudios.devanagariscript.databinding.ActivityConsonantsRomanToDevanagariBinding

class ConsonantsRomanToDevanagariActivity : BaseCharacterLogicActivity() {

    private lateinit var binding: ActivityConsonantsRomanToDevanagariBinding

    override val mappingUsed = mapConsonantRomanToDevanagari

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConsonantsRomanToDevanagariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        for (btn in listOf(
            binding.btnKa, binding.btnKha, binding.btnGa, binding.btnGha, binding.btnNga,
            binding.btnCa, binding.btnCha, binding.btnJa, binding.btnJha, binding.btnNaPalatal,
            binding.btnTaRetro, binding.btnThaRetro, binding.btnDaRetro,
            binding.btnDhaRetro, binding.btnNRetro,
            binding.btnTa, binding.btnTha, binding.btnDa, binding.btnDha, binding.btnNa,
            binding.btnPa, binding.btnPha, binding.btnBa, binding.btnBha, binding.btnMa,
            binding.btnYa, binding.btnRa, binding.btnLa, binding.btnVa,
            binding.btnSaPalatal, binding.btnSaRetro, binding.btnSa, binding.btnHa,
        )) {
            btn.setOnClickListener { assessUserInput(btn) }
        }

        prepareRound()
    }

    override fun displayUI() {
        binding.tvDisplayChar.text = characterToDisplay
        binding.tvRemaining.text = getString(R.string.remaining, characterSetToDisplay.size)
        binding.tvErrors.text = getString(R.string.errors, errors)
    }
}