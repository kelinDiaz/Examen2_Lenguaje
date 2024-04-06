package hn.unah.lenguaje.examen2.Entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuentas")
@Data
public class Cuentas {

    @Id
    @Column(name = "numerocuenta")
    private String numeroCuenta; 


    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Cliente cliente; 

    private double saldo;

    @Column(name = "fechaapertura")
    private LocalDate fechaApertura = LocalDate.now(); 

    private boolean estado ; 

    private boolean sobregiro; 
    
}
