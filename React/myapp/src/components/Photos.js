import React, { useState } from 'react'
import axios from 'axios'


const Photos = () => {
    const [photos, setPhotos] = useState([]);

    let url = 'https://jsonplaceholder.typicode.com/photos';

    function onClickHandler() {
        axios.get(url)
            .then((response) => {
                setPhotos(response.data);
            })
            .catch(error => console.error(error))
    }

    return (
        <div>
            <h1></h1>
            <button onClick={onClickHandler}>Get Data</button>
            {/* <table className="table table-bordered">
                <thead className="thead-dark">
                   
                        <tr>
                            <td>Title</td>
                            <td>Photo</td>
                        </tr>
                  
                </thead>
                <tbody>
                    {
                        photos.map((photo) => (<tr>
                            <td>{photo.title}</td>
                            <td><img src={photo.thumbnailUrl}></img></td>
                        </tr>))
                    }
                </tbody>
            </table> */}

            <div className="container">
                <div className="row">
                    {photos.map((photo) => (
                        <div className="col col-lg-3">
                        <div className="card">
                          <img className="card-img-top" src={photo.thumbnailUrl} alt="Card image cap" />
                          <div className="card-body">
                            <h5 className="card-title">{photo.title}</h5>
                            <a className = "btn btn-primary" href = {photo.url} target = "blank">View Full Image</a>
                          </div>
                        </div>
                      </div>
                    ))}
                </div>
            </div>

        </div>
    )
}
export default Photos;