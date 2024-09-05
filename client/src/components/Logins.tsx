import React from 'react'
import { Link } from 'react-router-dom'

function Logins() {
  return (
    <div className="container">
    <label htmlFor="username">Username:</label>
    <input type="text" id="username" name="username" placeholder="Enter your username" required />

    <label htmlFor="password">Password:</label>
    <input type="password" id="password" name="password" placeholder="Enter your password" required />

    <button type="submit">Login</button>
    
    <p>Don't have an account? <Link to="/register">register</Link>.</p>
</div>
  )
}

export default Logins
