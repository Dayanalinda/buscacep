package com.example.dayanapsilva2.buscacep;

/**
 * Created by dayana.psilva2 on 02/04/2018.
 */

public class CEP {
    private String cep;
    private String logradouro;
    private String complemento;
    private  String bairro;
    private  String cidade;
    private  String estado;

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString(){
        return "CEP"+ getCep()
                +"\nLogradouro: "+getLogradouro()
                +"\nComplemento: "+getComplemento()
                +"\nBairro: "+getBairro()
                +"\nCidade: "+getCidade()
                +"\nEstado: "+getEstado();
    }
}
