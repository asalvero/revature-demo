import React, { useState } from 'react'

const DemoTwo = () => {
    const [firstNumber, setFirstNumber] = useState()
    const [secondNumber, setSecondNumber] = useState()
    const [result, setResult] = useState();

    function onFirstChangeHandler(event){
        setFirstNumber(event.target.value)
    }

    function onSecondChangeHandler(event){
        setSecondNumber(event.target.value)
    }

    function onClickHandlerAdd(){
        let sum = Number(firstNumber) + Number(secondNumber);
        setResult(sum)
    }

    function onClickHandlerSubtract(){
        let sum = Number(firstNumber) - Number(secondNumber);
        setResult(sum)
    }

    function onClickHandlerMultiply(){
        let sum = Number(firstNumber) * Number(secondNumber);
        setResult(sum)
    }

    function onClickHandlerDivide(){
        let sum = Number(firstNumber) / Number(secondNumber);
        setResult(sum)
    }

    return(
        <div>
            <h1>Add Two Number</h1>
            <input type="text" value={firstNumber} onChange={onFirstChangeHandler}/>
            <input type="text" value={secondNumber} onChange={onSecondChangeHandler}/>
            {/* <h1>{firstNumber} + {secondNumber} = {result}</h1> */}
            <br/>
            <button onClick={onClickHandlerAdd}>Add</button>
            <button onClick={onClickHandlerSubtract}>Subtract</button>
            <button onClick={onClickHandlerMultiply}>Multiply</button>
            <button onClick={onClickHandlerDivide}>Divide</button>
            <h1>Result: {result}</h1>
        </div>
    )
}
export default DemoTwo;