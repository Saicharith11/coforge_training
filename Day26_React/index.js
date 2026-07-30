import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root')); //searches this HTML page and finds the <div id="root"></div>. React then creates a React root inside this div."
root.render(
  <React.StrictMode>
    <App college = "VNR VJIET" n = "11"/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
// starts from here starting point 

//This tells React to display the App component inside the root div line 10