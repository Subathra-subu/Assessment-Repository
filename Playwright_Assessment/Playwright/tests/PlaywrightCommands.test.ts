import {test,expect} from '@playwright/test'

const keyword = {"searchitem":"playwright"};

test('Commands test',async({page})=>{

    await page.goto(process.env.base_url!);

    const title = await page.title();
    console.log("Title:",title);

    console.log("-------------------------------------");

    const current_url = page.url();
    console.log("Current Url:",current_url);

    console.log("-------------------------------------");

    expect (page).toHaveTitle("Search - Microsoft Bing");
    expect (page).toHaveURL("https://www.bing.com/");

    const innercontent = await page.getByRole("link",{name:"Images"}).textContent();
    console.log("Inner Text of Images link:",innercontent);
    console.log("-------------------------------------");

    console.log("Attributes value of search tab:");
    const search = page.locator("//textarea[@name='q']");
    console.log("Placeholder:",await search.getAttribute("placeholder"));
    console.log("Aria label:",await search.getAttribute("aria-label"));
    console.log("Class:",await search.getAttribute("class"));
    console.log("Id:",await search.getAttribute("id"));
    console.log("Role:",await search.getAttribute("role"));
    console.log("-------------------------------------");

    console.log("Search function:");
    await search.fill(keyword.searchitem);
    await search.press("Enter");
    await page.locator("//div[@class='slide wptSld rowSpan4 colSpan5']/child::div[2]/descendant::a[1]").click();
    expect(page).toHaveTitle("playwright - Search");
    console.log("Title:",await page.title());
})