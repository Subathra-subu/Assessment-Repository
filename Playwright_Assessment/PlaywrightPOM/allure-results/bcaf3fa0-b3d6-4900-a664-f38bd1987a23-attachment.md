# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: RegisterTest.test.ts >> RegisterTest @smoke
- Location: tests\RegisterTest.test.ts:5:5

# Error details

```
Error: page.goto: url: expected string, got undefined
```

```
Error: expect(locator).toHaveText(expected) failed

Locator: locator('//h1[text()=\'Your Account Has Been Created!\']')
Expected: "Your Account Has Been Created!"
Error: element(s) not found

Call log:
  - Expect "toHaveText" with timeout 5000ms
  - waiting for locator('//h1[text()=\'Your Account Has Been Created!\']')

```

# Test source

```ts
  1  | import {test,expect} from '../Fixture/BaseFixture'
  2  | import RegisterData from '../TestData/RegisterData.json'
  3  | 
  4  | 
  5  | test('RegisterTest @smoke',async({accountPage,registerPage})=>{
  6  | 
  7  |     accountPage.navigate();
  8  | 
  9  |     accountPage.clickAccountMenu();
  10 | 
  11 |     accountPage.clickRegisterLink();
  12 | 
  13 |     registerPage.register(RegisterData.firtsname,RegisterData.lastname,RegisterData.email,RegisterData.telephone,RegisterData.password,RegisterData.confirmpassword);
  14 | 
> 15 |     await expect (accountPage.successMessage).toHaveText("Your Account Has Been Created!")
     |                                               ^ Error: expect(locator).toHaveText(expected) failed
  16 | 
  17 | })
  18 | 
```