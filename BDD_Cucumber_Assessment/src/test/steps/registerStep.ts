import{Given,When,Then} from '@cucumber/cucumber'
import { readCsvFile} from '../utilities/csvReader';
import { customWorld } from '../world/world';
import { faker } from '@faker-js/faker';
import { expect } from '@playwright/test';


const data = readCsvFile();

Given('the user launches the DemoWebShop website', async function (this:customWorld) {

    await this.hp.navigate();
  
});

When('the clicks the register link', async function (this:customWorld) {

    await this.hp.ClickRegisterLink();
  
});

When('the user enters the valid details from csv file', async function (this:customWorld) {

    await this.rp.enterDetails(data[0]!.firstName,data[0]!.lastName,faker.internet.email(),data[0]!.password,data[0]!.confirm);
  
});

When('the user clicks the register button', async function (this:customWorld) {

    await this.rp.clickRegsiterButton();
 
});

Then('the user should see the successfully registered message', async function (this:customWorld) {
  
    await expect(this.hp.successMessage).toBeVisible();

});