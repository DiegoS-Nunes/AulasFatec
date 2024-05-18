import { Router } from "express";
import { createProdutoValidator } from '../validator/produtos.validator.js'
import produtoController from "../controllers/produto.controller.js";

const router = Router()

router.get('/', createProdutoValidator, produtoController.getAll)
router.post('/', createProdutoValidator, produtoController.create)

export default router