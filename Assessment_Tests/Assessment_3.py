import selenium
import selenium.webdriver
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

driver = selenium.webdriver.Chrome()
driver.maximize_window()
driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC")

wait = WebDriverWait(driver,10)

driver.find_element(By.XPATH,"//a[text()='Register']").click()

driver.find_element(By.XPATH,"//table//tr[1]//td/input").send_keys("sham")
driver.find_element(By.XPATH,"//table//tr[2]//td/input").send_keys("s")
driver.find_element(By.XPATH,"//table//tr[3]//td/input").send_keys("abc")
driver.find_element(By.XPATH,"//table//tr[4]//td/input").send_keys("salem")
driver.find_element(By.XPATH,"//table//tr[5]//td/input").send_keys("kerala")
driver.find_element(By.XPATH,"//table//tr[6]//td/input").send_keys(123456)
driver.find_element(By.XPATH,"//table//tr[7]//td/input").send_keys(9087654321)
driver.find_element(By.XPATH,"//table//tr[8]//td/input").send_keys(1234)
driver.find_element(By.XPATH,"//table//tr[10]//td/input").send_keys("EmilyDravid")
driver.find_element(By.XPATH,"//table//tr[11]//td/input").send_keys(123456)
driver.find_element(By.XPATH,"//table//tr[12]//td/input").send_keys(123456)

driver.find_element(By.XPATH,"//table//tr[13]//td/input").click()

bill_pay = driver.find_element(By.XPATH,"//a[text()='Bill Pay']")
wait.until(EC.visibility_of(bill_pay))
bill_pay.click()

driver.find_element(By.XPATH,"//table//tr[1]//td/input").send_keys("Emily")
driver.find_element(By.XPATH,"//table//tr[2]//td/input").send_keys("xyz")
driver.find_element(By.XPATH,"//table//tr[3]//td/input").send_keys("salem")
driver.find_element(By.XPATH,"//table//tr[4]//td/input").send_keys("kerala")
driver.find_element(By.XPATH,"//table//tr[5]//td/input").send_keys(123456)
driver.find_element(By.XPATH,"//table//tr[6]//td/input").send_keys(9087654321)
driver.find_element(By.XPATH,"//table//tr[8]//td/input").send_keys(123456789)
driver.find_element(By.XPATH,"//table//tr[9]//td/input").send_keys(1234)
driver.find_element(By.XPATH,"//table//tr[11]//td/input").send_keys(12)

driver.find_element(By.XPATH,"//input[@type='button']").click()

assert driver.find_element(By.XPATH,"//h1[text()='Bill Payment Complete']").is_displayed()