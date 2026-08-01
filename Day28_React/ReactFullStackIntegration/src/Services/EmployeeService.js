import axios from 'axios';
import {component} from "react";

class EmployeeService {
    constructor() {
        this.BASE_URL = "http://localhost:1111/api/v1/ems";

    }

    saveEmployee(employee) {
        return axios.post(this.BASE_URL + "/employees" , employee)
    }
}

export default EmployeeService;