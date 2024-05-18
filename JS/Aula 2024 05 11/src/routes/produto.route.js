import { Router } from "express";
import { createProdutoValidator, getProdutoValidator } from '../validator/produtos.validator.js'
import produtoController from "../controllers/produto.controller.js";

const router = Router()

router.get('/', produtoController.getAll)
router.post('/', createProdutoValidator, produtoController.create)
router.get('/:id', getProdutoValidator, produtoController.getId)

export default router