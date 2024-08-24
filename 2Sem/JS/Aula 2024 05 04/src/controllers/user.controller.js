import User from '../models/user.model.js'

export default class UserController{
    static async index(req,res){
        const users = await User.findMany()
        res.json(users)
    }
}