import {Page,Locator} from 'playwright'


export class HomePage{

    readonly page:Page;
    readonly registerLink:Locator;
    readonly successMessage:Locator;
    readonly loginLink:Locator;
    readonly logout:Locator;
    readonly errorMessage:Locator;

    constructor(page:Page){
        this.page = page;
        this.registerLink = this.page.locator("//a[text()='Register']");
        this.successMessage = this.page.locator("//h1[text()='Register']");
        this.loginLink = this.page.locator("//a[text()='Log in']");
        this.logout = this.page.locator("//a[text()='Log out']");
        this.errorMessage = this.page.locator("//li[text()='The credentials provided are incorrect']");

    }

    async navigate(){
        await this.page.goto("https://demowebshop.tricentis.com/");
    }

    async ClickRegisterLink(){
        await this.registerLink.click();
    }

    async ClickLoginLink(){
        await this.loginLink.click();
    }

}