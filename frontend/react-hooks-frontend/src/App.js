import './App.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import ListEmployeeComponent from './components/ListEmployeeComponent';
import AddEmployeeComponent from './components/AddEmployeeComponent';

function App() {
  return (
    <>
      <Router>
        <HeaderComponent />
          <div className="container">
            <Switch>
              <Route path="/" component = {ListEmployeeComponent} /> 
              <Route path="/employees" component = {ListEmployeeComponent} /> 
              <Route path = "/add-employee/:id" component = {AddEmployeeComponent} />
              <Route path = "/edit-employee/:id" component = {AddEmployeeComponent} />
            </Switch>
          </div>
      <FooterComponent />
      </Router>
    </>
  );
}

export default App;
