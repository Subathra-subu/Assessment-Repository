import pytest
from Pages.RegistrationPage import RegisterPage
from selenium.webdriver.common.by import By


class RegisterAction:
    
    def __init__(self,driver):
        self.driver=driver
        
    def register(self):
        
        self.driver.find_element(By.XPATH,RegisterPage.drop_down).click()
        self.driver.find_element(By.XPATH,RegisterPage.register_link).click()
        self.driver.find_element(By.XPATH,RegisterPage.first_name).send_keys("Rani")
        self.driver.find_element(By.XPATH,RegisterPage.last_name).send_keys("Davis")
        self.driver.find_element(By.XPATH,RegisterPage.email).send_keys("rani@yahoo.com")
        self.driver.find_element(By.XPATH,RegisterPage.mobile).send_keys(9876543210)
        self.driver.find_element(By.XPATH,RegisterPage.password).send_keys(12345)
        self.driver.find_element(By.XPATH,RegisterPage.confirm_password).send_keys(12345)
        self.driver.find_element(By.XPATH,RegisterPage.policy).click()
        self.driver.find_element(By.XPATH,RegisterPage.continue_button).click()
        
        return self.driver.find_element(By.XPATH,RegisterPage.success_message).is_displayed()
        
        
        
        
        
        
        
        