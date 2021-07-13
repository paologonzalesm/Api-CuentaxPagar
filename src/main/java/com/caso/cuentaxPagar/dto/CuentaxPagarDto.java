package com.caso.cuentaxPagar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class CuentaxPagarDto {
    @Getter @Setter
    private int idCuentaxPagar;
    @Getter @Setter
    private int idCompra;
    @Getter @Setter
    private  int idUsuario;
    @Getter @Setter
    private int numeroDocumento;
    @Getter @Setter
    private Date fechaIngreso;
    @Getter @Setter
    private Date fechaTransaccion;
    @Getter @Setter
    private float subTotal;
    @Getter @Setter
    private float descuento;
    @Getter @Setter
    private float total;
    @Getter @Setter
    private float saldoDeuda;
}
