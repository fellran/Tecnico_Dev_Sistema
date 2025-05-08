package com.mycompany.banco;

import java.util.Scanner;

public class Conta {
    private int numConta, tipoConta;
    private String  donoConta;
    private double saldo;
    private boolean status;
    
    Scanner input = new Scanner(System.in);

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    // Getter
    
    public int getNumConta() {
        return numConta;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public Scanner getInput() {
        return input;
    }

    
    // abrir conta
    
    public String abrirConta(){
        
        String response = null;
        
        System.out.println(">> Abrir Conta << ");
        System.out.print("Digite seu nome \n >> ");
        this.donoConta = input.nextLine();
        System.out.print("Digite um novo numero de conta \n >> ");
        this.numConta = input.nextInt();
        System.out.print(">> Informe o tipo de conta << \n [1] Conta poupanca"
                + " (CP) \n [2]  Conta Corrente (CC) \n >> ");
        this.tipoConta = input.nextInt();
        
        System.out.println(getTipoConta());
        switch(getTipoConta()){
            case 1:
                this.saldo = 50;
                this.status = true;
                System.out.print("Conta Poupanca selecionada \n voce recebeu um saldo de R$:" + this.getSaldo() + "\n \n Conta Ativada \n Nome : "+this.donoConta+"\n Numero da Conta :"+this.getNumConta()+"\n Saldo : "+this.getSaldo());
;                break;
            
            case 2:
                this.saldo = 150;
                this.status = true;
                System.out.print("Conta Corrente selecionada \n voce recebeu um saldo de R$:"+this.getSaldo()+ "\n \n Conta Ativada \n Nome : "+this.donoConta+"\n Numero da Conta :"+this.getNumConta()+"\n Saldo : "+this.getSaldo());
                break;
            default:
                System.out.println("Informe apenas 1 e 2");
        }
        return response;
    }
}

