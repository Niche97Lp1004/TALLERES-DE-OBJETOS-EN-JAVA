/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.ejercicio;

/**
 *
 * @author Tania Forero
 */
public class Cuenta {
    public int Id;
    public int IdBranch;
    public int Idbank;
    private int NumberAccount;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getNumberAccount() {
        return NumberAccount;
    }

    public void setNumberAccount(int NumberAccount) {
        this.NumberAccount = NumberAccount;
    }
    
}
