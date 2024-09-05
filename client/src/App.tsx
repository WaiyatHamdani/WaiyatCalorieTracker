import React from 'react';
import logo from './logo.svg';
import './App.css';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import Registering from './components/Registering';
import './css/waiyat.css';
import WaiyatNavbar from './components/waiyatNavbar';
import Logins from './components/Logins';

function App() {
  return (
    <div className="App">
     
      <Router>
      <WaiyatNavbar/>
      <h1>Waiyat Calories Counter</h1>
        <Routes>
        <Route path="/" element={<Logins />} />
          <Route path="/register" element={<Registering />} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
