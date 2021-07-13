package com.caso.cuentaxPagar.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "cuentaxpagar")
@AllArgsConstructor
@NoArgsConstructor


public class CuentaxPagar {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
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
