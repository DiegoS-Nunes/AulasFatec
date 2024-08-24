const input=require(`prompt-sync`)();

main()
function main(){
    let lista=[]

    criaLista(lista) // Inicializa a lista com os valores inseridos pelo usuário

    // Exibe os resultados na tela
    console.log(`Sua lista: ${exibirLista(lista)}`);
    console.log(`A média dos valores da sua lista é ${somaEmediaLista(lista).media}`);
    console.log(`O menor valor da sua lista é ${Math.min(...lista)}`);
    console.log(`O maior valor da sua lista é ${Math.max(...lista)}`);
    console.log(`A soma dos valores da sua lista é ${somaEmediaLista(lista).soma}`);
    console.log(`Os valores menores que 20 na sua lista são ${lista.filter(item => item<20)}`);
    console.log(`Os valores maiores que a média na sua lista são ${lista.filter(item => item >somaEmediaLista(lista).media)}`);
    console.log(`O primeiro valor da sua lista é ${primeiroEultimo(lista).primeiro}`);
    console.log(`O último valor da sua lista é ${primeiroEultimo(lista).ultimo}`);
}

function criaLista(lista){
    let tamLista = Number(input("Quantos valores deseja inserir? "))
    for (let i=0; i<tamLista; i++){
        let valor = Number(input(`Digite o valor ${i+1}: `))
        lista.push(valor)
    }
    return lista
}
function exibirLista(lista){
    let concatenar = ''
    for (let i=0; i<lista.length; i++){
        concatenar +=lista[i]
        if (i !== lista.length-1){
            concatenar+=' ' // Retorna os valores da lista separados por espaço
        }
    }
    return concatenar
}
function somaEmediaLista(lista){
    let valor = 0
    for (let i=0;i<lista.length;i++){
        valor+=lista[i]
    }
    return {media: valor/lista.length, soma: valor}
}
function primeiroEultimo(lista){
    let primeiro = lista[0]
    let ultimo = lista[lista.length-1]

    return{
        primeiro: primeiro,
        ultimo: ultimo
    }
}