import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Base_fetch_food } from '../Auth/base';

function UFood() {
    const [foodcalories, setFoodCalories] = useState<Record<string, number>>({}); //this one store hashmap from java json string and number 

    useEffect(() => {
          async function fetchfood(){
            try{
              const response = await axios.get(Base_fetch_food);
              setFoodCalories(response.data);

            }catch(error){
              console.error(error);
            }
          }

      fetchfood();
    }, []);
    
  return (
    <div>
              <table>
                      <thead>
                            <th>food</th>
                            <th>calories/serving</th>
                      </thead>

                      <tbody>

                      {Object.entries(foodcalories).map(([food, calories], index) => (
                            <tr key={index}>
                                <td>{food}</td>
                                <td>{calories} cal</td>
                            </tr>
                      ))}

                      </tbody>
              </table>
    </div>
  )
}

export default UFood
