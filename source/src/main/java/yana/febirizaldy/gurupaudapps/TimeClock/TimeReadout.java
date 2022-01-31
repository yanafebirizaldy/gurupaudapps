/*
 * Copyright 2018 johan.walles@gmail.com
 */

package yana.febirizaldy.gurupaudapps.TimeClock;

class TimeReadout {

    private static final String[] HOUR_NAMES = new String[] {
            "Dua Belas",
            "Satu",
            "Dua",
            "Tiga",
            "Empat",
            "Lima",
            "Enam",
            "Tujuh",
            "Delapan",
            "Sembilan",
            "Sepuluh",
            "Sebelas",
    };

    private static final String [] DIGITAL_NUMBER_NAME = new String[] {
            " ",
            "Satu",
            "Dua",
            "Tiga",
            "Empat",
            "Lima",
            "Enam",
            "Tujuh",
            "Delapan",
            "Sembilan",
            "Sepuluh",
            "Sebelas",
            "Dua Belas",
            "Tiga Belas",
            "Empat Belas",
            "Lima Belas",
            "Enam Belas",
            "Tujuh Belas",
            "Delapan Belas",
            "Sembilan Belas",
            "Dua Puluh",
            "Dua Puluh Satu",
            "Dua Puluh Dua",
            "Dua Puluh Tiga",
            "Dua Puluh Empat",
            "Dua Puluh Lima",
            "Dua Puluh Enam",
            "Dua Puluh Tujuh",
            "Dua Puluh Delapan",
            "Dua Puluh Sembilan",
            "Tiga Puluh",
            "Tiga Puluh Satu",
            "Tiga Puluh Dua",
            "Tiga Puluh Tiga",
            "Tiga Puluh Empat",
            "Tiga Puluh Lima",
            "Tiga Puluh Enam",
            "Tiga Puluh Tujuh",
            "Tiga Puluh Delapan",
            "Tiga Puluh Sembilan",
            "Empat Puluh",
            "Empat Puluh Satu",
            "Empat Puluh Dua",
            "Empat Puluh Tiga",
            "Empat Puluh Empat",
            "Empat Puluh Lima",
            "Empat Puluh Enam",
            "Empat Puluh Tujuh",
            "Empat Puluh Delapan",
            "Empat Puluh Sembilan",
            "Lima Puluh",
            "Lima Puluh Satu",
            "Lima Puluh Dua",
            "Lima Puluh Tiga",
            "Lima Puluh Empat",
            "Lima Puluh Lima",
            "Lima Puluh Enam",
            "Lima Puluh Tujuh",
            "Lima Puluh Delapan",
            "Lima Puluh Sembilan",
    };

    public String formatAnalog(int hour, int minute) {
        String h0 = HOUR_NAMES[hour % 12];
        String h1 = HOUR_NAMES[(hour + 1) % 12];

        //return MINUTE_FORMATS[minute].replace("H0", h0).replace("H1", h1);
        if (minute == 0) {
            return "Jam " + upcaseFirst(DIGITAL_NUMBER_NAME[hour]);
        } else {
            return "Jam " + upcaseFirst(DIGITAL_NUMBER_NAME[hour]) + " Lewat " + DIGITAL_NUMBER_NAME[minute] + " Menit";
        }
    }

    private String upcaseFirst(String string) {
        return Character.toUpperCase(string.charAt(0)) + string.substring(1);
    }

    public String formatDigital(int hour, int minute) {
        //return "Jam " + upcaseFirst(DIGITAL_NUMBER_NAME[hour]) + " Lewat " + DIGITAL_NUMBER_NAME[minute] + " Menit";
        return "";
    }
}
