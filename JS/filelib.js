const fs = require('fs');

/*
fs.readFile('Text.txt',(err,data) => {
    if(err===null){
    console.log(data.toString());npm 
}else{
    console.log(err.message);
}
});
*/

let  d=" ";
let count=0;

let interval=setInterval(() => {

    
    d=fs.readFileSync("Text.txt");

    fs.writeFile('Text.txt',d.toString()+count,(err) => {
        if(err===null){
            console.log("successfully written");
        }else{
            console.log(err.message);
        }
    })

    count++;

    if(count===5){
        clearInterval(interval);
    }
}, 200);