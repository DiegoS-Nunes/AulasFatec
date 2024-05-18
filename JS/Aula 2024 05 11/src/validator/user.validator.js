import { body, param } from 'express-validator'

export const createUserValidator = [
    body('email').isString().withMessage("Email inválido"),
    body('nome').isString().withMessage("Nome inválido"),
]

export const getUserValidator = [
    param("id").isNumeric().withMessage("Id Inválido")
]

export const putUserValidator = [
    param("id").isNumeric().withMessage("Id Inválido")
]