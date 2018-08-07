package sub10;

import sub10.model.Dvi;
import sub10.model.DviSvgaAdapter;
import sub10.model.Svga;

public class Main {

    public static void main(String[] args) {

        Dvi dvi = new Dvi();
        doShowVideo(dvi, "Показываю картинку");
        doPlayAudio(dvi, "Играю музыку");


        Dvi dviSvgaAdapter = new DviSvgaAdapter(new Svga());
        doShowVideo(dviSvgaAdapter, "Показываю картинку");
        doPlayAudio(dviSvgaAdapter, "Играю музыку");


    }

    static void doShowVideo(Dvi dvi, String steam){
        dvi.transferVideo(steam);
    }

    static void doPlayAudio(Dvi dvi, String steam){
        dvi.transferAudio(steam);
    }

}
