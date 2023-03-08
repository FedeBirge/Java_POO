/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author feder
 */
//numeroCuenta (entero), 
//el DNI del cliente (entero largo)
//y el saldo actual (entero)
public class Cuenta {
    private int NCuenta;
    private long DNI;
    private int saldo;

    public Cuenta() {
    }

    public Cuenta(int NCuenta, long DNI, int saldo) {
        this.NCuenta = NCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getNCuenta() {
        return NCuenta;
    }

    public void setNCuenta(int NCuenta) {
        this.NCuenta = NCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
     
    @Override
    public String toString() {
        return "Cuenta{" + "NCuenta=" + NCuenta + ", DNI=" + DNI + ", saldo=" + saldo + '}';
    }
    
    
    
}
