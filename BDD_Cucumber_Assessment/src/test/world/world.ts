import {setWorldConstructor, World} from '@cucumber/cucumber';
import {Page,Browser,BrowserContext} from 'playwright';
import { HomePage } from '../pages/HomePage';
import { RegisterPage } from '../pages/ResigterPage';
import { LoginPage } from '../pages/loginPage';

export class customWorld extends World{
    browser!:Browser;
    browserContext!:BrowserContext;
    page!:Page;
    hp!:HomePage;
    rp!:RegisterPage;
    lp!:LoginPage;
}

setWorldConstructor(customWorld);