import { createStore } from "redux";

//initial state
const initialState = {
    product: ''
}

//reducer function
const cartReducer = (state = initialState, action) => {
    if(action.type === 'add'){
        return{
            product: ''
        }
    }

    if(action.type === 'remove'){
        return{
            product: ''
        }
    }
    return state;
}

const store = createStore(cartReducer)

export default store;