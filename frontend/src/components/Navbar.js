function Navbar() {
    return (
        <div className="navbar bg-base-100 h-2 fixed">
            <div className="flex-1">
                <a href="http://localhost:3000/" className="btn btn-ghost text-xl">Stryde</a>
            </div>
            <div className="flex-none gap-2">
                <div className="flex-row gap-5 form-control">
                    <a href="http://localhost:3000/routines"><button class="btn btn-outline btn-primary w-36">Routines</button></a>
                    <a href="http://localhost:3000/workouts"><button class="btn btn-outline btn-secondary w-36">Workouts</button></a>
                    <a href="http://localhost:3000/exercises"><button class="btn btn-outline btn-accent w-36">Exercises</button></a>
                </div>
                <div className="dropdown dropdown-end">
                <div tabIndex={0} role="button" className="btn btn-ghost btn-circle avatar mx-4">
                    <div className="w-10 rounded-full">
                        <img alt="Your face!" src="https://daisyui.com/images/stock/photo-1534528741775-53994a69daeb.jpg" />
                    </div>
                </div>
                <ul tabIndex={0} className="mt-3 z-[1] p-2 shadow menu menu-sm dropdown-content bg-base-100 rounded-box w-52">
                    <li>
                    <a href="http://localhost:3000/profile" className="justify-between">
                        Profile
                        <span className="badge">New</span>
                    </a>
                    </li>
                    <li><a href="http://localhost:3000/">Settings</a></li>
                    <li><a href="http://localhost:3000/">Logout</a></li>
                </ul>
                </div>
            </div>
            </div>
    );
}

export default Navbar;