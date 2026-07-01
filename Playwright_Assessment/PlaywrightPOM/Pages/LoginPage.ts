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
}