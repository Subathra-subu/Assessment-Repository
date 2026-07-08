import {Page,Locator} from 'playwright'


export class RegisterPage{

    readonly page:Page;
    readonly gender:Locator;
    readonly firstName:Locator;
    readonly lastName:Locator;
    readonly email:Locator;
    readonly password:Locator;
    readonly confirm:Locator;
    readonly regitserButton:Locator;

    constructor(page:Page){
        this.page = page;
        this.gender = this.page.locator("//input[@id='gender-male']");
        this.firstName = this.page.locator("//input[@id='FirstName']");
        this.lastName = this.page.locator("//input[@id='LastName']");
        this.email = this.page.locator("//input[@id='Email']");
        this.password = this.page.locator("//input[@id='Password']");
        this.confirm = this.page.locator("//input[@id='ConfirmPassword']");
        this.regitserButton = this.page.locator("//input[@id='register-button']");
    }

    async enterDetails(first:string,last:string,mail:string,pass:string,conpass:string){
        await this.gender.check();
        await this.firstName.fill(first);
        await this.lastName.fill(last);
        await this.email.fill(mail);
        await this.password.fill(pass);
        await this.confirm.fill(conpass);
    }

    async clickRegsiterButton(){
        await this.regitserButton.click(); 
    }

}