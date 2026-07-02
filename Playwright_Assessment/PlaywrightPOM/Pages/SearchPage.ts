import {test,expect, Page, Locator} from '@playwright/test'

export class SearchPage{
    readonly page:Page
    readonly product:Locator

    constructor(page:Page){
        this.page=page;
        this.product=page.locator('div.product-thumb');
    }
    async productSelect(){
        await this.page.getByRole("link",{name:'MacBook'}).first().click();
    }
}