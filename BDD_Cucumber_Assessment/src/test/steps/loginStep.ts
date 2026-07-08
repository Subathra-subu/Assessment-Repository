import{When,Then} from '@cucumber/cucumber';
import { customWorld } from '../world/world';
import {expect} from '@playwright/test';

When('the clicks the Login link', async function (this:customWorld) {
    
    this.hp.ClickLoginLink();
  
});

When('the user enters the email as {string} and password as {string}', async function (string, string2) {
  
    this.lp.enterLoginDetails(string,string2);

});


When('the user clicks the login button', async function (this:customWorld) {

    this.lp.ClickLoginButton();
  
});

Then('the user should see the appropriate message as {string} based on the input type as {string}', async function (string, string2) {
  if(string2=="valid"){
        await expect(this.hp.logout).toHaveText(string);
    }

    else{
        await expect(this.hp.errorMessage).toHaveText(string);
    }
});