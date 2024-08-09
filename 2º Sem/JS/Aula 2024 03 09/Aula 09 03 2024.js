import PromptSync from "prompt-sync"
const prompt=PromptSync()
const tabuada = Number(prompt('Digite uma tabuada '))
for(let i=0; i<=10; i++){
    console.log(`${i}X${tabuada}=${i*tabuada}`)
}