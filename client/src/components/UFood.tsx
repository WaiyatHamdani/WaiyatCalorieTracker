import axios from 'axios';
import { useEffect, useState } from 'react';
import { Base_fetch_food } from '../Auth/base';

function UFood() {
    const [foodcalories, setFoodCalories] = useState<Record<string, number>>({}); //this one store hashmap from java json string and number 
    const [searchTerm, setSearchTerm] = useState('');

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

    const filteredFoods = Object.entries(foodcalories).filter(function([food]) {
      return food.toLowerCase().includes(searchTerm.toLowerCase());
    });
    
  return (
    <div>
          <input
          type="text"
          placeholder="Search food..."
          value={searchTerm}
          onChange={function(e) { setSearchTerm(e.target.value); }}
          style={{ backgroundColor: 'white', color: 'black', padding: '10px', marginBottom: '10px' }} // Add this for now
          />

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
