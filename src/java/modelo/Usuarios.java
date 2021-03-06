package modelo;
// Generated 20/11/2017 14:15:23 by Hibernate Tools 4.3.1

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;




/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {
     
     
     private int id;
     private String nome;
     private String sobrenome;
     private String email;
     private String senha;
     private String endereco;
     private String complemento;
     private String cidade;
     private String estado;
     private Integer cep;
     private Integer perfil;

    public Usuarios() {
    }

	
    public Usuarios(int id) {
        this.id = id;
    }
    public Usuarios(int id, String nome, String sobrenome, String email, String senha, String endereco, String complemento, String cidade, String estado, Integer cep, Integer perfil) {
       this.id = id;
       this.nome = nome;
       this.sobrenome = sobrenome;
       this.email = email;
       this.senha = senha;
       this.endereco = endereco;
       this.complemento = complemento;
       this.cidade = cidade;
       this.estado = estado;
       this.cep = cep;
       this.perfil = perfil;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Integer getCep() {
        return this.cep;
    }
    
    public void setCep(Integer cep) {
        this.cep = cep;
    }
    public Integer getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Integer perfil) {
        this.perfil = perfil;
    }




}


