package br.edu.iftm.renthub.control.Endereco;

import br.edu.iftm.renthub.model.Cidade;
import br.edu.iftm.renthub.model.Endereco;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import org.json.JSONObject;


public class ConsultaCep {
    public static Endereco buscarCep(String cep){
        try{
            URL url = new URL ("https://viacep.com.br/ws/" + cep + "/json/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            BufferedReader leitura = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "UTF-8")
            );
            
            String linha;
            StringBuilder conteudo = new StringBuilder();
            while((linha = leitura.readLine()) != null){
                conteudo.append(linha);
            }
            
            JSONObject resultado = new JSONObject(conteudo.toString());
            if(resultado.has("erro")){
                JOptionPane.showMessageDialog(null, "CEP não encontrado.");
            }else{
                String logradouro = resultado.getString("logradouro");
                String bairro = resultado.getString("bairro");
                String localidade = resultado.getString("localidade");
                String uf = resultado.getString("uf");
                String idIbge = resultado.getString("ibge");
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
