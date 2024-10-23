public class MiniChatBot {

    public String responder(String resposta){
        if (resposta.equalsIgnoreCase("Oi")){
            return "Olá! Como posso ajudar?";
        }
        if (resposta.equalsIgnoreCase("Como você está?")){
            return "Estou funcionando perfeitamente, obrigado!";
        }
        if (resposta.equalsIgnoreCase("Qual é o seu nome?")){
            return "Eu sou o MiniChatbot, seu assistente virtual!";
        }
        if (resposta.equalsIgnoreCase("sair")){
            return "Tchau! Até a próxima.";
        }

        return "Não entendi";
    }


}