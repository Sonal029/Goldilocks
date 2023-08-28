let obj={
  "goldi":"12345",
  "qwerty":"98765",
  "masai":"78956"
}

let username= document.getElementsById("username").value;
let password= document.getElementsById("password").value;

for(let key in obj)
{
    if(k==username)
    {
       if(obj[key]=password)
       {
        alert("Login successful");
       }
       else
       {
        alert("Incorrect password");
       }
    }
    else{
        alert("Invalid Username");
    }
    
}
