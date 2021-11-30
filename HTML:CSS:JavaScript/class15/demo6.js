var a = 100;
console.log(a)
{
    let a = 200;
    console.log(a)
}
console.log(a)

function doSomthing(){
    for(var i=0; i<5; i++){
        console.log(i);
    }
    console.log('outside: '+ i);
}

doSomthing();