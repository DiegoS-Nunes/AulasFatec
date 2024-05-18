import produtos from '../models/produto.model.js'
import { validationResult } from 'express-validator'

export default class produtoController {

  static async getAll(req, res) {
    res.json(await produtos.findMany())
  }

  static async create(req, res) {
    const errors = validationResult(req)
    if (!errors.isEmpty()) {
      return res.status(400).json({ errors: errors.array() })
    }
    res.json(await produtos.create({ data: req.body }))
  }

}