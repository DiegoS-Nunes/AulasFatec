/* pelo modo fetch é necessário converter a importação da API em JSON. Pelo Axios já vem como JSON. 
adicionar no package para habilitar o import: "type": "module",
*/
fetch(`https://pokeapi.co/api/v2/pokemon/ditto`)
.then((resposta) => resposta.json())
.then((dados) => {
    console.log(dados.game_indices)
})

import axios from 'axios'
axios.get(`https://pokeapi.co/api/v2/pokemon/ditto`)
.then((resposta) => console.log(resposta.data))