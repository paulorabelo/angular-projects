package com.project.backend.model.dto;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class StockDTO {

    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private Double price;

    @NotNull
    private LocalDate date;

    @NotNull
    private Double variation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getVariation() {
        return variation;
    }

    public void setVariation(Double variation) {
        this.variation = variation;
    }
}
