import express from 'express'
import ContatoController from '../controllers/contato.controller.js'

const router = express.Router()

router.get('/', ContatoController.index)
router.get('/:index', ContatoController.getOne)

export default router