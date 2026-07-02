package io.github.felipe_damasceno19.app.users;

public enum Role {
    CUSTOMER("customer"),
    KITCHEN("kitchen");

    private final String valor;

    Role(String valor) {
            this.valor = valor;
        }

    public String getValor() {
            return valor;
        }

}
