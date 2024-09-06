import axios from 'axios';
import React, { FormEvent, useState } from 'react'
import { Link, useNavigate } from 'react-router-dom'
import base from '../base';

function Logins() {
    const[username, setUsername] = useState('');
    const[password, setPassword] = useState('');
    const navigate = useNavigate();

    async function handleSubmit(event: FormEvent<HTMLFormElement>): Promise<void> {
        event.preventDefault();
        const requestbody ={
            username,
            password
        };
        try{
                const response = await axios.post(`${base.BASE_URL}/users/login`,requestbody,{
                        headers:{
                            'Content-Type': 'application/json'
                        }
                });

                if (response.status !== 200 && response.status !== 201) {
                    throw new Error('login failed');
                } else {
                    console.log("login successful");
                    navigate('/home');
                }
        }catch(error){
            console.error('Login failed. Please try again.');
        }
    }

  return (
    <div className="container">
        <form onSubmit={handleSubmit}>
                    <label htmlFor="username">Username:</label>
                    <input type="text" className="username"
                        value={username}
                        onChange={(e)=> setUsername(e.target.value)} 
                        placeholder="Enter your username" required />

                    <label htmlFor="password">Password:</label>
                    <input type="password" className="password" 
                        value={password}
                        onChange={(e)=>setPassword(e.target.value)}
                        placeholder="Enter your password" required />

                    <button type="submit">Login</button>
    
                    <p>Don't have an account? <Link to="/register">register</Link>.</p>
        </form>
    
</div>
  )
}

export default Logins
