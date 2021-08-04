/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.patrones.ascenso;

/**
 *
 * @author J_oa_
 */
public interface Funcion<T> { //La interfaz es un contrato
    double evaluar(T x); //funciones que no tienen cuerpo
    // se le deja la implementación especifica a cargo del usuario que implemente
    // la  interfaz
}
