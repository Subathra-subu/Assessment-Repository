import selenium
import selenium.webdriver
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

driver = selenium.webdriver.Chrome()
driver.maximize_window()
driver.get("https://automationexercise.com/")

actions = ActionChains(driver)
wait = WebDriverWait(driver,10)

assert driver.title=="Automation Exercise"
print("Home page is displayed")

signup_or_login = driver.find_element(By.XPATH,"//a[text()=' Signup / Login']")
wait.until(EC.visibility_of(signup_or_login))
signup_or_login.click()

driver.find_element(By.XPATH,"//form[@action='/signup']/child::input[2]").send_keys("emily")
driver.find_element(By.XPATH,"//form[@action='/signup']/child::input[3]").send_keys("emilydavis@gmail.com")
signup = driver.find_element(By.XPATH,"//form[@action='/signup']/child::button")
driver.execute_script("arguments[0].click();", signup)

gender = driver.find_element(By.XPATH,"//input[@id='id_gender1']")
wait.until(EC.visibility_of(gender))
gender.click()

driver.find_element(By.XPATH,"//input[@id='password']").send_keys(123456)

driver.find_element(By.XPATH,"//select[@id='days']").send_keys(28)
driver.find_element(By.XPATH,"//select[@id='months']").send_keys("May")
driver.find_element(By.XPATH,"//select[@id='years']").send_keys(2026)

driver.find_element(By.XPATH,"//input[@id='first_name']").send_keys("emily")
driver.find_element(By.XPATH,"//input[@id='last_name']").send_keys("davis")
driver.find_element(By.XPATH,"//input[@id='address1']").send_keys("Gandhi street")
driver.find_element(By.XPATH,"//input[@id='state']").send_keys("Tamilnadu")
driver.find_element(By.XPATH,"//input[@id='city']").send_keys("Salem")
driver.find_element(By.XPATH,"//input[@id='zipcode']").send_keys(678914)
driver.find_element(By.XPATH,"//input[@id='mobile_number']").send_keys(9087654321)

address = ["Gandhi street","Salem Tamilnadu 678914","India","9087654321"]

create = driver.find_element(By.XPATH,"//input[@name='form_type']/following-sibling::*")
driver.execute_script("arguments[0].click();",create)

login_name = driver.find_element(By.XPATH,"//h2[@class='title text-center']")
expected = wait.until(EC.visibility_of(login_name)).text
assert expected == "ACCOUNT CREATED!"
print("Account created")

continue_button = driver.find_element(By.XPATH,"//a[text()='Continue']")
driver.execute_script("arguments[0].click();",continue_button)

assert driver.find_element(By.XPATH,"//a[text()=' Logged in as ']").is_displayed()

image = driver.find_element(By.XPATH,"//img[@src='/get_product_picture/1']")
actions.move_to_element(image).perform()

add_to_cart = driver.find_element(By.XPATH,"(//a[@class='btn btn-default add-to-cart'])[1]")
driver.execute_script("arguments[0].click();",add_to_cart)

print("Added to cart")

continue_shop = driver.find_element(By.XPATH,"//button[text()='Continue Shopping']")
driver.execute_script("arguments[0].click();",continue_shop)

cart = driver.find_element(By.XPATH,"//a[text()=' Cart']")
actions.move_to_element(cart)
driver.execute_script("arguments[0].click();",continue_shop)

cart_title = driver.find_element(By.XPATH,"//li[text()='Shopping Cart']")
wait.until(EC.visibility_of(cart_title))
assert cart_title.text == "Shopping Cart"

driver.find_element(By.XPATH,"//a[text()='Proceed To Checkout']").click()

wait.until(EC.visibility_of_element_located(By.XPATH,"//h2[text()='Address Details']"))

address1 = driver.find_elements(By.XPATH,"(//li[@class='address_firstname address_lastname'])[1]/following-sibling::*").text

print(address1)

count=0
for i in address1:
    assert i == address[count] 
    count+=1

address2 = driver.find_elements(By.XPATH,"(//li[@class='address_firstname address_lastname'])[2]/following-sibling::*")

for i,j in address1,address2:
    assert i==j


driver.find_element(By.XPATH,"//a[text()=' Delete Account']").click()
driver.execute_script("arguments[0].click();",continue_button)

print("Account deleted")


