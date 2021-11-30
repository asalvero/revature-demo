import React from "react";

const Employee = (props) => {
    return <div>
        {/* <h1> Id: 1, Name: Mark, Email: m@gmail.com</h1> */}
        <h1> Id: {props.id}, Name: {props.name}, Email: {props.email}</h1>
    </div>
}

export default Employee;