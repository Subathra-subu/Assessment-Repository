import { LoginPage } from '../Pages/LoginPage';
import { RegisterPage } from '../Pages/RegisterPage';
import { SearchPage } from '../Pages/SearchPage';
import { AccountPage } from './../Pages/AccountPage';
import { expect,test as base} from '@playwright/test';


type fixtures = {
    accountPage:AccountPage;
    registerPage:RegisterPage;
    loginPage:LoginPage;
    searchPage:SearchPage;
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
    },
    searchPage:async({page},use)=>{
        await use(new SearchPage(page))
    },

});
export {expect}