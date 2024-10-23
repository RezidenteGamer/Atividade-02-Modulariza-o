import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MiniChatBot chatbot = new MiniChatBot();

        String respostaUsuario;

            System.out.println("Olá! Eu sou o MiniChatBot. Como posso te ajudar hoje?");
        do {
            respostaUsuario = scanner.nextLine();

            String respostaDoChatBot = chatbot.responder(respostaUsuario);

            System.out.println(respostaDoChatBot);
        } while (!respostaUsuario.equalsIgnoreCase("Sair"));
    }
}
