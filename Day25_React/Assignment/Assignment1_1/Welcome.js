function Welcome() {
  const today = new Date().toLocaleDateString();

  return (
    <>
      <h1>Welcome to React</h1>

      <h2>Sai Charith</h2>

      <h3>Today's Date: {today}</h3>
    </>
  );
}

export default Welcome;