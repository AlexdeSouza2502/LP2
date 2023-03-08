/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

public class Funcionario {
    
   
    private String nome;
    private String dep;
    private double salario;
    private String dataDeEntrada;
    private String rg;
    private boolean ativo;
    
    public Funcionario(String nome, String departamento, double salario, String dataEntrada, String rg, boolean ativo) {
        this.nome = nome;
        this.dep = departamento;
        this.salario = salario;
        this.dataDeEntrada = dataEntrada;
        this.rg = rg;
        this.ativo = ativo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDep() {
        return dep;
    }
    
    public void setDep(String dep) {
        this.dep = dep;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getDataDeEntrada() {
        return dataDeEntrada;
    }
    
    public void setDataDeEntrada(String dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }
    
    public String getRg() {
        return rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public boolean isAtivo() {
        return ativo;
    }
    
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void bonifica(double aumento) {
        this.salario += aumento;
    }
    
    public void demite() {
        this.ativo = false;
    }
    
    public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.dep);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data de Entrada: " + this.dataDeEntrada);
        System.out.println("RG: " + this.rg);
        System.out.println("Ativo: " + this.ativo);
    }
}
