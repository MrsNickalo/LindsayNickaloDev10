
//function to clear any errors in input form
function clearErrors()
{
        for(var i=0; i<document.forms["contactForm"].elements.length; i++)
        {
                if(document.forms["contactForm"].elements[i].parentElement.className.indexOf("has-") != -1)
                {
                        document.forms["contactForm"].elements[i].parentElement.className= "form-group";
                }
        }
}

//function to validate inputted data in form
function validateForm()
{
        clearErrors();
        var name = document.forms["contactForm"]["userName"].value;
	var email = document.forms["contactForm"]["userEmail"].value;
	var phone = document.forms["contactForm"]["userPhone"].value;
	var reason = document.forms["contactForm"]["userReason"].value;
	var info = document.forms["contactForm"]["userAddInfo"].value;
	var visit = document.forms["contactForm"]["visit"].value;
	var days = document.forms[0];
	var txt = "";
	for(var i=0; i<days.length; i++)
	{
		txt = txt + days[i].value;
	}
		document.forms["contactForm"]["userDays"].value;
	if(name=="")
	{
		alert("Please fill in your name.");
		document.forms["contactForm"]["userName"].focus();
		return false;
	}

	if(email=="")
	{
		alert("Please fill in your email.");
		document.forms["contactForm"]["userEmail"].focus();
		return false;
	}

	if(phone=="")
	{
		alert("Please fill in your phone number.");
		document.forms["contactForm"]["userPhone"].focus();
		return false;
	}

	if(reason=="")
	{
		alert("Please select a reason.");
		document.forms["contactForm"]["userReason"].focus();
		return false;
	}

	if(visit=="")
	{
		alert("Please answer the question of why you visited.");
		document.forms["contactForm"]["visit"].focus();
		return false;
	}

	if(txt=="")
	{
		alert("Please select a day.");
		document.forms["contactForm"]["userDays"].focus();
		return false;
	}

	alert("Request successfully submitted!");
        return false;
}

