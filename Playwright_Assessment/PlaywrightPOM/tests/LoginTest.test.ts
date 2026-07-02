import {test,expect} from '../Fixture/BaseFixture'
import { readCsvFile, loginuser } from '../Utility/csvReader'


const user:loginuser[] = readCsvFile(); 

test.describe('Login Tests @regression',()=>{

    test.beforeEach(async({accountPage,loginPage})=>{

    await accountPage.navigate();

    await accountPage.clickAccountMenu();

    await accountPage.clickLoginLink();

})


test('LoginTest',async({accountPage,loginPage})=>{

    await loginPage.login(user[0]!.email,user[0]!.password);

    await expect(await loginPage.verifyLogin()).toBeVisible()

})


test('InvalidLoginTest',async({accountPage,loginPage})=>{

    for(let i=1;i<user.length;i++){

        await loginPage.login(user[i]!.email,user[i]!.password);

        await expect(await loginPage.verifyInvalidLogin()).toBeVisible()

    }
})

})


