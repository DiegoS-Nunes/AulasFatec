import { Router } from 'express'
import { createUserValidator, getUserValidator, putUserValidator } from '../validator/user.validator.js'
import UserController from '../controllers/user.controller.js'

const router = Router()

router.get('/', UserController.getAll)
router.post('/', createUserValidator, UserController.create)
router.get('/:id', getUserValidator, UserController.getId)
router.put('/:id', putUserValidator, UserController.update)

export default router