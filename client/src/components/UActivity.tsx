import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Base_activity_minute } from '../Auth/base';
import '../css/activity.css';

function UActivity() {
    // Store activity calories data
    const [activitycalories, setActivitycalories] = useState<Record<string, number>>({}); 

    // Store minutes for each activity row
    const [minutes, setMinutes] = useState<{ [key: string]: number | null }>({});
    
    // Store total calories for each activity row
    const [totalCalories, setTotalCalories] = useState<{ [key: string]: number }>({});

    useEffect(() => {
        async function fetchActivity() {
            try {
                const response = await axios.get(Base_activity_minute);
                setActivitycalories(response.data);
            } catch (error) {
                console.error(error);
            }
        }

        fetchActivity();
    }, []);

    function handleMinuteChange(activity: string, value: string){
        setMinutes((prevMinutes) => ({
            ...prevMinutes,
            [activity]: value ? parseInt(value) : null
        }));
    }

    // Handle calculate button click
    const calculate = (activity: string) => {
        const selectedMinutes = minutes[activity] || 0;
        const caloriesPerMinute = activitycalories[activity];
        const total = selectedMinutes * caloriesPerMinute;
        setTotalCalories((prevTotals) => ({
            ...prevTotals,
            [activity]: total
        }));
    };

    return (
        <div>
            <table>
                <thead>
                    <tr>
                        <th>Activity</th>
                        <th>Calories/minute</th>
                        <th>Minutes</th>
                        <th>Calculate</th>
                        <th>Total Calories</th>
                    </tr>
                </thead>
                <tbody>
                    {Object.entries(activitycalories).map(([activity, calories], index) => (
                        <tr key={index}>
                            <td>{activity}</td>
                            <td>{calories.toFixed(2)} cal</td>
                            <td>
                                <select
                                    className="minutes"
                                    value={minutes[activity] || ''}
                                    onChange={(e) => handleMinuteChange(activity, e.target.value)}
                                >
                                    <option value="">--Select Minute--</option>
                                    <option value="10">10 minutes</option>
                                    <option value="20">20 minutes</option>
                                    <option value="30">30 minutes</option>
                                    <option value="40">40 minutes</option>
                                    <option value="50">50 minutes</option>
                                    <option value="60">60 minutes</option>
                                    <option value="70">70 minutes</option>
                                    <option value="80">80 minutes</option>
                                </select>
                            </td>
                            <td>
                                <button onClick={() => calculate(activity)}>Calculate</button>
                            </td>
                            <td>
                                
                                {totalCalories[activity] ? `${totalCalories[activity].toFixed(2)} cal` : '--'}
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default UActivity;
