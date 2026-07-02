import {test,expect} from '../Fixture/BaseFixture'

test('Search Test @smoke',async({accountPage,searchPage,productPage})=>{
    await accountPage.navigate();
    await accountPage.searchProduct('MacBook');
    await searchPage.productSelect();
    await expect(productPage.productTitle).toHaveText('MacBook');
})