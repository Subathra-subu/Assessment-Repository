import {Page,Locator} from '@playwright/test'

export class productPage{
    readonly page:Page;
    readonly productTitle:Locator;

    constructor(page:Page){
        this.page=page;
        this.productTitle=page.locator('//h1[text()="MacBook"]');
    }
}