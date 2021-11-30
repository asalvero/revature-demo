import logo from './logo.svg';
import './App.css';
import Posts from './components/Posts';
import Photos from './components/Photos';
import News from './components/News';

function App() {
  return (
    <div className="container">
      <h1>App Component</h1>
      {/* <Posts /> */}
      {/* <Photos /> */}
      <News />
    </div>
  );
}

export default App;
