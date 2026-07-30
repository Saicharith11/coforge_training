function Student(props) {
  return (
    <>
      <h2>Student Profile</h2>

      <br></br>

      <p>Name : {props.name}</p>
      <p>Course : {props.course}</p>
      <p>Age : {props.age}</p>
      <p>City : {props.city}</p>
    </>
  );
}

export default Student;