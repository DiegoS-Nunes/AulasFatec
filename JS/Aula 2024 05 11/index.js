import { Router } from 'express'
import userRoute from './src/routes/user.route.js'
import produtosRoute from './src/routes/produto.route.js'
import tarefasRoute from './src/routes/tarefas.route.js'

const router = Router()

router.use('/users', userRoute)
router.use('/produtos', produtosRoute)
router.use('/tarefas', tarefasRoute)

export default router