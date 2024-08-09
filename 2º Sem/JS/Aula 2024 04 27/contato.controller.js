import { getContatos, findByIndex } from "../models/contato.model.js"

class ContatoController{
    static index(req,res){
        res.json(getContatos())
    }

    static getOne(req,res){
        const index = req.params.index
        res.json(findByIndex(index))
    }

    // static create(req,res){
    // }
}

export default ContatoController