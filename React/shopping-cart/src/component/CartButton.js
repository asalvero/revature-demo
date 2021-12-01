import React from 'react'
import { useDispatch } from 'react-redux'

const CartButton = () => {
    const dispatch = useDispatch();

    const addHandler = () => {
        dispatch({type: 'add'})
    }

    const removeHandler = () => {
        dispatch({type: 'remove'})
    }

    return(
        <div>
            <button onClick={addHandler} className="btn btn-primary">Add</button>
            <button onClick={removeHandler} className="btn btn-danger">Remove</button>
        </div>
    )
}
export default CartButton;