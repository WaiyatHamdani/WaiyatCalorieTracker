import React from 'react'
import '../css/registration.css';
import { Link } from 'react-router-dom';

function Registering() {
  return (

    <div className="container">
    <h2>Create an Account</h2>
      <label htmlFor="firstname">First Name:</label>
      <input type="text" id="firstname" name="firstname" placeholder="Enter your first name" required />

      <label htmlFor="lastname">Last Name:</label>
      <input type="text" id="lastname" name="lastname" placeholder="Enter your last name" required />

      <label htmlFor="email">Email:</label>
      <input type="text" id="email" name="username" placeholder="Enter your email" required />

      <label htmlFor="password">Password:</label>
      <input type="password" id="password" name="password" placeholder="Enter your password" required />

      <label htmlFor="age">Age:</label>
      <input type="text" id="age" name="age" placeholder="Enter your age" required />

      <label htmlFor="gender">Gender:</label>
      <input type="text" id="gender" name="gender" placeholder="Enter your gender" required />

      <button type="submit">Submit</button>
   
      <p>Already have an account? <Link to="/">Login here</Link>.</p>
  </div>

  )
}

export default Registering