import { useState } from "react";

function LoginForm() {
  const [login, setLogin] = useState({
    email: "",
    password: "",
  });

  const [errors, setErrors] = useState({
    email: "",
    password: "",
  });

  const handleChange = (e) => {
    const { name, value } = e.target;

    setLogin({
      ...login,
      [name]: value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    let newErrors = {
      email: "",
      password: "",
    };

    if (login.email === "") {
      newErrors.email = "Email is required";
    }

    if (login.password.length < 6) {
      newErrors.password = "Password must be at least 6 characters";
    }

    setErrors(newErrors);

    if (newErrors.email === "" && newErrors.password === "") {
      alert("Login Successful");
    }
  };

  return (
    <>
      <h1>Login Form</h1>

      <form onSubmit={handleSubmit}>
        <label>Email:</label>
        <input
          type="email"
          name="email"
          value={login.email}
          onChange={handleChange}
        />
        <br />
        <span style={{ color: "red" }}>{errors.email}</span>

        <br />
        <br />

        <label>Password:</label>
        <input
          type="password"
          name="password"
          value={login.password}
          onChange={handleChange}
        />
        <br />
        <span style={{ color: "red" }}>{errors.password}</span>

        <br />
        <br />

        <button type="submit">Login</button>
      </form>
    </>
  );
}

export default LoginForm;