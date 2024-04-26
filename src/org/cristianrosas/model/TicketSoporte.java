/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cristianrosas.model;

/**
 *
 * @author informatica
 */
public class TicketSoporte {
    private int TicketSoporte;
    private String descripcionTicket;
    private String estatus;
    private String cliente;
    private int clienteId;
    private int facturaId;
    
    public TicketSoporte(){
        
    }

    public TicketSoporte(int TicketSoporte, String descripcionTicket, String estatus, String cliente, int facturaId) {
        this.TicketSoporte = TicketSoporte;
        this.descripcionTicket = descripcionTicket;
        this.estatus = estatus;
        this.cliente = cliente;
        this.facturaId = facturaId;
    }

    public TicketSoporte(int TicketSoporte, String descripcionTocket, String estatus, int clienteId, int facturaId) {
        this.TicketSoporte = TicketSoporte;
        this.descripcionTicket = descripcionTocket;
        this.estatus = estatus;
        this.clienteId = clienteId;
        this.facturaId = facturaId;
    }

    public int getTicketSoporte() {
        return TicketSoporte;
    }

    public void setTicketSoporte(int TicketSoporte) {
        this.TicketSoporte = TicketSoporte;
    }

    public String getDescripcionTicket() {
        return descripcionTicket;
    }

    public void setDescripcionTicket(String descripcionTocket) {
        this.descripcionTicket = descripcionTocket;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(int facturaId) {
        this.facturaId = facturaId;
    }

    @Override
    public String toString() {
        return "TicketSoporte{" + "TicketSoporte=" + TicketSoporte + ", descripcionTicket=" + descripcionTicket + ", estatus=" + estatus + ", cliente=" + cliente + ", clienteId=" + clienteId + ", facturaId=" + facturaId + '}';
    }
    
}
