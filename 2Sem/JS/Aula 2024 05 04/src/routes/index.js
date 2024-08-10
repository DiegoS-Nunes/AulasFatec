import { Router } from 'express'
import userRoute from './user.route.js'
//import taskRoute from ''

const router = Router()

router.use('/users', userRoute)
//router.use('/tasks', taskRoute)

export default router