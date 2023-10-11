function result(marks){
    if(marks>=60){
        alert("pass");
    }
    else{
        alert("fail");
    }
}

function promptUser(){
    marks=prompt("Enter marks=");
    if(marks>=60){
        alert("pass");
    }
    else{
        alert("fail");
    }
}

function validateFirst(input){
    if(input.length==0){
        alert("please input a value");
        return false;
    }
    if(input>=60){
        alert("pass");
    }
    else{
        alert("fail");
    }
}

const valArray=[];
function addInArray(values){
    for(let i=0;i<valArray.length;i++){
        if(values==" "){
            alert("Array terminated");
            break;
        }else{
        valArray[i]=values;
        }
    }
}

function display(){
    for(let conter=0;conter<valArray.length;conter++){
        document.write(valArray[conter]);
        // prompt(valArray[conter]);
    }
}