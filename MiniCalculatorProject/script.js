let currentInput="0";
function sendButtonValue(button)
{
let buttonValue=button.value;
if(currentInput=="0")
{
currentInput=buttonValue;
}
else
{
    currentInput=currentInput+buttonValue;
}
updateOutput();
}
function clearOutput()
{
currentInput="0";
updateOutput();
}
function updateOutput()
{
    document.getElementById("output").value=currentInput;
}
function backspace()
{ 
    let temp=document.getElementById("output").value;
    if(temp.length==1)
    {
        currentInput="0";
    }
    else if(temp.length>0)
        {
        temp=temp.substring(0,temp.length-1);
        currentInput=temp;   
        }
    else
    {
        currentInput="0";
    }
    updateOutput();
}
function setoutput()
{
    let temp=document.getElementById("output").value;
    try{
    currentInput=eval(temp);
    updateOutput();
    }
    catch(error)
    {
        alert("Error: "+error.message);
    }

}
function validateinput()
{
    let temp=document.getElementById("output").value;
    if(isNaN(temp))
    {
        alert("Only numbers are allowed");
        
    }
}


