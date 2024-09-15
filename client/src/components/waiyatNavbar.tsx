import React from 'react'
import { Link } from 'react-router-dom'

function waiyatNavbar() {
  return (
    <div>
        <nav className="navbar">
            <Link to="/home" className="link">
                <span className="icon">🏠</span>
                <span className="text">Home</span>
            </Link>
            <Link to="/activity" className="link">
                <span className="icon">🏋️‍♂️</span>
                <span className="text">sport</span>
            </Link>
            <Link to="/food" className="link">
                <span className="icon">🍕</span>
                <span className="text">food</span>
            </Link>

            <Link to="/logout" className="link">
                <span className="Icon">🚪</span>
                <span className="text">logout</span>
            </Link>
        </nav>
    </div>
  )
}

export default waiyatNavbar
