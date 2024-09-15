package Aula06;

import java.util.Scanner;

public class Galinha {
    private static int contador=0;
    private int id;
    private String cor;
    private double peso;
    private double preco;
    private int qtdeDias;

    private final int DIAS_NO_AN0=365;
    private final int IDADE_MAXIMA=(DIAS_NO_AN0*12);
    private final int IDADE_MINIMA=0;
    float ovosPrimeiros5Anos = 2 * 5 * DIAS_NO_AN0;
    float ovosProximos5Anos = 5 * DIAS_NO_AN0;
    float ovosUltimos2Anos = 0.5f * 2 * DIAS_NO_AN0;

    Scanner scan = new Scanner(System.in);

    public Galinha() {
    }

    public Galinha(String cor, double peso, double preco, int qtdeDias) {
        this.id= ++contador;
        setCor(cor);
        setPeso(peso);
        setPreco(preco);
        setQtdeDias(qtdeDias);
    }

    public float qtdOvos() {
        float qtdOvos;
        float anos = (float) this.qtdeDias/DIAS_NO_AN0;
        if (anos<=5){
            qtdOvos = 2;
        } else if (anos<=10) {
            qtdOvos = 1;
        }else{
            qtdOvos = 0.5f;
        }
        return qtdOvos;
    }

    public float ovosProduzidos(int qtdeDias){
        float ovosProduzidos;

        if(qtdeDias< DIAS_NO_AN0*5){
            ovosProduzidos = qtdeDias*2;
        }
        else if (qtdeDias< DIAS_NO_AN0*10){
            ovosProduzidos = ovosPrimeiros5Anos+ (qtdeDias-(DIAS_NO_AN0*5));
        }
        else{
            ovosProduzidos = (float) ovosPrimeiros5Anos+ovosProximos5Anos+((qtdeDias-(DIAS_NO_AN0*10))*0.5f);
        }
        return ovosProduzidos;
    }

    public float expectativaQtdOvos(int qtdeDias) {
        float totalOvos=0;
        if (qtdeDias<DIAS_NO_AN0*5){
            totalOvos = ovosPrimeiros5Anos-(qtdeDias*2) + ovosProximos5Anos + ovosUltimos2Anos;
        }
        else if (qtdeDias<DIAS_NO_AN0*10){
            totalOvos = ovosProximos5Anos-(qtdeDias-(5 * DIAS_NO_AN0)) + ovosUltimos2Anos;
        }
        else{
            totalOvos = ovosUltimos2Anos-((qtdeDias-(10 * DIAS_NO_AN0))*0.5f);
        }
        return totalOvos;
    }

    public int getId() {
        return id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        while(cor == null || cor.isEmpty() || (!cor.equalsIgnoreCase("Branca") && !cor.equalsIgnoreCase("Amarela") && !cor.equalsIgnoreCase("Preta"))){
            System.out.println("Galinha "+this.id+": As cores podem ser apenas 'Branca', 'Amarela' ou 'Preta'");
            System.out.println("Insira uma nova cor para a galinha: ");
            cor = scan.nextLine();
        }
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {
        while (qtdeDias<IDADE_MINIMA || qtdeDias>IDADE_MAXIMA) {
            System.out.println("\nGalinha " + this.id + ": A quantidade de dias deve estar entre " + IDADE_MINIMA + " e " + IDADE_MAXIMA + ".");
            System.out.print("Insira uma nova quantidade de dias: ");
            qtdeDias= scan.nextInt();
        }
        this.qtdeDias= qtdeDias;
    }

    @Override
    public String toString() {
        return "Galinha "+id+"{" +
                ", cor='" + cor + '\'' +
                "qtdeDias=" + qtdeDias +
                ", preco=" + preco +
                ", peso=" + peso +
                ", ovos por dia=" + qtdOvos() +
                ", ovos produzidos=" + ovosProduzidos(this.qtdeDias) +
                ", expectativa de ovos=" + expectativaQtdOvos(this.qtdeDias) +
                '}';
    }
}
