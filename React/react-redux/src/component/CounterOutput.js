import React, { useState } from 'react'
import { useSelector } from 'react-redux';

// const CounterOutput = (props) => {
//     return (
//         <div>
//             <h1>Count: {props.data}</h1>
//         </div>
//     )
// }

const CounterOutput = () => {
    const counter = useSelector(state => state.counter)

    return (
        <div>
            <h1>Count: {counter}</h1>
        </div>
    )
}
export default CounterOutput;