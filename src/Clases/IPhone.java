package Clases;

import java.util.List;

public class IPhone {
    int Numero;
    ReprodutorMusical reprodutorMusical;
    Navegador navegador;
    GerenciadorEmail email;
    List<String> mensagensDeVoz;

    public void ligar(){
        System.out.println("Ligando o telefone!");
    }

    public void desligar(){
        System.out.println("Desligando o telefone!");
    }

    public void iniciarChamada(){
        System.out.println("Fazendo ligação por chamada!");
    }

    public void ligarCamera(){
        System.out.println("Ligando a camera do celular!");
    }

    public void ligarWifi(){
        System.out.println("Ligando o Wifi!");
    }

    public void ouvirMensagemDeVoz(){
        System.out.println("Ouvindo mensagem de voz!");
        this.mensagensDeVoz = List.of("Mensagem 1", "Mensagem 2", "Mensagem 3");
        for (String mensagem : mensagensDeVoz) {
            System.out.println(mensagem);
        }
    }

    public void verFotos(){
        System.out.println("Vendo fotos!");
    }

}
