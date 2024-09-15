import React, { FormEvent, useState } from 'react';
import '../css/registration.css';
import { Link } from 'react-router-dom';
import axios from 'axios';
import base from '../base';

interface Users {
    firstname: string,
    lastname: string,
    username: string,
    password: string,
    age: number,
    gender: string,
    weight: number,
    height: number
}

function Registering() {
    const [firstname, setFirstName] = useState('');
    const [lastname, setLastName] = useState('');
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [age, setAge] = useState('');
    const [gender, setGender] = useState('');
    const [weight, setWeight] = useState('');
    const [height, setHeight] = useState('');

    async function handleSubmit(event: FormEvent<HTMLFormElement>) {
        event.preventDefault(); // Prevent the default form submission behavior
        try {
            const requestBody = {
                firstname,
                lastname,
                username,
                password,
                age: parseInt(age), // Convert age to number
                gender,
                weight: parseFloat(weight), // Convert weight to number
                height: parseFloat(height) // Convert height to number
            };

            const response = await axios.post(`${base.BASE_URL}/users`, requestBody, {
                headers: {
                    'Content-Type': 'application/json',
                    'Accept': 'application/json'
                },
            });

            console.log(`${base.BASE_URL}/users`);
            console.log(response.data);

            if (response.status !== 200 && response.status !== 201) {
                throw new Error('Registration failed');
            } else {
                console.log("Registration successful");
                alert(`Successfully registered ${firstname}`);
            }

        } catch (error) {
            console.error("handleSubmit error: ", error);
        }
    }

    return (
        <div className="container">
            <h2>Create an Account</h2>
            <h3>Fill accurately as much as possible</h3>
            <form onSubmit={handleSubmit}>
                <label>First Name:</label>
                <input type="text" className="firstname"
                    value={firstname}
                    onChange={(e) => setFirstName(e.target.value)}
                    placeholder="Enter your first name" required />

                <label htmlFor="lastname">Last Name:</label>
                <input type="text"
                    className="lastname"
                    value={lastname}
                    onChange={(e) => setLastName(e.target.value)}
                    placeholder="Enter your last name" required />

                <label htmlFor="username">Username:</label>
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
                    value={age}
                    onChange={(e) => setAge(e.target.value)}
                    placeholder="Enter your age" required />

                <label htmlFor="gender">Biological Gender:</label>
                <select className="gender" value={gender} onChange={(e) => setGender(e.target.value)} required>
                    <option value="" disabled>Select your gender</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                </select>

                <label htmlFor="weight">Weight:</label>
                <input type="text" className="weight"
                    value={weight}
                    onChange={(e) => setWeight(e.target.value)}
                    placeholder="Weight in pounds" required />

                <label htmlFor="height">Height:</label>
                <input type="text" className="height"
                    value={height}
                    onChange={(e) => setHeight(e.target.value)}
                    placeholder="Height in inches" required />

                <button type="submit">Submit</button>

                <p>Already have an account? <Link to="/">Login here</Link>.</p>
            </form>
        </div>
    );
}

export default Registering;
