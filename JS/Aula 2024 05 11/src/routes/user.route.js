import { Router } from 'express'
import { createUserValidator } from '../validator/user.validator.js'
import UserController from '../controllers/user.controller.js'

const router = Router()

router.get('/', createUserValidator, UserController.getAll)
router.post('/', createUserValidator, UserController.create)

export default router