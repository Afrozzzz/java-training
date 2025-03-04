function addBook() {

    const title = document.getElementById('title').value;

    const price = document.getElementById('price').value;

    const authorId = document.getElementById('authorId').value;
 
    if (title && price && authorId) {

        const book = {

            title: title,

            price: price,

            authorId: authorId

        };
 
        fetch('/api/books', {

            method: 'POST',

            headers: {

                'Content-Type': 'application/json'

            },

            body: JSON.stringify(book)

        })

        .then(response => response.text())

        .then(data => {

            alert(data);

        })

        .catch(error => {

            console.error('Error:', error);

        });

    } else {

        alert('Please fill in all fields.');

    }

}
 