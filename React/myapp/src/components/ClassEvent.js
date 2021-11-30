import React, { Component } from 'react';

class ClassEvent extends Component {

    constructor() {
        super()
        this.state = {
            name: 'Guest'
        }
        // this.onClickHandler = this.onClickHandler.bind(this)
    }

    // onClickHandler(){
    //     console.log('clicked')
    //     // this.setState({
    //     //     name: 'Mark'
    //     // })
    // }

    onClickHandler = () =>{
        console.log(this)
        this.setState({
            name: 'Mark'
        })
    }

    render() {
        return (
            <div>
                <h1>{this.state.name}</h1>
                {/* <button onClick={this.onClickHandler.bind(this)}>Button</button> */}
                {/* <button onClick={ this.onClickHandler}>Button</button> */}
                {/* <button onClick = {() => this.onClickHandler()}>Button</button> */}
                <button onClick={ this.onClickHandler }>Button</button>
            </div>
        )
    }
}
export default ClassEvent;