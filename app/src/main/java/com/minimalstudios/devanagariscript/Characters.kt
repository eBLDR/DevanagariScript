package com.minimalstudios.devanagariscript

val mapVowelRomanToDevanagari = mapOf(
    "a" to "अ",
    "ā" to "आ",
    "i" to "इ",
    "ī" to "ई",
    "u" to "उ",
    "ū" to "ऊ",
    "ṛ" to "ऋ",
    "ṝ" to "ॠ",
    "ḷ" to "ऌ",
    "ḹ" to "ॡ",
    "e" to "ए",
    "o" to "ऐ",
    "ai" to "ओ",
    "au" to "औ",
)

val mapVowelDevanagariToRoman = mapVowelRomanToDevanagari.entries.associate { (k, v) -> v to k }

val mapConsonantRomanToDevanagari = mapOf(
    "ka" to "क",
    "kha" to "ख",
    "ga" to "ग",
    "gha" to "घ",
    "nga" to "ङ",
    "ca" to "च",
    "cha" to "छ",
    "ja" to "ज",
    "jha" to "झ",
    "ña" to "ञ",
    "ṭa" to "ट",
    "ṭha" to "ठ",
    "ḍa" to "ड",
    "ḍha" to "ढ",
    "ṇa" to "ण",
    "ta" to "त",
    "tha" to "थ",
    "da" to "द",
    "dha" to "ध",
    "na" to "न",
    "pa" to "प",
    "pha" to "फ",
    "ba" to "ब",
    "bha" to "भ",
    "ma" to "म",
)

val mapConsonantDevanagariToRoman =
    mapConsonantRomanToDevanagari.entries.associate { (k, v) -> v to k }

val vowelsRoman = mapVowelRomanToDevanagari.keys
val vowelsDevanagari = mapVowelDevanagariToRoman.keys

val consonantsRoman = mapConsonantRomanToDevanagari.keys
val consonantsDevanagari = mapConsonantDevanagariToRoman.keys

val allRoman = vowelsRoman + consonantsRoman
val allDevanagari = consonantsRoman + consonantsDevanagari
