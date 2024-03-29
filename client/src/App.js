import BookMain from "./Component/Book/BookMain";
import {
  BrowserRouter as Router,
  Routes,
  Route,
  Navigate,
  Link,
} from 'react-router-dom';


function App() {
  
  return(
    <Router>
      <Routes>
        <Route path="/" element={<BookMain/>}/>
      </Routes>
    </Router>
  )
}

export default App;
