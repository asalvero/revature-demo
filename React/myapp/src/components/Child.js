import React from "react";

const Child = (props) => {

    // let a = 10;
    console.log(props.name)
    return(
        <div>
            <h1>Child Component</h1>
            {/* <p>4 + 6 = {a}</p> */}
            <h2>{props.name}</h2>
        </div>
    )
}
export default Child;