import { LoginPage } from '../Pages/LoginPage';
import { RegisterPage } from '../Pages/RegisterPage';
import { AccountPage } from './../Pages/AccountPage';
import { expect,test as base} from '@playwright/test';


type fixtures = {
    accountPage:AccountPage;
    registerPage:RegisterPage;
    loginPage:LoginPage;
}

export const test = base.extend<fixtures>({
    
    accountPage:async({page},use)=>{
        await use(new AccountPage(page));
    },
    registerPage:async({page},use)=>{
        await use(new RegisterPage(page));
    },
    loginPage:async({page},use)=>{
        await use(new LoginPage(page))
    }

});
export {expect}