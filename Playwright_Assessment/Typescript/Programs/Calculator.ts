import PromptSync from "prompt-sync";

const prompt = PromptSync();

let num1:number = Number(prompt("Enter the first number:"));
let num2:number = Number(prompt("Enter the second number:"));

if(num1 < 0 || num2 < 0){
   console.log("Two integers need be positive");
}

else{

    console.log("Addition of two numbers:",num1+num2);

    if(num1 < num2){
        console.log("For subtraction num1 must be grater than num2");   
    }
    else{
        console.log("Subtraction of two numbers:",num1-num2);
    }

    console.log("Multiplication of two numbers:",num1*num2);

    if(num2==0){
        console.log("num2 is Zero so it will lead to Zero Division Error");
    }
    else{
        console.log("Division of two numbers:",num1/num2);
    }

}




