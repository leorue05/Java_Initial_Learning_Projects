public interface Alerta extends Mensagem {
    
String DEMORA = "Aguarde um instante...";
String FECHAR = "Encerre o progama de forma correta.";

void exibir(String texto, int icone);

}
