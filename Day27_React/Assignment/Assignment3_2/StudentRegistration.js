import { useState } from "react";

function StudentRegistration() {
  const [student, setStudent] = useState({
    name: "",
    age: "",
    gender: "",
    course: "",
    city: "",
  });

  const [submittedData, setSubmittedData] = useState(null);

  const handleChange = (e) => {
    const { name, value } = e.target;

    setStudent({
      ...student,
      [name]: value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    setSubmittedData(student);
  };

  return (
    <>
      <h1>Student Registration Form</h1>

      <form onSubmit={handleSubmit}>
        <label>Name: </label>
        <input
          type="text"
          name="name"
          value={student.name}
          onChange={handleChange}
        />
        <br />
        <br />

        <label>Age: </label>
        <input
          type="number"
          name="age"
          value={student.age}
          onChange={handleChange}
        />
        <br />
        <br />

        <label>Gender: </label>

        <input
          type="radio"
          name="gender"
          value="Male"
          checked={student.gender === "Male"}
          onChange={handleChange}
        />
        Male

        <input
          type="radio"
          name="gender"
          value="Female"
          checked={student.gender === "Female"}
          onChange={handleChange}
        />
        Female

        <br />
        <br />

        <label>Course: </label>
        <select
          name="course"
          value={student.course}
          onChange={handleChange}
        >
          <option value="">Select Course</option>
          <option value="B.Tech">B.Tech</option>
          <option value="B.Sc">B.Sc</option>
          <option value="MCA">MCA</option>
          <option value="MBA">MBA</option>
        </select>

        <br />
        <br />

        <label>City: </label>
        <input
          type="text"
          name="city"
          value={student.city}
          onChange={handleChange}
        />

        <br />
        <br />

        <button type="submit">Submit</button>
      </form>

      {submittedData && (
        <>
          <h2>Student Details</h2>

          <p>Name: {submittedData.name}</p>
          <p>Age: {submittedData.age}</p>
          <p>Gender: {submittedData.gender}</p>
          <p>Course: {submittedData.course}</p>
          <p>City: {submittedData.city}</p>
        </>
      )}
    </>
  );
}

export default StudentRegistration;