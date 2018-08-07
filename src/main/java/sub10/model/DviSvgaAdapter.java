package sub10.model;

public class DviSvgaAdapter extends Dvi {
    Svga svga;

    public DviSvgaAdapter(Svga svga) {
        this.svga = svga;
    }

    @Override
    public void transferVideo(String stream) {
        svga.transferVideo(stream);
    }

    @Override
    public void transferAudio(String stream) {

    }
}
