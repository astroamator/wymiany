/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.currency.exchange.exceptions;

/**
 *
 * @author rober
 */
public class InsufficientAmountException extends BussinesRuleException {
    
    public InsufficientAmountException(Object... objects) {
        super("insufficient.amount", objects);
    }
    
}
