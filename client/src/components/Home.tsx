import React, { useEffect, useState } from 'react';
import '../css/home.css'; // Ensure you have proper CSS for layout
import axios from 'axios';
import User from '../Auth/User';

// User interface definition
interface users {
    firstname: string,
    lastname: string,
    username: string,
    password: string,
    age: number,
    gender: string,
    weight: number,
    height: number
}

function Home() {
    const [userData, setUserData] = useState<users | null>(null);
    const [incalories, setInCalories] = useState<number | null>(null);

    useEffect(() => {
        async function fetchCurrentUser() {
            try {
                const userUrl = User.loadLocal();
                if (userUrl) {
                    const response = await axios.get(userUrl);
                    console.log(response.data);
                    setUserData(response.data);
                }
            } catch (error) {
                console.error('Error fetching user data:', error);
            }
        }
    
        if (!userData) { // Fetch user data only if it is not already set
            fetchCurrentUser();
        }
    }, [userData]); // Only runs when userData changes or is initially null
    
    useEffect(() => {
        async function fetchCaloriestype() {
            if (userData && !incalories) {
                try {
                    const requestBody = {
                        weight: userData.weight,
                        age: userData.age,
                        height: userData.height,
                    };
                    const response = await axios.post(`http://localhost:8080/calories/${userData.gender}`, requestBody);
                    setInCalories(response.data);
                    console.log('Calories type data:', response.data);
                } catch (error) {
                    console.error('Error fetching calories type:', error);
                }
            }
        }
    
        if (userData && !incalories) { // Only fetch calorie data if userData exists and incalories is not set
            fetchCaloriestype();
        }
    }, [userData, incalories]); // Only runs when userData or incalories changes

    return (
        <div className="content">
            <div className="user-info box">
                <h2>Welcome {userData?.firstname}</h2>
                <p>Age: {userData?.age}</p>
                <p>Gender: {userData?.gender}</p>
                <p>Weight: {userData?.weight}</p>
                <p>height: {userData?.height}</p>
            </div>

            {/* Add BMR Section */}
            <div className="bmr-section">
                <h3>BMR</h3>
                <div className="bmr-value">
                {incalories ? `${incalories} kcal/day` : 'Calculating...'}
                </div>
            </div>

            <div className="activity-levels">
                <div className="activity-box sedentary">
                    <h3>Sedentary</h3>
                    <h4>calories</h4>
                    <svg viewBox="0 0 200 110" className="speedometer">
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ddd" strokeWidth="15" />
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ff6347" strokeWidth="15" strokeDasharray="60 360" />
                    </svg>
                    <p>{incalories ? `${(incalories * 1.2).toFixed(0)} kcal` : 'Calculating...'}</p>
                </div>
                <div className="activity-box lightly-active">
                    <h3>Lightly Active</h3>
                    <h4>calories</h4>
                    <svg viewBox="0 0 200 110" className="speedometer">
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ddd" strokeWidth="15" />
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ff6347" strokeWidth="15" strokeDasharray="90 360" />
                    </svg>
                    <p>{incalories ? `${(incalories * 1.375).toFixed(0)} kcal` : 'Calculating...'}</p>
                </div>
                <div className="activity-box moderately-active">
                    <h3>Moderately Active</h3>
                    <h4>calories</h4>
                    <svg viewBox="0 0 200 110" className="speedometer">
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ddd" strokeWidth="15" />
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ff6347" strokeWidth="15" strokeDasharray="120 360" />
                    </svg>
                    <p>{incalories ? `${(incalories * 1.55).toFixed(0)} kcal` : 'Calculating...'}</p>
                </div>
                <div className="activity-box Very-active">
                    <h3>Very active</h3>
                    <h4>calories</h4>
                    
                    <svg viewBox="0 0 200 110" className="speedometer">
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ddd" strokeWidth="15" />
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ff6347" strokeWidth="15" strokeDasharray="160 360" />
                    </svg>
                    <p>{incalories ? `${(incalories * 1.725).toFixed(0)} kcal` : 'Calculating...'}</p>
                </div>
                <div className="activity-box Extra-active">
                    <h3>Extra active</h3>
                    <h4>calories</h4>
                    
                    <svg viewBox="0 0 200 110" className="speedometer">
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ddd" strokeWidth="15" />
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ff6347" strokeWidth="15" strokeDasharray="180 180" />
                    </svg>
                    <p>{incalories ? `${(incalories * 1.9).toFixed(0)} kcal` : 'Calculating...'}</p>
                </div>
            </div>
        </div>
    );
}

export default Home;
