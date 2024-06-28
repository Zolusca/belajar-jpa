Embedded digunakan untuk memcah data field pada table
kasusnya ketika satu table memiliki banyak field

ex : 
| id          | varchar(120) |
| username    | varchar(30)  |
| city        | varchar(30)  |
| country     | varchar(30)  |
| address     | text         |
| postal_code | int          |   

kita bisa memecahnya menjadi class user dan address, dimana class user
sebagai class utama dan address sebagai field composition