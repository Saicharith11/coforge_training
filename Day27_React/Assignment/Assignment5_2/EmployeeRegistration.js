import { Component } from "react";

class EmployeeRegistration extends Component {

    constructor() {
        super();

        this.state = {
            empId: "",
            empName: "",
            deptNo: "",
            salary: "",

            empIdError: "",
            empNameError: "",
            deptNoError: "",
            salaryError: "",

            submitted: false
        };
    }

    validate = () => {

        let valid = true;

        this.setState({
            empIdError: "",
            empNameError: "",
            deptNoError: "",
            salaryError: ""
        });

        if (this.state.empId === "") {
            this.setState({ empIdError: "Employee Id is required" });
            valid = false;
        }

        if (this.state.empName === "") {
            this.setState({ empNameError: "Employee Name is required" });
            valid = false;
        }

        if (this.state.deptNo === "") {
            this.setState({ deptNoError: "Department No is required" });
            valid = false;
        }

        if (this.state.salary === "") {
            this.setState({ salaryError: "Salary is required" });
            valid = false;
        }

        return valid;
    }

    submitEmployee = () => {

        if (this.validate()) {
            this.setState({
                submitted: true
            });
        }

    }

    render() {

        return (
            <>

                <h2>Employee Registration</h2>

                <p>
                    Employee Id :
                    <input
                        type="text"
                        value={this.state.empId}
                        onChange={(e) => this.setState({ empId: e.target.value })}
                    />
                </p>

                <p style={{ color: "red" }}>{this.state.empIdError}</p>

                <p>
                    Employee Name :
                    <input
                        type="text"
                        value={this.state.empName}
                        onChange={(e) => this.setState({ empName: e.target.value })}
                    />
                </p>

                <p style={{ color: "red" }}>{this.state.empNameError}</p>

                <p>
                    Department No :
                    <input
                        type="text"
                        value={this.state.deptNo}
                        onChange={(e) => this.setState({ deptNo: e.target.value })}
                    />
                </p>

                <p style={{ color: "red" }}>{this.state.deptNoError}</p>

                <p>
                    Salary :
                    <input
                        type="text"
                        value={this.state.salary}
                        onChange={(e) => this.setState({ salary: e.target.value })}
                    />
                </p>

                <p style={{ color: "red" }}>{this.state.salaryError}</p>

                <button onClick={this.submitEmployee}>
                    Submit
                </button>

                <br /><br />

                {
                    this.state.submitted &&
                    <>
                        <h3>Employee Details</h3>

                        <p>Employee Id : {this.state.empId}</p>
                        <p>Employee Name : {this.state.empName}</p>
                        <p>Department No : {this.state.deptNo}</p>
                        <p>Salary : {this.state.salary}</p>
                    </>
                }

            </>
        );
    }
}

export default EmployeeRegistration;