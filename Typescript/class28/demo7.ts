// class Book{
//     public title: string;
//     public author: string;
//     public price: number;

//     cosntructor(title: string, author: string, price: number){
//         this.title = title;
//         this.author = author;
//         this.price = price;
//     }

//     public display(){
//         //console.log('Book: Title = '+ book1.title + ', Author = '+ book1.author+ ', price = '+ book1.price);
//         console.log(`Book: Title = ${this.title}, Author = ${this.author}, Price = ${this.price}`)
//     }
// }

// let book1 = new Book('Title 1', 'Author 1', 100);
// book1.display();

class Book{;

    constructor(public title: string, public author: string, public price: number){
        
    }

    public display(){
        //console.log('Book: Title = '+ book1.title + ', Author = '+ book1.author+ ', price = '+ book1.price);
        console.log(`Book: Title = ${this.title}, Author = ${this.author}, Price = ${this.price}`)
    }
}

let book1 = new Book('Title 1', 'Author 1', 100);
book1.display();