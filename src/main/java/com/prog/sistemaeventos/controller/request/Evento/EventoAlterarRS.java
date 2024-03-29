package com.prog.sistemaeventos.controller.request.Evento;

import java.time.LocalDate;

public class EventoAlterarRS {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String localEvento;
    private String localInscricao;
    private String publicoAlvo;
    private double valorInvestimento;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    public String getLocalEvento() {
        return localEvento;
    }
    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }
    public String getLocalInscricao() {
        return localInscricao;
    }
    public void setLocalInscricao(String localInscricao) {
        this.localInscricao = localInscricao;
    }
    public String getPublicoAlvo() {
        return publicoAlvo;
    }
    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }
    public double getValorInvestimento() {
        return valorInvestimento;
    }
    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    
}
