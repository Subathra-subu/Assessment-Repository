# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: LoginTest.test.ts >> LoginTest @smoke
- Location: tests\LoginTest.test.ts:18:5

# Error details

```
Error: expect(locator).toBeVisible() failed

Locator: locator('//h2[text()=\'My Account\']')
Expected: visible
Timeout: 5000ms
Error: element(s) not found

Call log:
  - Expect "toBeVisible" with timeout 5000ms
  - waiting for locator('//h2[text()=\'My Account\']')

```

```yaml
- navigation:
  - button "$ Currency ":
    - strong: $
    - text: Currency 
  - list:
    - listitem:
      - link "":
        - /url: https://tutorialsninja.com/demo/index.php?route=information/contact
      - text: "123456789"
    - listitem:
      - link " My Account":
        - /url: https://tutorialsninja.com/demo/index.php?route=account/account
    - listitem:
      - link " Wish List (0)":
        - /url: https://tutorialsninja.com/demo/index.php?route=account/wishlist
    - listitem:
      - link " Shopping Cart":
        - /url: https://tutorialsninja.com/demo/index.php?route=checkout/cart
    - listitem:
      - link " Checkout":
        - /url: https://tutorialsninja.com/demo/index.php?route=checkout/checkout
- banner:
  - heading "Qafox.com" [level=1]:
    - link "Qafox.com":
      - /url: https://tutorialsninja.com/demo/index.php?route=common/home
  - textbox "Search"
  - button ""
  - button " 0 item(s) - $0.00"
- navigation:
  - list:
    - listitem:
      - link "Desktops":
        - /url: https://tutorialsninja.com/demo/index.php?route=product/category&path=20
    - listitem:
      - link "Laptops & Notebooks":
        - /url: https://tutorialsninja.com/demo/index.php?route=product/category&path=18
    - listitem:
      - link "Components":
        - /url: https://tutorialsninja.com/demo/index.php?route=product/category&path=25
    - listitem:
      - link "Tablets":
        - /url: https://tutorialsninja.com/demo/index.php?route=product/category&path=57
    - listitem:
      - link "Software":
        - /url: https://tutorialsninja.com/demo/index.php?route=product/category&path=17
    - listitem:
      - link "Phones & PDAs":
        - /url: https://tutorialsninja.com/demo/index.php?route=product/category&path=24
    - listitem:
      - link "Cameras":
        - /url: https://tutorialsninja.com/demo/index.php?route=product/category&path=33
    - listitem:
      - link "MP3 Players":
        - /url: https://tutorialsninja.com/demo/index.php?route=product/category&path=34
- list:
  - listitem:
    - link "":
      - /url: https://tutorialsninja.com/demo/index.php?route=common/home
  - listitem:
    - link "Account":
      - /url: https://tutorialsninja.com/demo/index.php?route=account/account
  - listitem:
    - link "Login":
      - /url: https://tutorialsninja.com/demo/index.php?route=account/login
- text: " Warning: No match for E-Mail Address and/or Password."
- heading "New Customer" [level=2]
- paragraph:
  - strong: Register Account
- paragraph: By creating an account you will be able to shop faster, be up to date on an order's status, and keep track of the orders you have previously made.
- link "Continue":
  - /url: https://tutorialsninja.com/demo/index.php?route=account/register
- heading "Returning Customer" [level=2]
- paragraph:
  - strong: I am a returning customer
- text: E-Mail Address
- textbox "E-Mail Address": emiyahoo.com
- text: Password
- textbox "Password": emil
- link "Forgotten Password":
  - /url: https://tutorialsninja.com/demo/index.php?route=account/forgotten
- button "Login"
- complementary:
  - link "Login":
    - /url: https://tutorialsninja.com/demo/index.php?route=account/login
  - link "Register":
    - /url: https://tutorialsninja.com/demo/index.php?route=account/register
  - link "Forgotten Password":
    - /url: https://tutorialsninja.com/demo/index.php?route=account/forgotten
  - link "My Account":
    - /url: https://tutorialsninja.com/demo/index.php?route=account/account
  - link "Address Book":
    - /url: https://tutorialsninja.com/demo/index.php?route=account/address
  - link "Wish List":
    - /url: https://tutorialsninja.com/demo/index.php?route=account/wishlist
  - link "Order History":
    - /url: https://tutorialsninja.com/demo/index.php?route=account/order
  - link "Downloads":
    - /url: https://tutorialsninja.com/demo/index.php?route=account/download
  - link "Recurring payments":
    - /url: https://tutorialsninja.com/demo/index.php?route=account/recurring
  - link "Reward Points":
    - /url: https://tutorialsninja.com/demo/index.php?route=account/reward
  - link "Returns":
    - /url: https://tutorialsninja.com/demo/index.php?route=account/return
  - link "Transactions":
    - /url: https://tutorialsninja.com/demo/index.php?route=account/transaction
  - link "Newsletter":
    - /url: https://tutorialsninja.com/demo/index.php?route=account/newsletter
- contentinfo:
  - heading "Information" [level=5]
  - list:
    - listitem:
      - link "About Us":
        - /url: https://tutorialsninja.com/demo/index.php?route=information/information&information_id=4
    - listitem:
      - link "Delivery Information":
        - /url: https://tutorialsninja.com/demo/index.php?route=information/information&information_id=6
    - listitem:
      - link "Privacy Policy":
        - /url: https://tutorialsninja.com/demo/index.php?route=information/information&information_id=3
    - listitem:
      - link "Terms & Conditions":
        - /url: https://tutorialsninja.com/demo/index.php?route=information/information&information_id=5
  - heading "Customer Service" [level=5]
  - list:
    - listitem:
      - link "Contact Us":
        - /url: https://tutorialsninja.com/demo/index.php?route=information/contact
    - listitem:
      - link "Returns":
        - /url: https://tutorialsninja.com/demo/index.php?route=account/return/add
    - listitem:
      - link "Site Map":
        - /url: https://tutorialsninja.com/demo/index.php?route=information/sitemap
  - heading "Extras" [level=5]
  - list:
    - listitem:
      - link "Brands":
        - /url: https://tutorialsninja.com/demo/index.php?route=product/manufacturer
    - listitem:
      - link "Gift Certificates":
        - /url: https://tutorialsninja.com/demo/index.php?route=account/voucher
    - listitem:
      - link "Affiliate":
        - /url: https://tutorialsninja.com/demo/index.php?route=affiliate/login
    - listitem:
      - link "Specials":
        - /url: https://tutorialsninja.com/demo/index.php?route=product/special
  - heading "My Account" [level=5]
  - list:
    - listitem:
      - link "My Account":
        - /url: https://tutorialsninja.com/demo/index.php?route=account/account
    - listitem:
      - link "Order History":
        - /url: https://tutorialsninja.com/demo/index.php?route=account/order
    - listitem:
      - link "Wish List":
        - /url: https://tutorialsninja.com/demo/index.php?route=account/wishlist
    - listitem:
      - link "Newsletter":
        - /url: https://tutorialsninja.com/demo/index.php?route=account/newsletter
  - separator
  - paragraph:
    - text: Powered By
    - link "OpenCart":
      - /url: http://www.opencart.com
    - text: Qafox.com © 2026
```

