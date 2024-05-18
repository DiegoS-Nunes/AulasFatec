import Produtos from '../models/produto.model.js'
import { validationResult } from 'express-validator'

export default class produtoController {

  static async getAll(req, res) {
    res.json(await Produtos.findMany())
  }

  static async create(req, res) {
    const errors = validationResult(req)
    if (!errors.isEmpty()) {
      return res.status(400).json({ errors: errors.array() })
    }
    res.json(await Produtos.create({ data: req.body }))
  }

  static async getId(req, res) {
    const errors = validationResult(req)
    if (!errors.isEmpty()) {
      return res.status(400).json({ errors: errors.array() })
    }

    const produto = await Produtos.findUnique({ where: { id: parseInt(req.params.id) } })
    if (!produto) { return res.status(400).json({ message: "Id não encontrado" }) }
    res.json(produto)
  }

}