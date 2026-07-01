import { RegisterPage } from '../Pages/RegisterPage';
import { AccountPage } from './../Pages/AccountPage';
import { expect,test as base} from '@playwright/test';


type fixtures = {
    accountPage:AccountPage;
    registerPage:RegisterPage;
}

export const test = base.extend<fixtures>({
    
    accountPage:async({page},use)=>{
        await use(new AccountPage(page));
    },
    

});
export {expect}