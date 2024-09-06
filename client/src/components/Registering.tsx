import React, { FormEvent, useState } from 'react'
import '../css/registration.css';
import { Link } from 'react-router-dom';
import { request } from 'http';
import base from '../base';
import axios from 'axios';

function Registering() {
    const [firstName, setFirstName] = useState('');
    const [lastName, setLastName] = useState('');
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [age, setAge] = useState('');
    const [gender, setGender] = useState('');


    async function handleSubmit(event: FormEvent<HTMLFormElement>) {
        try{
                const requestBody = {
                    firstName,
                    lastName,
                    username,
                    password,
                    age,
                    gender
                };

                const response = await axios.post(`${base.BASE_URL}/users`,requestBody,{
                    headers: {
                        'Content-Type': 'application/json',
                    },
                });

                if (response.status !== 200) {
                throw new Error('Registration failed');
                }

        }catch(error){
            console.error("handle submit error: ",error);
        }
                    
    }



  return (
    
    <div className="container">
    <h2>Create an Account</h2>

    <form onSubmit={handleSubmit}>

            <label>First Name:</label>
            <input type="text" className="firstname"
                value={firstName} 
                onChange={(e) => setFirstName(e.target.value)} 
                placeholder="Enter your first name" required />



            <label htmlFor="lastname">Last Name:</label>
            <input type="text" 
                className="lastname" 
                value={lastName}
                onChange={(e) => setLastName(e.target.value)} 
                placeholder="Enter your last name" required />


            <label htmlFor="username">username:</label>
            <input type="text" 
                className="username"  
                value={username}
                onChange={(e) => setUsername(e.target.value)} 
                placeholder="Enter your email" required />


            <label htmlFor="password">Password:</label>
            <input type="password" 
                className="password" 
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                placeholder="Enter your password" required />


            <label htmlFor="age">Age:</label>
            <input type="text" className="age"
                value ={age}
                onChange={(e) => setAge(e.target.value)}
                placeholder="Enter your age" required />

            <label htmlFor="gender">Gender:</label>
            <input type="text" className="gender" 
                value={gender}
                onChange={(e) => setGender(e.target.value)}
                placeholder="Enter your gender" required />

            <button type="submit">Submit</button>
   
            <p>Already have an account? <Link to="/">Login here</Link>.</p>
    </form>
      
  </div>

  )
}

export default Registering