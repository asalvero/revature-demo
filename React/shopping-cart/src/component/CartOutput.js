import React from 'react'
import { useSelector } from 'react-redux'

const CartOutput = () => { 
    const cart = useSelector(state => state.cart)

    return(
        <div>
            <h1>Shopping Cart</h1>
            <p>{cart}</p>
        </div>
    )
}
export default CartOutput;