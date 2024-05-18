import User from '../models/user.model.js'
import { validationResult } from 'express-validator'

export default class UserController {
  static async getAll(req, res) {
    res.json(await User.findMany())
  }

  static async create(req, res) {
    const errors = validationResult(req)
    if (!errors.isEmpty()) {
      return res.status(400).json({ errors: errors.array() })
    }
    res.json(await User.create({ data: req.body }))
  }

  static async getId(req, res) {
    const errors = validationResult(req)
    if (!errors.isEmpty()) {
      return res.status(400).json({ errors: errors.array() })
    }

    const user = await User.findUnique({ where: { id: parseInt(req.params.id) } })
    if (!user) { return res.status(400).json({ message: 'Usuário não encontrado' }) }
    res.json(user)
  }

  static async update(req, res) {
    const errors = validationResult(req)
    if (!errors.isEmpty()) {
      return res.status(400).json({ errors: errors.array() })
    }

    const user = await User.update({ where: { id: parseInt(req.params.id) }, data: req.body })
    if (!user) { return res.status(400).json({ message: 'Usuário não encontrado' }) }
    res.json(user)
  }
}