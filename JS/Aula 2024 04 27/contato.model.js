export class Contato{
    constructor(nome, email, telefone){
        this.nome = nome
        this.email = email
        this.telefone = telefone
    }
}

export const getContatos = () => {
    return dbContatos
}

export const findByIndex = (index) => {
    return dbContatos[index]
}

export const dbContatos = [
    new Contato("Teste","email@email",1234456),
    new Contato("Teste 2","email2@email",4323432)
]