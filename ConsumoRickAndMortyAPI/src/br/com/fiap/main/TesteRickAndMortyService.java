package br.com.fiap.main;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Personagem;
import br.com.fiap.services.RickAndMortyServices;

public class TesteRickAndMortyService {

    public static void main(String[] args) throws ClientProtocolException, IOException {
       
        RickAndMortyServices rickAndMortyService = new RickAndMortyServices();

        String personagemId = JOptionPane.showInputDialog("Informe o ID do personagem para pesquisa");

        try {
            int id = Integer.parseInt(personagemId);

            Personagem personagem = rickAndMortyService.getPersonagem(id);

            if (personagem != null) {
               
                System.out.println("Informações do Personagem:");
                System.out.println("ID: " + personagem.getId());
                System.out.println("Nome: " + personagem.getName());
                System.out.println("Status: " + personagem.getStatus());
                System.out.println("Raça: " + personagem.getSpecies());                
                System.out.println("Gênero: " + personagem.getGender());
            } else {
                System.out.println("Personagem não encontrado com o ID fornecido.");
            }
        } catch (NumberFormatException e) {
            System.out.println("ID do personagem fornecido não é um número válido.");
        }
    }
}
