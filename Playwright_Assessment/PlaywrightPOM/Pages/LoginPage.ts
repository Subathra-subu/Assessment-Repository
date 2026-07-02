import {Page,Locator} from '@playwright/test'

export class LoginPage{
    readonly page: Page;
    readonly email: Locator;
    readonly password: Locator;
    readonly loginButton: Locator;
    readonly loginSuccess: Locator;
    readonly errormessage:Locator;


    constructor(page:Page){
        this.page = page;
        this.email= page.locator("#input-email");
        this.password=page.locator("#input-password");
        this.loginButton=page.locator("input[value='Login']")
        this.loginSuccess=page.locator("//h2[text()='My Account']")
        this.errormessage = page.locator(".alert.alert-danger.alert-dismissible")
    }

    async login(userEmail:string,userPassword:string){
        await this.email.fill(userEmail);
        await this.password.fill(userPassword);
        await this.loginButton.click()
    }

    async verifyLogin(){
        return this.loginSuccess
    }

    async verifyInvalidLogin(){
        return this.errormessage
    }
}