import { Component } from "react";
import EmployeeService from "../Services/EmployeeService";
import Employee from "../Models/Employee";

class EmployeeHome extends Component {

    constructor() {
        super();
        this.employeeService = new EmployeeService();
        this.state = {
            empId: 0,
            empName: "",
            empSalary: 0,
            deptNo: 0,
            result: "",
            empIdError: "",
            empNameError: "",
            empSalaryError: "",
            deptNoError: ""
        };
    }

    saveEmployeeValidation() {

        // Clear previous errors
        this.setState({
            empIdError: "",
            empNameError: "",
            empSalaryError: "",
            deptNoError: ""
        });

        let valid = true;

        if (this.state.empId === "") {
            this.setState({ empIdError: "Employee ID is required" });
            valid = false;
        } else if (isNaN(this.state.empId) || Number(this.state.empId) <= 0) {
            this.setState({ empIdError: "Employee ID must be a positive number" });
            valid = false;
        }

        if (this.state.empName === "") {
            this.setState({ empNameError: "Employee Name is required" });
            valid = false;
        } else if (!/^[A-Za-z ]+$/.test(this.state.empName)) {
            this.setState({ empNameError: "Employee Name should contain only alphabets" });
            valid = false;
        }

        if (this.state.empSalary === "") {
            this.setState({ empSalaryError: "Employee Salary is required" });
            valid = false;
        } else if (isNaN(this.state.empSalary) || Number(this.state.empSalary) <= 0) {
            this.setState({ empSalaryError: "Employee Salary must be a positive number" });
            valid = false;
        }

        if (this.state.deptNo === "") {
            this.setState({ deptNoError: "Department Number is required" });
            valid = false;
        } else if (isNaN(this.state.deptNo) || Number(this.state.deptNo) <= 0) {
            this.setState({ deptNoError: "Department Number must be a positive number" });
            valid = false;
        }

        return valid;
    }

    saveEmployee = () => {
        if (this.saveEmployeeValidation()) {

            let employee = new Employee(
                this.state.empId,
                this.state.empName,
                this.state.empSalary,
                this.state.deptNo
            );

            this.employeeService.saveEmployee(employee)
                .then(response => {
                    console.log(response.data);
                    this.setState({ result: response.data });
                })
                .catch(error => {
                    console.error(error);
                });
        }
    }

    render() {
        return (
            <>
                <h2>Employee Home</h2>

                <p>
                    Employee ID:
                    <input
                        type="text"
                        value={this.state.empId}
                        onChange={(e) => this.setState({ empId: e.target.value })}
                    />
                </p>
                <p style={{ color: "red" }}>{this.state.empIdError}</p>

                <p>
                    Employee Name:
                    <input
                        type="text"
                        value={this.state.empName}
                        onChange={(e) => this.setState({ empName: e.target.value })}
                    />
                </p>
                <p style={{ color: "red" }}>{this.state.empNameError}</p>

                <p>
                    Employee Salary:
                    <input
                        type="text"
                        value={this.state.empSalary}
                        onChange={(e) => this.setState({ empSalary: e.target.value })}
                    />
                </p>
                <p style={{ color: "red" }}>{this.state.empSalaryError}</p>

                <p>
                    Department No:
                    <input
                        type="text"
                        value={this.state.deptNo}
                        onChange={(e) => this.setState({ deptNo: e.target.value })}
                    />
                </p>
                <p style={{ color: "red" }}>{this.state.deptNoError}</p>

                <button onClick={this.saveEmployee}>Save</button>&nbsp;
                <button>Update</button>&nbsp;
                <button>Delete</button>&nbsp;
                <button>Find</button>&nbsp;
                <button>Find All</button>

                <br /><br />

                <b>{this.state.result}</b>
            </>
        );
    }
}

export default EmployeeHome;