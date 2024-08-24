fetch(`https://pokeapi.co/api/v2/pokemon/ditto`)
.then((resposta) => resposta.json())
.then((dados) => {
    console.log(dados.game_indices)
})

// npm init -y (crio package.json)
// npm i axios
// "type": "module", (adicionar no package)

import axios from 'axios'
axios.get(`https://viacep.com.br/ws/01001000/json/`)
.then((resposta) => console.log(resposta.data))

async function getPokemonData(numero){
    const resposta = await axios.get(`https://pokeapi.co/api/v2/pokemon/${numero}`)
    return resposta.data
}

console.log(getPokemonData(100))
const m2 = await getPokemonData(150)
console.log(m2)