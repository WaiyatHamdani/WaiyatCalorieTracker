import React from 'react';
import logo from './logo.svg';
import './App.css';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import Registering from './components/Registering';
import './css/waiyat.css';
import WaiyatNavbar from './components/waiyatNavbar';
import Logins from './components/Logins';
import Home from './components/Home';
import Logout from './components/Logout';
import UActivity from './components/UActivity';
import UFood from './components/UFood';

function App() {
  return (
    <div className="App">
     
      <Router>
      <WaiyatNavbar/>
      <h1>Waiyat Calories Counter</h1>
        <Routes>
          <Route path="/" element={<Logins />} />
          <Route path="/register" element={<Registering />} />
          <Route path="/home" element={<Home />} />
          <Route path="/logout" element={<Logout />} />
          <Route path="/activity" element={<UActivity/>}/>
          <Route path ="/food" element={<UFood/>}/>
        </Routes>
      </Router>
    </div>
  );
}

export default App;
