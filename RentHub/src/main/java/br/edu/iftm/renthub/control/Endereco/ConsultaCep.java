/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.renthub.control.Endereco;

import br.edu.iftm.renthub.model.Cidade;
import br.edu.iftm.renthub.model.Endereco;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import org.json.JSONObject;


//Criado por Jhonnie em 09/07/2025
public class ConsultaCep {
    public static Endereco buscarCep(String cep){
        try{
            URL url = new URL ("https://viacep.com.br/ws/" + cep + "/json/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            BufferedReader entrada = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "UTF-8")
            );
            
            String inputLine;
            StringBuilder content = new StringBuilder();
            while((inputLine = entrada.readLine()) != null){
                content.append(inputLine);
            }
            
            JSONObject json = new JSONObject(content.toString());
            if(json.has("erro")){
                JOptionPane.showMessageDialog(null, "CEP não encontrado.");
            }else{
                String logradouro = json.getString("logradouro");
                String bairro = json.getString("bairro");
                String localidade = json.getString("localidade");
                String uf = json.getString("uf");
                String idIbge = json.getString("ibge");
                return new Endereco(cep, new Cidade(idIbge, localidade, uf), logradouro, bairro);
            }
            return null;
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar o CEP.");
            return null;
        }
    }
}
