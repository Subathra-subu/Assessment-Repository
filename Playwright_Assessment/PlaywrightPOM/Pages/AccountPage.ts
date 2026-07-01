import {Page,Locator} from '@playwright/test'

export class AccountPage{

    readonly page: Page;
    readonly accountMenu: Locator;
    readonly registerLink: Locator;
    readonly successMessage:Locator;

    constructor(page:Page){
        this.page = page;
        this.accountMenu = page.locator(".caret");
        this.registerLink=page.locator("//a[text()='Register']");
        this.successMessage=page.locator("//h1[text()='Your Account Has Been Created!']");
    }

    async navigate(){
        this.page.goto(process.env.base_url!);
    }

    async clickAccountMenu(){
        await this.accountMenu.click();
    }

    async clickRegisterLink(){
        await this.registerLink.click();
    }
}