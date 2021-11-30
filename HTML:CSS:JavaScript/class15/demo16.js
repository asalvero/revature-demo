// declaration of class
class Employee{
    //class properties - not needed to initialize
    firstName;
    lastName;

    //constrcutor used for initializing 
    constructor(firstName, lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //declare method
    getFullName(){
        console.log(`${this.firstName} ${this.lastName}`)
    }
}

var emp1 = new Employee('Mark', 'Smith')
emp1.getFullName();