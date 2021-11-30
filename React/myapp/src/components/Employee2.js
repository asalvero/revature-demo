import React, {useState} from 'react'

const Employee2 = () => {
    const [employee, setEmployee] = useState({id:1, name:'Mark', email:'m@gmail.com'})
    return (
        <div>
            <h1>Employee ID: {employee.id}</h1>
            <h1>Employee Name: {employee.name}</h1>
            <h1>Employee Email: {employee.email}</h1>
        </div>
    )
}
export default Employee2;