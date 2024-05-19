import { body, param } from 'express-validator'

export const createUserValidator = [
    body('email').isString().withMessage("Email inválido"),
    body('nome').isString().withMessage("Nome inválido"),
    body('idade').isString().withMessage("Idade inválida"),
]

export const updateUserValidator = [
    body('email').optional().isString().withMessage("Email inválido"),
    body('nome').optional().isString().withMessage("Nome inválido"),
    body('idade').optional().isString().withMessage("Idade inválida"),
]

export const idUserValidator = [
    param("id").isNumeric().withMessage("Id Inválido")
]