# Test source

```ts
  1  | import {test,expect} from '../Fixture/BaseFixture'
  2  | import { readCsvFile, loginuser } from '../Utility/csvReader'
  3  | 
  4  | 
  5  | const user:loginuser[] = readCsvFile(); 
  6  | 
  7  | test.beforeEach(async({accountPage,loginPage})=>{
  8  | 
  9  |     await accountPage.navigate();
  10 | 
  11 |     await accountPage.clickAccountMenu();
  12 | 
  13 |     await accountPage.clickLoginLink();
  14 | 
  15 | })
  16 | 
  17 | 
  18 | test('LoginTest @smoke',async({accountPage,loginPage})=>{
  19 | 
  20 |     await loginPage.login(user[0]!.email,user[0]!.password);
  21 | 
> 22 |     await expect(await loginPage.verifyLogin()).toBeVisible()
     |                                                 ^ Error: expect(locator).toBeVisible() failed
  23 | 
  24 | })
  25 | 
  26 | 
  27 | test('InvalidLoginTest @regression',async({accountPage,loginPage})=>{
  28 | 
  29 |     for(let i=1;i<user.length;i++){
  30 | 
  31 |         await loginPage.login(user[i]!.email,user[i]!.password);
  32 | 
  33 |         await expect(await loginPage.verifyInvalidLogin()).toBeVisible()
  34 | 
  35 |     }
  36 | 
  37 |     
  38 | 
  39 | })
  40 | 
```