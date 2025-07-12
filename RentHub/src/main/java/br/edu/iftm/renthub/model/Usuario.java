package br.edu.iftm.renthub.model;

public class Usuario {
    private String nome;
    private char[] senha;
    
    public Usuario(String usuario, char[] senha) {
        this.nome = usuario;
        this.senha = senha;
    }
    
    public String getUsuario() {
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String usuario) {
        this.nome = usuario;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }
}
