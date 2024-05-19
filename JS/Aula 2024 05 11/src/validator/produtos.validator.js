import { body, param } from 'express-validator'

export const createProdutoValidator = [
    body('descricao').isString().withMessage("Descrição inválido"),
    body('preco').isNumeric().withMessage("Preço inválido"),
]

export const updateProdutoValidator = [
    body('descricao').optional().isString().withMessage("Descrição inválido"),
    body('preco').optional().isNumeric().withMessage("Preço inválido"),
]

export const idProdutoValidator = [
    param("id").isNumeric().withMessage("Id Inválido")
]