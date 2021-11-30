//not using default parameters
function say(message){
    message =  typeof message !== undefined ? message: 'Hi';
    console.log(message)
}

say()
say('Hello')

//using default parameters
function say2(message = 'Hi'){
    console.log(message)
}

say()
