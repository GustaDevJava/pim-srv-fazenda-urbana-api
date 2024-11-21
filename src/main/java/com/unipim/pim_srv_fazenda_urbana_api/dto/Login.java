package com.unipim.pim_srv_fazenda_urbana_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Login {

    @NotNull
    @NotBlank
    private String email;
    @NotNull
    @NotBlank
    private String senha;

    private Login(){}

    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
