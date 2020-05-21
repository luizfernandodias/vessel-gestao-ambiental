package br.com.siga.messages;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Mensageria {

	
	public void enviaMensagem() {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		factory.setUsername("guest");
		factory.setPassword("guest");
		factory.setPort(5672);
		try (Connection connection = factory.newConnection()) {
			Channel channel = connection.createChannel();
			channel.queueDeclare("siga", false, false, false, null);
			String mensagem = "Teste de conexão";
			channel.basicPublish("", "siga", null, mensagem.getBytes("UTF-8"));	
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String [] args) {
		new Mensageria().enviaMensagem();
	}
	
}
