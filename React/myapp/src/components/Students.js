import React from 'react'
import Student from './Student';

const Students = () => {
    const students = [
        {id: 1, name: 'Mark', age: 10, email: 'm@gmail.com'},
        {id: 1, name: 'Mark', age: 10, email: 'm@gmail.com'},
        {id: 1, name: 'Mark', age: 10, email: 'm@gmail.com'},
        {id: 1, name: 'Mark', age: 10, email: 'm@gmail.com'},
    ];

    return (
        <div>
            <h1>Students</h1>
            <table className="table table-bordered">
                <thead className="thead-dark">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Email</th>
                    </tr>
                    {
                        students.map((student) => <Student data={student}/>)
                    }
                </thead>
            </table>
        </div>
    )
}

export default Students;