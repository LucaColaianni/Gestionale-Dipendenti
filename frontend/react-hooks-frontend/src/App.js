import './App.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import ListEmployeeComponent from './components/ListEmployeeComponent';
import AddEmployeeComponent from './components/AddEmployeeComponent';

function App() {
  return (
    <>
      
        <HeaderComponent />
          <div className="container">
            <Router>
              <Switch>
                <Route path="/" component = {ListEmployeeComponent} /> 
                <Route path="/employees" component = {ListEmployeeComponent} /> 
                <Route path = "/add-employee" component = {AddEmployeeComponent} />
                <Route path = "/edit-employee/:id" component = {AddEmployeeComponent} />
              </Switch>
            </Router>
          </div>
      <FooterComponent />
      
    </>
  );
}

export default App;
