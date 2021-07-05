// without using routers{it will print json format}
// const express = require('express');
// const app = express();
// app.use(express.json());
// const genres = [
//     { id: 1, name: 'Action' },  
//     { id: 2, name: 'Horror' },  
//     { id: 3, name: 'Romance' },  
//   ];
// const employees=[
//     {id:100, firstName: 'John', lastName: 'Doe'},
//     {id:101, firstName: 'Marry', lastName: 'Gold'},
//     {id:100, firstName: 'Sachin', lastName: 'Tendulkar'},
//     {id:100, firstName: 'Sourav', lastName: 'Ganguly'}
// ]
// app.get('/',(req,res)=>{

//     res.send('hello world');
// });
// app.get('/api/genres', (req, res) => {
//     res.send(genres);
//   });

//   app.get('/api/employees',(req,res)=>{

//     res.send(employees);
//   });

// app.listen(3000,()=>{

//     console.log('server started on port number 3000');
// })


const vidlyRouter=require('./routes/admin');
const express = require('express');
const app = express();
app.use(express.json());
app.use('/admin',vidlyRouter);
app.use((req,res,next)=>{
  
  res.status(400).send('<h3>bad request</h3>')
})

app.listen(3000,()=>{

    console.log('server started on port number 3000');
});