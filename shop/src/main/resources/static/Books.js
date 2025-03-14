// Sample data
const books = [
    { id: 1, title: "Book One", price: 29.99, authorId: 101 },
    { id: 2, title: "Book Two", price: 39.99, authorId: 102 },
    { id: 3, title: "Book Three", price: 49.99, authorId: 103 }
];
 
// Function to display all books
function displayBooks() {
    const bookList = document.getElementById('book-list');
    bookList.innerHTML = '';
    books.forEach(book => {
        const li = document.createElement('li');
        li.textContent = `${book.title} - $${book.price}`;
        bookList.appendChild(li);
    });
}
 
// Function to search for a book by ID
function searchBookById(id) {
    return books.find(book => book.id === parseInt(id));
}
 
// Event listener for form submission
document.getElementById('search-form').addEventListener('submit', function(event) {
    event.preventDefault();
    const bookId = document.getElementById('book-id').value;
    const book = searchBookById(bookId);
 
    if (book) {
        document.getElementById('detail-id').textContent = book.id;
        document.getElementById('detail-title').textContent = book.title;
        document.getElementById('detail-price').textContent = book.price;
        document.getElementById('detail-authorId').textContent = book.authorId;
        document.getElementById('book-details').style.display = 'block';
    } else {
        alert('Book not found');
        document.getElementById('book-details').style.display = 'none';
    }
});
 
// Initial display of all books
displayBooks();