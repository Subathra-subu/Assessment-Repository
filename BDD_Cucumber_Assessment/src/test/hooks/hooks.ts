import { HomePage } from '../pages/HomePage';
import {chromium} from 'playwright';
import {customWorld } from './../world/world';
import {Before,After,BeforeAll,AfterAll} from '@cucumber/cucumber';
import {RegisterPage} from '../pages/ResigterPage';
import { LoginPage } from '../pages/loginPage';

let browser:any;

BeforeAll(async ()=>{
    browser = await chromium.launch({headless:false});
})

Before(async function (this:customWorld){

    this.browser = browser;
    this.browserContext = await this.browser.newContext();
    this.page = await this.browserContext.newPage();
    this.hp = new HomePage(this.page);
    this.rp = new RegisterPage(this.page);
    this.lp = new LoginPage(this.page);

})

After(async function(this:customWorld,scenario){

    if(scenario.result?.status == "FAILED"){
        const path = `reports/Screenshots/${scenario.pickle.name}_${Date.now()}`;
        await this.page.screenshot({path});
    }

await this.page.close();
await this.browserContext.close();

})

AfterAll(async ()=>{

    await browser.close();
    
})
