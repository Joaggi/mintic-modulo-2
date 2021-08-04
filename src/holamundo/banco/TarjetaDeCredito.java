/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.banco;

/**
 *
 * @author J_oa_
 */
public class TarjetaDeCredito {
    Banco banco;
    Cliente cliente;

    public TarjetaDeCredito(Banco banco, Cliente cliente) throws Exception{
        if(banco == null) throw new Exception("El banco no puede ser nulo");
        if(cliente == null) throw new Exception("El cliente no puede ser nulo");
        
        this.banco = banco;
        this.cliente = cliente;
    }
    
    
}
