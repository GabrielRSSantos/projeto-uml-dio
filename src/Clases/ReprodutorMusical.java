package Clases;

public class ReprodutorMusical {
    String musica;
    int volume = 0;

    ReprodutorMusical(String musica){
        this.musica = musica;
    }

    public void tocarMusica(String musica){
        System.out.println("Tocando a musica: " + musica);
    }

    public void pausarMusica(){
        System.out.println("Pausando musica!");
    }

    public void mudarVolume(int volume){
        this.volume = volume;
        System.out.println("O volume é: " + this.volume);
    }
}
