function validateform(){  
	var fullname = document.myForm.fullname.value;  
	var email = document.myForm.email.value;  
	var contact = document.myForm.contact.value;  

	if (fullname != "" || email != "" || contact != ""){  
		alert("Fullname: "+fullname+"\n"+
					"Email: "+email+"\n"+
					"Contact #: "+contact);
	} else {
		alert("Fields can't be empty!");
	}
}  