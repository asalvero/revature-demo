import React, { useState } from 'react'
import { useDispatch } from 'react-redux';

const CounterButton = (props) => {

    const dispatch = useDispatch();

    const incrementHandler = () => {
        dispatch({type: 'increment'})
    }

    const decrementHandler = () => {
        dispatch({type: 'decrement'})
    }

    return (
        <div>
            {/* <button onClick={props.incrementHandler} className="btn btn-primary">Increment</button>
            <button onClick={props.decrementHandler} className="btn btn-danger">Decrement</button> */}
            <button onClick={incrementHandler} className="btn btn-primary">Increment</button>
            <button onClick={decrementHandler} className="btn btn-danger">Decrement</button>
        </div>
    )
}
export default CounterButton;