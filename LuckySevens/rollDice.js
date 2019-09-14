/*
Author: Lindsay Nickalo
Email: bradleyl4@winthrop.edu
Date: September 09, 2019
Purpose: JavaScript File for the Lucky Sevens Project
*/

//function to roll a six-sided die
function rollDice()
{
        return Math.floor(Math.random()*6) + 1;
}

//function to play Lucky Sevens with input of the starting bet
function luckySevens(bet)
{
	var diceA = 0;
	var diceB = 0;
	var maxWin = 0;
	var maxWinRolls = 0;
	var totalWinnings = Number(bet);
	var totalRolls = 0;
	do{
		diceA = rollDice();
		diceB = rollDice();
		if(diceA + diceB == 7)
		{
			totalWinnings = totalWinnings + 4;
		}
		else
		{
			totalWinnings = totalWinnings - 1;
		}
		totalRolls++;
		if(totalWinnings > maxWin)
		{
			maxWin = totalWinnings;
			maxWinRolls = totalRolls;
		}
	}while(totalWinnings>0);

	//convert the winning to currency values
	var fBet = Number(bet).toFixed(2);
	var fMaxWin = Number(maxWin).toFixed(2);

	document.getElementById("startingBet").innerText = "$" + fBet;
	document.getElementById("totalRolls").innerText = totalRolls;
	document.getElementById("maxWin").innerText = "$" + fMaxWin;
	document.getElementById("maxWinRolls").innerText = maxWinRolls;

	return false;
}

//function to clear any errors in input form
function clearErrors()
{
	for(var i=0; i<document.forms["betForm"].elements.length; i++)
	{
		if(document.forms["betForm"].elements[i].parentElement.className.indexOf("has-") != -1)
		{
			document.forms["betForm"].elements[i].parentElement.className= "form-group";
		}
	}
}

//function to validate inputted data in form
function validateForm()
{
	clearErrors();
	var bet = document.forms["betForm"]["bet"].value;
	//check to make sure bet is entered and a number
	if(bet=="" || isNaN(bet))
	{
		alert("Please place a bet.");
		document.forms["betForm"]["bet"].parentElement.className = "form-group has-error";
		document.forms["betForm"]["bet"].focus();
		return false;
	}
	//check to make sure bet is positive
	if (bet <= 0)
	{
		alert("Please enter a positive bet.");
		document.forms["betForm"]["bet"].parentElement.className = "form-group has-error";
		document.forms["betForm"]["bet"].focus();
		return false;
	}
	//show results tables, change play button to play again
	document.getElementById("results").style.display = "block";
	document.getElementById("submitButton").innerText = "Play Again";
	document.getElementById("resultsH").style.display = "block";
	document.getElementById("resultsL").style.display = "block";
	luckySevens(bet);
	return false;
}
