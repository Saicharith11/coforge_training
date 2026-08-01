import { useState } from "react";

function Livename() {
  // State to store the name
  const [name, setName] = useState("");

  // Update state whenever user types
  const handleChange = (event) => {
    setName(event.target.value);
  };

  return (
    <>
      <h1>Live Name Preview</h1>

      <input
        type="text"
        placeholder="Enter your name"
        value={name}
        onChange={handleChange}
      />

      <h2>Welcome, {name || "Guest"}</h2>
    </>
  );
}

export default Livename;