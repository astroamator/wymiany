/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.currency.exchange.clients.model;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author rober
 */
@Data
@Builder
public class Rate {

    private String no;
    private LocalDate effectiveDate;
    private float bid;
    private float ask;
    
}
