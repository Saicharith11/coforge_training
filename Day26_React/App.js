import './App.css'; // To apply styles to this component
import Welcome from './Assignment1_1/Welcome';
import Counter1 from './Assignment1_2/Counter1';
import Livename from './Assignment2_2/Livename';
import StudentRegistration from './Assignment3_2/StudentRegistration';
import LoginForm from './Assignment4_2/LoginForm';
import Calculator from './Calculator';
import CalculatorFunction from './CalculatorFunction';
import Child1 from './Child1'; // To use the Child1 component
import Child2 from './Child2'; // To use the Child2 component
import Counter from './Counter';
import EmployeeComponent from './EmployeeComponent';
import Student from './Assignment2_1/Student';
import Employee from './Assignment3_1/Employee';
import OddComponent from './OddComponent';
import EvenComponent from './EvenComponent';
import Home from './Home';
import Contanct from './Contanct';
import About from './About';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Navbar from './NavBar';
import Product from './Assignment4_1/Product';


function App(props) {
  // return (
  //   <>
  //     <Product
  //       productName="Laptop"
  //       price={60000}
  //       brand="Dell"
  //       rating={4.5}
  //       stockStatus="In Stock"
  //     />

  //     <Product
  //       productName="Mobile"
  //       price={25000}
  //       brand="Samsung"
  //       rating={4.3}
  //       stockStatus="Out of Stock"
  //     />

  //     <Product
  //       productName="Headphones"
  //       price={3000}
  //       brand="Boat"
  //       rating={4.2}
  //       stockStatus="In Stock"
  //     />
  //   </>
  // );
}

  // return (
  //   <BrowserRouter>
  //     <Navbar />

  //     <Routes>
  //       <Route path="/" element={<Home />} />
  //       <Route path="/about" element={<About />} />
  //       <Route path="/contanct" element={<Contanct />} />
  //     </Routes>
  //   </BrowserRouter>
  // );
  // let n = props.n;
  // return (
  //   <>
  //   {n % 2 === 0 ? <EvenComponent n = {n}></EvenComponent> : <OddComponent n = {n}></OddComponent>}
  //   </>

  // );
  // return (
  //   <>
  //   {n % 2 === 0 && <EvenComponent n = {n}></EvenComponent>}
  //   {n % 2 !== 0 && <OddComponent n = {n}></OddComponent>}
    
    
  //   </>

  // );
  // if (n % 2 === 0)
  //   return <EvenComponent n = {n}></EvenComponent>
  // else
  //   return <OddComponent n = {n}></OddComponent>
  // return (
  //   <>
  //     {/* <h1>Welcome to React</h1>
  //     <b>Welcome Charith</b>
    
  //     <br></br>
  //     <Child1 location = "Hyderabad"></Child1>
  //     <br></br>
  //     <Child2></Child2>
  //     <br></br>
  //     <h1>College is : {props.college}</h1>
  //     <br></br>
  //     <h1>States </h1>
  //     <EmployeeComponent org = "coforge"></EmployeeComponent>
  //     <br></br>
  //     <Counter></Counter>
  //     <br></br>
  //     <CalculatorFunction></CalculatorFunction>
  //     <br>
  //     </br> day 2 class and day 1 class */}
  //     {/* <h1>Assignment 1</h1>
  //     <Counter1></Counter1>
  //     <h1>Assignment 2</h1>
  //     <Livename></Livename>
  //     <h1>Assignment 3</h1>
  //     <StudentRegistration></StudentRegistration>
  //     <h1>Assignment 4</h1>
  //     <LoginForm></LoginForm> assignment day 2*/} 

  //     {/* <h1>Assignment 1</h1>
  //     <Welcome></Welcome>
  //     <h1>Assignment 1</h1>
  //     <Welcome></Welcome> */}
      
  //   </>
  // );
export default App;


//root componwnt

/*
function App() {
  return (
    <h1>Welcome</h1>
    <p>Hello React</p>
  );
} // this causes error because react can only return one element.
  

Without Fragment

You can wrap them inside a <div>:

function App() {
  return (
    <div>
      <h1>Welcome</h1>
      <p>Hello React</p>
    </div>
  );
}

With Fragment (Short Syntax)
function App() {
  return (
    <>
      <h1>Welcome</h1>
      <p>Hello React</p>
    </>
  );
}
  With React.Fragment

Instead of <> </>, you can also write:

import React from "react";

function App() {
  return (
    <React.Fragment>
      <h1>Welcome</h1>
      <p>Hello React</p>
    </React.Fragment>
  );
}
  When should you use Fragments?

Use Fragments when:

You need to return multiple JSX elements.
You don't want unnecessary <div> tags in the HTML.
You want cleaner and more efficient DOM structure.
*/




//<> binds everything at returnbs
// if props value is missing no error , default  is blank









//starting point
//functional and class components in react
//in angular only class components are used but in react both functional and class components are used
