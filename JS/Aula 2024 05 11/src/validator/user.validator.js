import { body } from 'express-validator'

export const createUserValidator = [
    body('email').isString().withMessage("Email inválido"),
    body('nome').isString().withMessage("Nome inválido"),
]