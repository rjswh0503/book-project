import { useEffect, useState } from "react";
import {  Link } from "react-router-dom";
import axios from "axios";
import './css/Main.css';
import 'bootstrap/dist/css/bootstrap.min.css';



const BookMain = () => {

    const [books, setBooks] = useState([]);
    
    useEffect(() => {
        axios.get('http://localhost:8080/book/list')
        .then(response => {
            setBooks(response.data);
    })
        .catch(error => {
            console.log('책 정보 불러오기 오류', error);

        });
    }, []);




    return(
        <>
            <div className="container">
                <div className="bookMain">
                    <div className="book-list">
                        {books.map(book => (
                            <div className="book-main-list" key={book.bookNo}>
                                <img style={{width:'200px', height:'300px'}} src={book.bookImg} className="book-img" alt={book.bookTitle}/>
                                <div className="book-title" style={{fontSize:'20px',fontWeight:'bold', marginTop:'25px'}}>{book.bookTitle}</div>
                                <div className="book-author" style={{fontSize:'15px',marginTop:'15px'}}>{book.bookAuthor}</div>
                            </div>    
                        ))}
                    </div>
                </div>
            </div>
        
        </>
    )

}

export default BookMain;
