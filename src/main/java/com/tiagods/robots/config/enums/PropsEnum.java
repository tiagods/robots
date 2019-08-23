package com.tiagods.robots.config.enums;

public enum PropsEnum {
    CLIENTES("/clientes.properties"),
    KEYCODE("/keycodes.properties"),
    LOGON("/credentials/logon.properties");
    private String descricao;
    private PropsEnum(String descricao) {
        this.descricao=descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
