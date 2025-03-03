package org.aplicacao;

import org.aplicacao.dto.EnderecoDto;
import org.aplicacao.servico.ApiSerivco;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        ApiSerivco apiSerivco = new ApiSerivco();
        try {
            EnderecoDto enderecoDto = apiSerivco.getEndereco("74950260");
            System.out.println("Resultado da consulta:");
            System.out.println(enderecoDto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}