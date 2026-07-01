import PromptSync from "prompt-sync";
const prompt = PromptSync();

function reverse(num:number):number{
    let rev:number=0;

    while(num>0){
        let last_digit=num%10;
        rev=rev*10+last_digit;
        num=Math.trunc(num/10);
    }

    return rev;
}

let num:number=Number(prompt("Enter the number:"));
let len:number=num.toString().length

console.log("original number:",num);


if(len==5) {
    console.log("Reversed number:",reverse(num));
}
else{
    console.log("You should enter five digit number")
}
