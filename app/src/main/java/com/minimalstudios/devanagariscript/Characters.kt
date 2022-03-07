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
    "ai" to "ऐ",
    "o" to "ओ",
    "au" to "औ",
)

val mapVowelDevanagariToRoman = mapVowelRomanToDevanagari.entries.associate { (k, v) -> v to k }

val mapConsonantRomanToDevanagari = mapOf(
    "ka" to "क",
    "kha" to "ख",
    "ga" to "ग",
    "gha" to "घ",
    "ṅa" to "ङ",
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
    "ya" to "य",
    "ra" to "र",
    "la" to "ल",
    "va" to "व",
    "śa" to "श",
    "ṣa" to "ष",
    "sa" to "स",
    "ha" to "ह",
)

val mapConsonantDevanagariToRoman =
    mapConsonantRomanToDevanagari.entries.associate { (k, v) -> v to k }

val mapSyllableRomanToDevanagari = mapOf(
    "ka" to "क",
    "kā" to "का",
    "ki" to "कि",
    "kī" to "की",
    "ku" to "कु",
    "kū" to "कू",
    "kṛ" to "कृ",
    "kṝ" to "कॄ",
    "kḷ" to "कॢ",
    "kḹ" to "कॣ",
    "ke" to "के",
    "kai" to "कै",
    "ko" to "को",
    "kau" to "कौ",
    "kaḥ" to "कः",
    "kaṃ" to "कं",
    "k" to "क्",
)

val mapSyllableDevanagariToRoman =
    mapSyllableRomanToDevanagari.entries.associate { (k, v) -> v to k }

val mapNumeralsRomanToDevanagari = mapOf(
    "0" to "०",
    "1" to "१",
    "2" to "२",
    "3" to "३",
    "4" to "४",
    "5" to "५",
    "6" to "६",
    "7" to "७",
    "8" to "८",
    "9" to "९",
)

val mapNumeralsDevanagariToRoman =
    mapNumeralsRomanToDevanagari.entries.associate { (k, v) -> v to k }

val mapAllRomanToDevanagari = mapVowelRomanToDevanagari + mapConsonantRomanToDevanagari
val mapAllDevanagariToRoman = mapVowelDevanagariToRoman + mapConsonantDevanagariToRoman
