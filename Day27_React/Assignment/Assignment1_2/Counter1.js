import { useState } from "react";

function Counter1() {
  // State variable
  const [count, setCount] = useState(0);

  // Increment function
  const increment = () => {
    setCount(count + 1);
  };

  // Decrement function
  const decrement = () => {
    setCount(count - 1);
  };

  // Reset function
  const reset = () => {
    setCount(0);
  };

  return (
    <>
      <h1>Counter Application</h1>

      <h2>Count: {count}</h2>

      <button onClick={increment}>Increment</button>
      &nbsp;
      <button onClick={decrement}>Decrement</button>
      &nbsp;
      <button onClick={reset}>Reset</button>
    </>
  );
}

export default Counter1;