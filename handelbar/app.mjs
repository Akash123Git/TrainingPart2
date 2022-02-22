import express from "express";
import { engine } from "express-handlebars";

var app = express();
let data={
    name:"aksh",
    place:"bangalore",
    state:"karnataka",
    choice:false,
    place:[{
        firstname:"hello"},
        {
        firstname:"second"},

        {firstname:"third"},
    ],
}

app.engine('handlebars', engine());
app.set('view engine', 'handlebars');
app.set('views','./views')

app.get('/', function (req, res) {
    res.render('home',{data:data,condition:data.choice});
});

app.listen(4000);
