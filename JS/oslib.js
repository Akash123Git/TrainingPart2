const os= require('os');

console.log("free memory :", os.freemem()/10000000);
console.log("Total memory :", os.totalmem()/10000000);
console.log("occupied memory :", ((os.totalmem()-os.freemem())/10000000));
console.log("OS type :", os.type());
console.log("home dir :", os.homedir());
console.log("platform :",os.platform());
console.log("networkm interface :", os.networkInterfaces());
console.log("uptime :",os.uptime());