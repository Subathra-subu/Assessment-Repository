import {Page,Locator} from '@playwright/test'

export class LOginPage{
    readonly page: Page;
    readonly email: Locator;
    readonly password: Locator;


    constructor(page:Page){
        this.page = page;
        this.email= page.locator("#input-email");
        this.password=page.locator("#input-password");
    }

    async login(userEmail:string,userPassword:string){
        this.email.fill(userEmail);
        this.password.fill(userPassword);
    }
}