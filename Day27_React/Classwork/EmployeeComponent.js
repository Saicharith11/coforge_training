import { Component } from "react";

class EmployeeComponent extends Component {
    constructor(props){
        super(props);
        this.state = {
            eid : 101,
            ename : "Sai",
            esal : 100000

            }
    }
    render() {
        return (
            <>
                <h1> React Props and States</h1>
                <p>Organization is : {this.props.org}</p>
                <h1>Using Constructor</h1>
                <p>Employee Id is : {this.state.eid}</p>
                <p>Employee Name is : {this.state.ename}</p>
                <p>Employee Salary is : {this.state.esal}</p>
            
            
            
            </>

            
        );
    }

}

export default EmployeeComponent;

// dAY 2

