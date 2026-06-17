import selenium
import selenium.webdriver
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
import time

driver = selenium.webdriver.Chrome()
driver.maximize_window()
driver.get("https://automationexercise.com/")

actions = ActionChains(driver)
wait = WebDriverWait(driver,10)

assert driver.title=="Automation Exercise"
print("Home page is displayed")

end = driver.find_element(By.XPATH,"//div[@class='footer-bottom']")
actions.move_to_element(end).perform()

assert driver.find_element(By.XPATH,"//h2[text()='Subscription']").is_displayed()
print("Subscription text is visible")

scrollup = driver.find_element(By.XPATH,"//a[@id='scrollUp']")
driver.execute_script("arguments[0].click();",scrollup)

text = driver.find_element(By.XPATH,"(//div[@class='col-sm-6']/descendant::h2['Full-Fledged practice website for Automation Engineers'])[1]")
wait.until(EC.visibility_of(text))
assert text.is_displayed()
print("The text was visible")