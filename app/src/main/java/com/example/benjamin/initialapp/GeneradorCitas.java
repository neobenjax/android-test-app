package com.example.benjamin.initialapp;

import android.graphics.Color;
import android.util.Log;

/**
 * Created by Benjamin on 08/11/2017.
 */

public class GeneradorCitas {
    private Cita[] citas;
    private int[] colors = {Color.CYAN, Color.RED, Color.BLACK, Color.GRAY, Color.YELLOW, Color.GREEN, Color.MAGENTA};

    public GeneradorCitas(){

        citas = new Cita[5];

        citas[0] = new Cita();
        citas[0].setAutor("Hasidic Proverb");
        citas[0].setTexto("The man who has confidence in himself gains the confidence of others.");

        citas[1] = new Cita();
        citas[1].setAutor("Henry Cloud");
        citas[1].setTexto("In a very real way, ownership is the essence of leadership. When you are 'ridiculously in charge,' then you own whatever happens in a company, school, et cetera.");

        citas[2] = new Cita();
        citas[2].setAutor("Aldous Huxley");
        citas[2].setTexto("To his dog, every man is Napoleon; hence the constant popularity of dogs.");

        citas[3] = new Cita();
        citas[3].setAutor("Samuel Butler");
        citas[3].setTexto("Words are not as satisfactory as we should like them to be, but, like our neighbours, we have got to live with them and must make the best and not the worst of them.");

        citas[4] = new Cita();
        citas[4].setAutor("John Lennon");
        citas[4].setTexto("Everything is clearer when you're in love.");
    }

    public Cita obtenerCitaRandom(){

        int randomNumber = Utils.generateRandomNumber(citas.length);
        int color = colors[randomNumber];

        Cita cita = citas[randomNumber];
        cita.setColor(color);

        return cita;
    }
}
