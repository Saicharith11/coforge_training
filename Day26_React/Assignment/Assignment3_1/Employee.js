function Employee(props) {
  return (
    <div className="card" style={{ width: "20rem" }}>
      <div className="card-header">
        Employee Details
      </div>

      <div className="card-body">
        <p>Employee ID : {props.empId}</p>
        <p>Employee Name : {props.empName}</p>
        <p>Department : {props.department}</p>
        <p>Designation : {props.designation}</p>
        <p>Salary : {props.salary}</p>
      </div>
    </div>
  );
}

export default Employee;