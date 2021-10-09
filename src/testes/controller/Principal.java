package testes.controller;

import testes.model.Pessoa;
import testes.service.Service;

public class Principal {

    public static void main(String[] args) {
        Service service = new Service();
        service.resolve();
    }

}
