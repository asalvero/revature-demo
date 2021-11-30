import React, { useState } from 'react'
import axios from 'axios'

const News = () =>{
    const [news, setNews] = useState([]);

    let url = 'https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=d2d09fbdf3a540098549d9b961c2946a';

    function onClickHandler() {
        axios.get(url)
            .then((response) => {
                setNews(response.data.articles);
            })
            .catch(error => console.error(error))
    }

    return(
        <div>
            <h1></h1>
            <button onClick={onClickHandler}>Get Data</button>

            <div className="container">
                <div className="row">
                    {news.map((article) => (
                        <div className="col col-sm-6">
                        <div className="card">
                          <img className="card-img-top" src={article.urlToImage} alt="Card image cap" />
                          <div className="card-body">
                            <h5 className="card-title">{article.title}</h5>
                            <h6 className="card-subtitle">{article.author}</h6>
                            <p className="card-text">{article.description}</p>
                            <a className = "btn btn-primary" href = {article.url} target = "blank">Go to Article</a>
                          </div>
                        </div>
                      </div>
                    ))}
                </div>
            </div>
        </div>
    )
}

export default News;