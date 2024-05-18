import User from '../models/user.model.js'
import { validationResult } from 'express-validator'

export default class UserController {
  static async getAll(req, res) {
    const errors = validationResult(req)
    if (!errors.isEmpty()) {
      return res.status(400).json({ errors: errors.array() })
    }
    res.json(await User.findMany())
  }

  static async create(req, res) {
    const errors = validationResult(req)
    if (!errors.isEmpty()) {
      return res.status(400).json({ errors: errors.array() })
    }
    res.json(await User.create({ data: req.body }))
  }
}