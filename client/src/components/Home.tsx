import React, { useEffect, useState } from 'react'
import '../css/home.css';
import axios from 'axios';
import User from '../Auth/User';

interface users{
    firstname : String,
    lastname : String,
    username :String,
    password : String,
    age : number,
    gender : string
}

function Home() {
    const [userData, setUserData] = useState<users |null >(null);
    
    useEffect(() => {
        const userUrl = User.loadLocal();

                if (userUrl) {
                    axios.get(userUrl).then((response) => {
                            setUserData(response.data);
                })
                .catch((error) => {
                    console.error('Error fetching user data:', error);
                });
                }else{
                    console.log('bad url');
                }


    }, []);

  return (
    <div className="content">
            <div className="user-info box">
                <h2>Welcome {userData?.firstname}</h2>
                <p>Age: {userData?.age}</p>
                <p>Gender: {userData?.gender}</p>
            </div>
            <div className="activity-levels">
                <div className="activity-box sedentary">
                    <h3>Sedentary</h3>
                    <h4>calories</h4>  
                    <svg viewBox="0 0 200 110" className="speedometer">
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ddd" strokeWidth="15" />
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ff6347" strokeWidth="15" strokeDasharray="60 360" />
                    </svg>
                    <p>1200</p>
                </div>
                <div className="activity-box lightly-active">
                    <h3>Lightly Active</h3>
                    <h4>calories</h4>
                    <svg viewBox="0 0 200 110" className="speedometer">
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ddd" strokeWidth="15" />
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ff6347" strokeWidth="15" strokeDasharray="90 360" />
                    </svg>
                    <p>1440</p>
                </div>
                <div className="activity-box moderately-active">
                    <h3>Moderately Active</h3>
                    <h4>calories</h4>
                    <svg viewBox="0 0 200 110" className="speedometer">
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ddd" strokeWidth="15" />
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ff6347" strokeWidth="15" strokeDasharray="120 360" />
                    </svg>
                    <p>1800</p>
                </div>
                <div className="activity-box Very-active">
                    <h3>Very active</h3>
                    <h4>calories</h4>
                    
                    <svg viewBox="0 0 200 110" className="speedometer">
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ddd" strokeWidth="15" />
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ff6347" strokeWidth="15" strokeDasharray="160 360" />
                    </svg>
                    <p>2200</p>
                </div>
                <div className="activity-box Extra-active">
                    <h3>Extra active</h3>
                    <h4>calories</h4>
                    
                    <svg viewBox="0 0 200 110" className="speedometer">
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ddd" strokeWidth="15" />
                        <path className="arc" d="M 10 90 A 90 90 0 0 1 190 90" fill="none" stroke="#ff6347" strokeWidth="15" strokeDasharray="180 180" />
                    </svg>
                    <p>2800</p>
                </div>
            </div>
    </div>
  )
}

export default Home
