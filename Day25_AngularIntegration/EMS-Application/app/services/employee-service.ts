//import { HttpClient } from '@angular/common/http';
/*
import { Injectable, Service } from '@angular/core';
import { Employee } from '../models/Employee';
import { Observable } from 'rxjs/internal/Observable';

@Injectable()
export class EmployeeService {
    emsUrl = "http://localhost:1111/api/v1/ems";
    response! : string;



    constructor(private httpClient: HttpClient) { 
        
    }

    saveEmployee(employee : Employee) : string{
        this.httpClient.post(this.emsUrl + "/employees",employee).subscribe({
            next:(res)=>{
                console.log(res),
                this.response = res.toString();

            },
            error: (err) =>{
                console.error(err);
                this.response = err.toString();
                alert(err);
            }
        });
        console.log(employee);
        console.log(JSON.stringify(employee));
        return this.response;
    }
/*
        updateEmployee(employee: Employee): Observable<string> {
            return this.httpClient.put(this.emsUrl + "/employees/" + employee.empId, employee, {
                responseType: 'text'
            });
        }
            */

        /*
    deleteEmployee(empId: number): Observable<string> {
        return this.httpClient.delete(this.emsUrl + "/employees/" + empId, {
            responseType: 'text'
        });
    }
        */
    /*
    findEmployee(empId: number): Observable<Employee> {
        return this.httpClient.get<Employee>(this.emsUrl + "/employees/" + empId);
    }

    findAllEmployees(): Observable<Employee[]> {
        return this.httpClient.get<Employee[]>(this.emsUrl + "/employees");
    }
        */
//}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from '../models/Employee';
import { Observable } from 'rxjs';

@Injectable()
export class EmployeeService {

    emsurl: string = "http://localhost:1111/api/v1/ems";
    constructor(private httpClient: HttpClient) {

    }

    saveEmployee(employee: Employee): Observable<string> {
        return this.httpClient.post(this.emsurl + "/employees", employee, {
            responseType: 'text'
        });
    }

    updateEmployee(employee: Employee): Observable<string> {
        return this.httpClient.put(this.emsurl + "/employees/" + employee.empId, employee, {
            responseType: 'text'
        });
    }

    deleteEmployee(empId: number): Observable<string> {
        return this.httpClient.delete(this.emsurl + "/employees/" + empId, {
            responseType: 'text'
        });
    }

    findEmployee(empId : number): Observable<Employee> {
        return this.httpClient.get<Employee>(this.emsurl + "/employees/" + empId);
    }

    findAllEmployees(): Observable<Employee[]> {
        return this.httpClient.get<Employee[]>(this.emsurl + "/employees");
    }


}