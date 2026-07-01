import {Page,Locator} from '@playwright/test'

export class RegisterPage{

    readonly page: Page;
    readonly firtsname: Locator;
    readonly lastname: Locator;
    readonly email:Locator;
    readonly telephone:Locator;
    readonly password:Locator;
    readonly confirmpassword:Locator;
    readonly privacyPloicy:Locator;
    readonly continueButton:Locator;

    constructor(page:Page){
        this.page = page;
        this.firtsname= page.locator("#input-firstname");
        this.lastname=page.locator("#input-lastname");
        this.email=page.locator("#input-email")
        this.telephone=page.locator("#input-telephone")
        this.password=page.locator("#input-password")
        this.confirmpassword=page.locator("#input-confirm")
        this.privacyPloicy=page.locator("//input[@type='checkbox']")
        this.continueButton=page.locator("//input[@type='submit']")
    }

    async register(firstname:string,lastname:string,email:string,telephone:string,password:string,confirm:string){
        await this.firtsname.fill(firstname);
        await this.lastname.fill(lastname);
        await this.email.fill(email);
        await this.telephone.fill(telephone);
        await this.password.fill(password);
        await this.confirmpassword.fill(confirm);
        await this.privacyPloicy.check();
        await this.continueButton.click();
    }

    
}