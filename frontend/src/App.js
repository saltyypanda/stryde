import './App.css';
import React from "react";
import {
    BrowserRouter as Router,
    Routes,
    Route,
} from "react-router-dom";

import Home from './pages/Home';
import Login from './pages/Login';
import Profile from './pages/Profile';
import Workouts from "./pages/Workouts";
import Routines from './pages/Routines';
import Navbar from './components/Navbar';
import Exercises from './pages/Exercises';
 
function App() {
    return (
        <div className='background'>
            <Navbar/>
            <Router>
                <div className='w-75 mx-auto'>
                    <Routes>
                        <Route exact path="/" element={<Home />} />
                        <Route exact path="/login" element={<Login />} />
                        <Route exact path="/profile" element={<Profile />} />
                        <Route exact path="/workouts" element={<Workouts />} />
                        <Route exact path="/routines" element={<Routines />} />
                        <Route exact path="/exercises" element={<Exercises />} />
                    </Routes>
                </div>
            </Router>
        </div>
    );
}
 
export default App;