import React from "react";
import Child from "./Child";

const Parent = () => {
    return (
        <div>
            <h1>Parent Component</h1>
            <Child name="Mark" />
        </div>
    )
}
export default Parent;