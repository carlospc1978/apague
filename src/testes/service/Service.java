package testes.service;

import testes.model.Pessoa;

public class Service {

    Pessoa pessoa = new Pessoa();



    public void resolve () {

        pessoa = getPessoa();

        System.out.println("checado antes >>> "+pessoa.isChecado());
        pessoa.setChecado(false);

        System.out.println("checado >>> "+pessoa.isChecado());

    }

    private Pessoa getPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carlos");
        pessoa.setIdade(43);
        pessoa.setChecado(true);
        return pessoa;
    }



}
