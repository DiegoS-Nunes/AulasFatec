const lista = ["a","b","c"]

lista[1] = "b1" //apesar de ser constante os valores da lista podem ser modificados, mas não a variável "lista"

lista.push("abc") //insere um novo valor no final do array
//console.log(lista)

lista.pop()//remove um valor do final do array
//console.log(lista)

//console.log(lista[lista.length-1])//mostra o último valor do array

//Laços podem ser feitos com for (mais difícil) ou foreach (mais simples)
for(let i=0; i<lista.length; i++){
    //console.log(lista[i])
}

/*aqui o for each cria uma "cópia" das variáves da lista, 
ao modificar os valores atribuidos a essa cópia a lista não é modificada, 
apenas os valores da cópia*/
lista.forEach((valor,indice) =>{
    //console.log(`Pos ${indice} - Valor ${valor}`)
    lista[indice] = 10 //aqui você consegue alterar o valor da lista diretamente, não da cópia
})

//exemplo de array matricial
const matriz = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
]
//console.log(matriz[1][1])

//exercício1
const array=[3,5,8,3,7,4,1]

function maiorMenor (array,opcao){
    switch (opcao){
        case 0:
            let menor=array[0]
            for (let valor of array){
                if (valor<menor){
                menor=valor
                }
            }
            return console.log(menor)

        case 1:
            let maior=array[0]
            for (let valor of array){
                if (valor>maior){
                maior=valor
                }
            }
            return console.log(maior)        
        default: "erro"
    }
}

maiorMenor(array,1)

//resolução do professor
function maiorEMenorV3(lista){
    console.log(Math.max(...lista))
    console.log(Math.min(...lista))
}

resolução do professor:
function maiorEMenor(lista){
    let maior = lista[0]
    let menor = lista[0]

    for(let i = 1; i < lista.length; i++){
        if(lista[i] > maior){
            maior = lista[i]
        }
        if(lista[i] < menor){
            menor = lista[i]
        }
    }

    console.log(maior)
    console.log(menor)
}

function maiorEMenorV2(lista){
    Math.max(...lista)

    console.log(maior)
    console.log(menor)
}

maiorEMenor([3,7,90,10,5,1])
maiorEMenorV2([3,7,90,10,5,1])


//O Map altera os itens da lista diretamente
const listaUm = [2,4,6,8]
/*const listaDobro = listaUm.map((item) => {
    return item * 2
})*/
const listaDobro = listaUm.map(item => item * 2)
//console.log(listaDobro)

const resultMaior9 = listaUm.find(item => item > 9)
console.log(resultMaior9)

const todosMaiores9 = listaUm.filter(item => item > 9)
console.log(todosMaiores9)

const somaLista = listaUm.reduce((total,valor) => total + valor, 0)

const temMaiorque10 = listaUm.some(valor => valor > 10)

const listaA = [1,2,3]
const listaB = [...listaA,4,5]

Math.max(...listaA)