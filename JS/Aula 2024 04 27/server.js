import express from 'express'
import contatoRouter from './routes/contato.route.js'
const app = express()
const port = 3000

// npm i --save-dev nodemon

app.use(express.json())
app.use('/contatos',contatoRouter) // localhost:3000/contatos/
// app.use('/usuarios',usuarioRouter)

app.listen(port, () => {
    console.log(`Server rodando na porta ${port}`)
})