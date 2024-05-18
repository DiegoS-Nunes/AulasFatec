import { body } from 'express-validator'

export const createProdutoValidator = [
    body('descricao').isString().withMessage("Descrição inválido"),
    body('preco').isNumeric().withMessage("Preço inválido"),
]