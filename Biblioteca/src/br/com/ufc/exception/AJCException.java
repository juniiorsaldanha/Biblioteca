/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.exception;

/**
 *
 * @author ronny
 */
public class AJCException extends Exception {
    public AJCException() {
        super("Aluno já cadastrado!");
    }
}
