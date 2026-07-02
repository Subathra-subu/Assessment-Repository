import { expect } from '@playwright/test';
import { test } from "../Fixture/BaseFixture"
import SearchData from '../TestData/SearchData.json'

test.describe("Search Product @smoke",()=>{

    test.beforeEach("Before Search @smoke", async({accountPage})=>{
        await accountPage.navigate()
    })

    test("search product @smoke", async({accountPage,searchPage})=>{
        await accountPage.searchProduct(SearchData.searchitem);
        const products = await searchPage.listProduct();
        const listP = await products.allInnerTexts();
        for(var pro of listP)
            expect(pro).toContain(SearchData.searchitem)
    })

})