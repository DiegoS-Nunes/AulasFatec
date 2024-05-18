import { body, param } from 'express-validator'

export const createProdutoValidator = [
    body('descricao').isString().withMessage("Descrição inválido"),
    body('preco').isNumeric().withMessage("Preço inválido"),
]

export const getProdutoValidator = [
    param("id").isNumeric().withMessage("Id Inválido")
]