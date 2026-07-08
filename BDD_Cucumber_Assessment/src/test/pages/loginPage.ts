import { Page, Locator } from 'playwright'


export class LoginPage {

    readonly page: Page;
    readonly email: Locator;
    readonly password: Locator;
    readonly loginButton: Locator;

    constructor(page: Page) {
        this.page = page;
        this.email = this.page.getByLabel("Email:");
        this.password = this.page.getByLabel("Password:");
        this.loginButton = this.page.locator("//input[@value='Log in']");
    }

    async enterLoginDetails(email: string, password:string) {
        await this.email.fill(email);
        await this.password.fill(password);
    }

    async ClickLoginButton() {
        await this.loginButton.click();
    }
}