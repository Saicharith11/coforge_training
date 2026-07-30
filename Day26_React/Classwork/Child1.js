import './App.css';

function Child1({location = "Pune" , country = "UAE"}) { // Destructuring
  return (
    <>
      <h1>Child</h1>
      <b>Welcome Child1</b>
      <p>location : {location}</p>
      <p>Country is  : {country}</p>
    </>
  );
}
export default Child1;
  
/*
// if props then it is props.location , country , if no default an dno valuye is opassed then it gives blank
function Child1(props) { // Destructuring
  return (
    <>
      <h1>Child</h1>
      <b>Welcome Child1</b> 
    </>
  );
}
*/
//
    //  <p>location : {props.location}</p>
      //<p>Country is  : {props.country}</p>


/*
function Employee(props) {
  return (
    <>
      <h2>Employee Details</h2>
      <p>ID: {props.id}</p>
      <p>Name: {props.name}</p>
      <p>Salary: {props.salary}</p>
    </>
  );
}

export default Employee;
*/