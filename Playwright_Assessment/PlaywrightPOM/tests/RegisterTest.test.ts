import {test,expect} from '../Fixture/BaseFixture'
import RegisterData from '../TestData/RegisterData.json'


test('RegisterTest @smoke',async({accountPage,registerPage})=>{

    await accountPage.navigate();

    await accountPage.clickAccountMenu();

    await accountPage.clickRegisterLink();

    await registerPage.register(RegisterData.firtsname,RegisterData.lastname,RegisterData.email,RegisterData.telephone,RegisterData.password,RegisterData.confirmpassword);

    await expect (accountPage.successMessage).toHaveText("Your Account Has Been Created!")

})
