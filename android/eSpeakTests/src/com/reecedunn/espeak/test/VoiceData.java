/*
 * Copyright (C) 2012-2015 Reece H. Dunn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.reecedunn.espeak.test;

import com.reecedunn.espeak.SpeechSynthesis;

import java.util.ArrayList;
import java.util.List;

public class VoiceData
{
    public static class Voice
    {
        public final String name;
        public final String identifier;
        public final String ianaLanguage;
        public final String javaLanguage;
        public final String ianaCountry;
        public final String javaCountry;
        public final String variant;
        public final int    gender;
        public final String displayName;
        public final String locale;
        public final List<String> sampleText = new ArrayList<>();

        public Voice(String name,
                     String identifier,
                     String ianaLanguage,
                     String javaLanguage,
                     String ianaCountry,
                     String javaCountry,
                     String variant,
                     int    gender,
                     String displayName,
                     String locale,
                     String... sampleText)
        {
            this.name = name;
            this.identifier = identifier;
            this.ianaLanguage = ianaLanguage;
            this.javaLanguage = javaLanguage;
            this.ianaCountry = ianaCountry;
            this.javaCountry = javaCountry;
            this.variant = variant;
            this.gender = gender;
            this.displayName = displayName;
            this.locale = locale;
            for (String text : sampleText)
                this.sampleText.add(text);
        }
    }

    public static class Exception extends AssertionError
    {
        private static final long serialVersionUID = 1L;

        public Exception(Voice voice, String context, AssertionError error)
        {
            super("Voice \"" + voice.name + "\" " + context + " -- " + error);
        }
    }

    public static final Voice[] voices = new Voice[] {
        new Voice("af",          "other/af",     "af",  "afr", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Afrikaans",                        "afr",              "Hierdie is 'n voorbeeld van gesproke teks in Afrikaans"),
        new Voice("am",          "test/am",      "am",  "amh", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Amharic",                          "amh",              "?????? ??????????????? ?????? ??????????????? ????????? ????????? ?????????", "?????? ???Amharic ?????? ??????????????? ????????? ????????? ?????????"),
        new Voice("an",          "europe/an",    "an",  "arg", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Aragonese",                        "arg",              "This is a sample of text spoken in Aragonese"),
        new Voice("as",          "test/as",      "as",  "asm", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Assamese",                         "asm",              "This is a sample of text spoken in Assamese", "This is a sample of text spoken in ?????????????????????"),
        new Voice("az",          "test/az",      "az",  "aze", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Azerbaijani",                      "aze",              "This is a sample of text spoken in Azerbaijani", "This is a sample of text spoken in az??rbaycan"),
        new Voice("bg",          "europe/bg",    "bg",  "bul", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Bulgarian",                        "bul",              "???????? ?? ?????????? ???? ?????????????????? ?????????? ???? ??????????????????"),
        new Voice("bn",          "asia/bn",      "bn",  "ben", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Bengali",                          "ben",              "This is a sample of text spoken in ???????????????", "This is a sample of text spoken in Bengali"),
        new Voice("bs",          "europe/bs",    "bs",  "bos", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Bosnian",                          "bos",              "This is a sample of text spoken in Bosnian", "This is a sample of text spoken in bosanski"),
        new Voice("ca",          "europe/ca",    "ca",  "cat", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Catalan",                          "cat",              "Aquesta ??s una mostra de text llegit en veu alta en catal??"),
        new Voice("cs",          "europe/cs",    "cs",  "ces", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Czech",                            "ces",              "Toto je uk??zkov?? text namluven?? v jazyce ??e??tina"),
        new Voice("cy",          "europe/cy",    "cy",  "cym", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Welsh",                            "cym",              "This is a sample of text spoken in Welsh", "This is a sample of text spoken in Cymraeg"),
        new Voice("da",          "europe/da",    "da",  "dan", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Danish",                           "dan",              "Dette er et eksempel p?? talt tekst p?? dansk"),
        new Voice("de",          "de",           "de",  "deu", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "German",                           "deu",              "Dies ist ein Beispieltext auf Deutsch"),
        new Voice("el",          "europe/el",    "el",  "ell", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Greek (Modern)",                   "ell",              "???????? ?????????? ?????? ???????????? ???????????????? ?????? ?????????????????? ?????? ????????????????"),
        new Voice("en",          "default",      "en",  "eng", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "English",                          "eng",              "This is a sample of text spoken in English"),
        new Voice("en-sc",       "other/en-sc",  "en",  "eng", "GB",  "GBR", "scotland", SpeechSynthesis.GENDER_MALE,        "English (Scotland)",               "eng-GBR-scotland", "This is a sample of text spoken in English (United Kingdom,Scottish Standard English)"),
        new Voice("en-gb",       "en",           "en",  "eng", "GB",  "GBR", "",         SpeechSynthesis.GENDER_MALE,        "English (UK)",                     "eng-GBR",          "This is a sample of text spoken in English (United Kingdom)"),
        new Voice("en-uk-north", "other/en-n",   "en",  "eng", "GB",  "GBR", "north",    SpeechSynthesis.GENDER_MALE,        "English (Lancashire)",             "eng-GBR-north",    "This is a sample of text spoken in English (United Kingdom,NORTH)"),
        new Voice("en-uk-rp",    "other/en-rp",  "en",  "eng", "GB",  "GBR", "rp",       SpeechSynthesis.GENDER_MALE,        "English (Received Pronunciation)", "eng-GBR-rp",       "This is a sample of text spoken in English (United Kingdom,RP)", "This is a sample of text spoken in English (United Kingdom,rp)"),
        new Voice("en-uk-wmids", "other/en-wm",  "en",  "eng", "GB",  "GBR", "wmids",    SpeechSynthesis.GENDER_MALE,        "English (West Midlands)",          "eng-GBR-wmids",    "This is a sample of text spoken in English (United Kingdom,WMIDS)"),
        new Voice("en-us",       "en-us",        "en",  "eng", "US",  "USA", "",         SpeechSynthesis.GENDER_MALE,        "English (US)",                     "eng-USA",          "This is a sample of text spoken in English (United States)"),
        new Voice("en-wi",       "other/en-wi",  "en",  "eng", "JM",  "JAM", "",         SpeechSynthesis.GENDER_MALE,        "English (Caribbean)",              "eng-JAM",          "This is a sample of text spoken in English (Jamaica)"),
        new Voice("eo",          "other/eo",     "eo",  "epo", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Esperanto",                        "epo",              "This is a sample of text spoken in Esperanto", "This is a sample of text spoken in esperanto"),
        new Voice("es",          "europe/es",    "es",  "spa", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Spanish",                          "spa",              "Esto es un ejemplo de texto hablado en espa??ol."),
        new Voice("es-la",       "es-la",        "es",  "spa", "MX",  "MEX", "",         SpeechSynthesis.GENDER_MALE,        "Spanish (Latin America)",          "spa-MEX",          "Esto es un ejemplo de texto hablado en espa??ol (M??xico)."),
        new Voice("et",          "europe/et",    "et",  "est", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Estonian",                         "est",              "This is a sample of text spoken in eesti", "This is a sample of text spoken in Estonian"),
        new Voice("eu",          "europe/eu",    "eu",  "eus", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Basque",                           "eus",              "This is a sample of text spoken in Basque", "This is a sample of text spoken in euskara"),
        new Voice("fa",          "asia/fa",      "fa",  "fas", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Farsi (Persian)",                  "fas",              "?????? ???? ?????????? ???? ???????????? ???????? ?????? ???? ?????????? ??????"),
        new Voice("fi",          "europe/fi",    "fi",  "fin", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Finnish",                          "fin",              "T??m?? on n??yte puhutusta tekstist?? kielell?? suomi"),
        new Voice("fr-be",       "europe/fr-be", "fr",  "fra", "BE",  "BEL", "",         SpeechSynthesis.GENDER_MALE,        "French (Belgium)",                 "fra-BEL",          "Voici un exemple de texte ??nonc?? en fran??ais (Belgique)."),
        new Voice("fr-fr",       "fr",           "fr",  "fra", "FR",  "FRA", "",         SpeechSynthesis.GENDER_MALE,        "French (France)",                  "fra-FRA",          "Voici un exemple de texte ??nonc?? en fran??ais (France)."),
        new Voice("ga",          "europe/ga",    "ga",  "gle", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Irish",                            "gle",              "This is a sample of text spoken in Irish", "This is a sample of text spoken in Gaeilge"),
        new Voice("gd",          "test/gd",      "gd",  "gla", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Scottish Gaelic",                  "gla",              "This is a sample of text spoken in Scottish Gaelic", "This is a sample of text spoken in G??idhlig"),
        new Voice("grc",         "other/grc",    "grc", "grc", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Greek (Ancient)",                  "grc",              "This is a sample of text spoken in Ancient Greek"),
        new Voice("gu",          "asia/gu",      "gu",  "guj", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Gujarati",                         "guj",              "This is a sample of text spoken in Gujarati", "This is a sample of text spoken in ?????????????????????"),
        new Voice("hi",          "asia/hi",      "hi",  "hin", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Hindi",                            "hin",              "?????? ?????????????????? ????????? ???????????? ?????? ????????? ?????? ??????????????? ??????"),
        new Voice("hr",          "europe/hr",    "hr",  "hrv", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Croatian",                         "hrv",              "Ovo je primjer teksta izgovorenog na hrvatski"),
        new Voice("hu",          "europe/hu",    "hu",  "hun", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Hungarian",                        "hun",              "Ez egy magyar nyelven felolvasott sz??veg mint??ja."),
        new Voice("hy",          "asia/hy",      "hy",  "hye", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Armenian",                         "hye",              "This is a sample of text spoken in Armenian", "This is a sample of text spoken in ??????????????"),
        new Voice("hy-west",     "asia/hy-west", "hy",  "hye", "AM",  "ARM", "arevmda",  SpeechSynthesis.GENDER_MALE,        "Armenian (Western)",               "hye-ARM-arevmda",  "This is a sample of text spoken in Armenian (Armenia,Western Armenian)", "This is a sample of text spoken in ?????????????? (????????????????,AREVMDA)", "This is a sample of text spoken in ?????????????? (????????????????,????????????????????????????)"),
        new Voice("ia",          "other/ia",     "ia",  "ina", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Interlingua",                      "ina",              "This is a sample of text spoken in Interlingua"),
        new Voice("id",          "asia/id",      "in",  "ind", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Indonesia",                        "ind",              "Ini adalah sebuah contoh teks yang diucapkan di Bahasa Indonesia"), // NOTE: 'id' is the correct ISO 639-1 code, but Android/Java uses 'in'.
        new Voice("is",          "europe/is",    "is",  "isl", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Icelandic",                        "isl",              "This is a sample of text spoken in ??slenska", "This is a sample of text spoken in Icelandic"),
        new Voice("it",          "europe/it",    "it",  "ita", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Italian",                          "ita",              "Questo ?? un esempio di testo parlato in italiano"),
        new Voice("jbo",         "other/jbo",    "jbo", "jbo", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Lojban",                           "jbo",              "This is a sample of text spoken in Lojban"),
        new Voice("ka",          "asia/ka",      "ka",  "kat", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Georgian",                         "kat",              "This is a sample of text spoken in Georgian", "This is a sample of text spoken in ?????????????????????"),
        new Voice("kl",          "test/kl",      "kl",  "kal", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Greenlandic",                      "kal",              "This is a sample of text spoken in Kalaallisut", "This is a sample of text spoken in kalaallisut"),
        new Voice("kn",          "asia/kn",      "kn",  "kan", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Kannada",                          "kan",              "This is a sample of text spoken in Kannada", "This is a sample of text spoken in ???????????????"),
        new Voice("ko",          "asia/ko",      "ko",  "kor", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Korean",                           "kor",              "???????????? ?????? ????????? ???????????????."),
        new Voice("ku",          "asia/ku",      "ku",  "kur", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Kurdish",                          "kur",              "This is a sample of text spoken in Kurdish"),
        new Voice("la",          "other/la",     "la",  "lat", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Latin",                            "lat",              "This is a sample of text spoken in Latin"),
        new Voice("lt",          "europe/lt",    "lt",  "lit", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Lithuanian",                       "lit",              "Tai teksto, sakomo lietuvi??, pavyzdys"),
        new Voice("lv",          "europe/lv",    "lv",  "lav", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Latvian",                          "lav",              "??is ir izrun??ta teksta paraugs ????d?? valod??: latvie??u."),
        new Voice("mk",          "europe/mk",    "mk",  "mkd", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Macedonian",                       "mkd",              "This is a sample of text spoken in Macedonian", "This is a sample of text spoken in ????????????????????"),
        new Voice("ml",          "asia/ml",      "ml",  "mal", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Malayalam",                        "mal",              "This is a sample of text spoken in Malayalam", "This is a sample of text spoken in ??????????????????"),
        new Voice("mr",          "test/mr",      "mr",  "mar", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Marathi",                          "mar",              "This is a sample of text spoken in Marathi", "This is a sample of text spoken in ???????????????"),
        new Voice("ms",          "asia/ms",      "ms",  "msa", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Malay",                            "msa",              "Ini adalah sampel teks yang dilafazkan dalam Bahasa Melayu", "Ini adalah sampel teks yang dilafazkan dalam Malay"),
        new Voice("ne",          "asia/ne",      "ne",  "nep", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Nepali",                           "nep",              "This is a sample of text spoken in Nepali", "This is a sample of text spoken in ??????????????????"),
        new Voice("nl",          "europe/nl",    "nl",  "nld", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Dutch",                            "nld",              "Dit is een voorbeeld van tekst die is uitgesproken in het Nederlands"),
        new Voice("no",          "europe/no",    "nb",  "nob", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Norwegian (Bokm??l)",               "nob",              "Dette er et teksteksempel lest opp p?? norsk bokm??l"),
        new Voice("om",          "test/om",      "om",  "orm", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Oromoo",                           "orm",              "This is a sample of text spoken in Oromo", "This is a sample of text spoken in Oromoo"),
        new Voice("or",          "test/or",      "or",  "ori", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Oriya",                            "ori",              "This is a sample of text spoken in Oriya", "This is a sample of text spoken in ???????????????"),
        new Voice("pa",          "asia/pa",      "pa",  "pan", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Panjabi",                          "pan",              "This is a sample of text spoken in Punjabi", "This is a sample of text spoken in ??????????????????"),
        new Voice("pap",         "test/pap",     "pap", "pap", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Papiamento",                       "pap",              "This is a sample of text spoken in Papiamento"),
        new Voice("pl",          "europe/pl",    "pl",  "pol", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Polish",                           "pol",              "To jest przyk??ad tekstu m??wionego przy ustawieniu polski"),
        new Voice("pt-br",       "pt",           "pt",  "por", "BR",  "BRA", "",         SpeechSynthesis.GENDER_MALE,        "Portuguese (Brazil)",              "por-BRA",          "Esta ?? uma amostra de texto falado em portugu??s (Brasil)"),
        new Voice("pt-pt",       "europe/pt-pt", "pt",  "por", "PT",  "PRT", "",         SpeechSynthesis.GENDER_MALE,        "Portuguese (Portugal)",            "por-PRT",          "Este ?? um exemplo de texto falado em portugu??s (Portugal)"),
        new Voice("ro",          "europe/ro",    "ro",  "ron", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Romanian",                         "ron",              "Aceasta este o mostr?? de text vorbit ??n rom??n??"),
        new Voice("ru",          "europe/ru",    "ru",  "rus", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Russian",                          "rus",              "?????? ???????????????????? ???????? ???????????????????? ?????????????? ??????????"),
        new Voice("si",          "test/si",      "si",  "sin", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Sinhalese",                        "sin",              "This is a sample of text spoken in Sinhala", "This is a sample of text spoken in ???????????????"),
        new Voice("sk",          "europe/sk",    "sk",  "slk", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Slovak",                           "slk",              "Toto je uk????kov?? text nahovoren?? v jazyku sloven??ina"),
        new Voice("sl",          "test/sl",      "sl",  "slv", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Slovenian",                        "slv",              "To je vzorec besedila, izgovorjen v sloven????ina"),
        new Voice("sq",          "europe/sq",    "sq",  "sqi", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Albanian",                         "sqi",              "This is a sample of text spoken in Albanian", "This is a sample of text spoken in Shqip", "This is a sample of text spoken in shqip"),
        new Voice("sr",          "europe/sr",    "sr",  "srp", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Serbian",                          "srp",              "?????? ???? ???????????? ???????????? ???????? ???? ?????????????????? ???? ???????????? ????????????", "?????? ???? ???????????? ???????????? ???????? ???? ?????????????????? ???? ???????????? ????????????"),
        new Voice("sv",          "europe/sv",    "sv",  "swe", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Swedish",                          "swe",              "Detta ??r ett textexempel som l??ses p?? svenska"),
        new Voice("sw",          "other/sw",     "sw",  "swa", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Swahili",                          "swa",              "Hii ni sampuli ya maandishi yaliyonenwa katika Kiswahili", "Hii ni sampuli ya maandishi yaliyonenwa katika Swahili"),
        new Voice("ta",          "asia/ta",      "ta",  "tam", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Tamil",                            "tam",              "This is a sample of text spoken in ???????????????", "This is a sample of text spoken in Tamil"),
        new Voice("te",          "asia/te",      "te",  "tel", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Telugu",                           "tel",              "This is a sample of text spoken in Telugu", "This is a sample of text spoken in ??????????????????"),
        new Voice("tr",          "asia/tr",      "tr",  "tur", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Turkish",                          "tur",              "Bu, T??rk??e dilinde seslendirilen ??rnek bir metindir"),
        new Voice("ur",          "test/ur",      "ur",  "urd", "",    "",    "",         SpeechSynthesis.GENDER_UNSPECIFIED, "Urdu",                             "urd",              "This is a sample of text spoken in Urdu", "This is a sample of text spoken in ????????"),
        new Voice("vi",          "asia/vi",      "vi",  "vie", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Vietnamese",                       "vie",              "????y l?? m???u v??n b???n ???????c ?????c b???ng Ti???ng Vi???t"),
        new Voice("vi-hue",      "asia/vi-hue",  "vi",  "vie", "VN",  "VNM", "hue",      SpeechSynthesis.GENDER_MALE,        "Vietnamese",                       "vie-VNM-hue",      "????y l?? m???u v??n b???n ???????c ?????c b???ng Ti???ng Vi???t (Vi???t Nam,HUE)", "????y l?? m???u v??n b???n ???????c ?????c b???ng Ti???ng Vi???t (Vi???t Nam,hue)"),
        new Voice("vi-sgn",      "asia/vi-sgn",  "vi",  "vie", "VN",  "VNM", "saigon",   SpeechSynthesis.GENDER_MALE,        "Vietnamese",                       "vie-VNM-saigon",   "????y l?? m???u v??n b???n ???????c ?????c b???ng Ti???ng Vi???t (Vi???t Nam,SAIGON)"),
        new Voice("zh",          "asia/zh",      "zh",  "zho", "",    "",    "",         SpeechSynthesis.GENDER_MALE,        "Chinese (Mandarin)",               "zho",              "This is a sample of text spoken in ??????"),
        new Voice("zh-yue",      "asia/zh-yue",  "zh",  "zho", "HK",  "HKG", "",         SpeechSynthesis.GENDER_MALE,        "Chinese (Cantonese)",              "zho-HKG",          "This is a sample of text spoken in ?????? (??????????????????????????????????????????)", "This is a sample of text spoken in ?????? (??????)"),
    };
}
