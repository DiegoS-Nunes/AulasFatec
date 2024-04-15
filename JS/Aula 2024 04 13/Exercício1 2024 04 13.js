/*Crie uma classe chamada Estudante, essa classe deve conter os atributos: 
nome, e-mail, RA, curso e uma lista com o nome das disciplinas que o estudante está matriculado. 
A classe também deve ter dois métodos: 
    primeiraDisciplina e ultimaDisciplina que vão devolver respectivamente a primeira disciplina que o estudante está 
    matriculado e a última.

Para testar, crie dois estudantes de exemplo e imprima os valores na tela.*/ 

class Estudante{
    constructor (nome,email,RA,curso,disciplinas){
        this.nome=nome,
        this.email=email,
        this.RA=RA,
        this.curso=curso,
        this.disciplinas=disciplinas
    }

    primeiraDisciplina(){
        const primeira = this.disciplinas.split(",")
        return primeira[0]
    }
    ultimaDisciplina(){
        const ultima = this.disciplinas.split(",")
        return ultima[ultima.length-1]
    }
}

let aluno1= new Estudante("Diego", "diego@gmail.com", "1050482323041", "ADS", "Linguagem de programação, Hardware, Cálculos")
let aluno2= new Estudante("João", "joão@gmail.com", "1234", "Letras", "Português, Gramática, Comunicação")

console.log(aluno2.primeiraDisciplina())