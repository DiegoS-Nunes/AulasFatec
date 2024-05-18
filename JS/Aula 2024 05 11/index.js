import { Router } from 'express'
import userRoute from './src/routes/user.route.js'
import produtosRoute from './src/routes/produto.route.js'

const router = Router()

router.use('/users', userRoute)
router.use('/produtos', produtosRoute)

export default router