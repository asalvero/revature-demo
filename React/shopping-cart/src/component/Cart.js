import React from 'react'
import CartButton from './CartButton'
import CartOutput from './CartOutput'

const Cart = () => {
    return(
        <div className="container text-center">
            <CartOutput />
            <CartButton />
        </div>
    )
}
export default Cart;