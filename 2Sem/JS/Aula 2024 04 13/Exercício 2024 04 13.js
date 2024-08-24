/*Crie uma classe chamada Estudante, essa classe deve conter os atributos: 
nome, e-mail, RA, curso e uma lista com o nome das disciplinas que o estudante está matriculado. 
A classe também deve ter dois métodos: 
    primeiraDisciplina e ultimaDisciplina que vão devolver respectivamente a primeira disciplina que o estudante está 
    matriculado e a última.

Para testar, crie dois estudantes de exemplo e imprima os valores na tela.*/  

const prompt=require('prompt-sync')()

class Estudante{
    constructor (nome,email,RA,curso,disciplinas){
        this.nome=nome,
        this.email=email,
        this.RA=RA,
        this.curso=curso,
        this.disciplinas=disciplinas
    }

    primeiraDisciplina(){
        this.disciplinas.split(",")
        return this.disciplinas[0]
    }
    ultimaDisciplina(){
        this.disciplinas.split(",")
        return this.disciplinas[this.disciplinas.length-1]
    }
}

main()
function main (){
    let opc=-1
    let alunos=[]
    while(opc!==0){        
        opc = Number(prompt("Qual opção deseja?\n0-Sair\n1-Cadastrar novo aluno\n2-Consultar alunos\n"))
        switch(opc){
            case 0:
                return 1;
            case 1:
                cadastrar(alunos)
                break;
            case 2:
                listar(alunos)
                break;
            default:
                console.log("ERRO: Opção inválida!!!")
                break;
        }
    }
}

function cadastrar(cadastro){
    const atributos=['Nome','Email','RA','Curso','disciplinas']
    let opc=-1

    while(opc!==0){
        let aluno={}
        for(atributo of atributos){
            aluno[atributo]=prompt(`Qual ${atributo=="disciplinas" ? 'as disciplinas do estudante separadas por ","?:' : `o ${atributo} do estudante?:`}`)
        }
        cadastro.push(new Estudante(aluno.nome,aluno.email,aluno.RA,aluno.curso,aluno.disciplinas))
        opc=Number(prompt("\nO que deseja fazer?\n0-Voltar\n1-Cadastrar novo aluno\n"))   
    }
    return console.log(cadastro)
}
/*
function listar(aluno){
 

    function show(aluno){
        for(value in aluno){
            console.log(value+": "+aluno[value])
        }
    }

    return show(aluno)
}
*/