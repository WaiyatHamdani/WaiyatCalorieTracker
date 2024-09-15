import React, { useEffect } from 'react'
import User from '../Auth/User';
import { Base_url } from '../Auth/base';

function Logout() {
    useEffect(()=>{
        User.clearLocal();
        window.location.href = Base_url;
    });
  return (
    <div>
      <h1>loging you out</h1>
    </div>
  )
}

export default Logout
