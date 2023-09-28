classDiagram
class Person {
  -email: string
  -fullName: string 
  -yearOfBirth: int
  -gender: string
  -phoneNumber: string
  -address: string
  
  +showInfo()
  +changePhoneNumber(newNumber: string)  
  +changeAddress(newAddress: string)
}