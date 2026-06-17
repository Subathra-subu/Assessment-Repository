from selenium.webdriver import ActionChains
import pytest
from selenium.webdriver.common.by import By

@pytest.mark.usefixtures("setup_and_tearDown")
class Testcases:
    
    @pytest.mark.smoke 
    def test_case01(self):
        action = ActionChains(self.driver)
        HTML5_forms = self.driver.find_element(By.XPATH,"//h3[text()='HTML5 Forms']");
        action.move_to_element(HTML5_forms).perform()
        price = self.driver.find_element(By.XPATH,"//h3[text()='HTML5 Forms']/parent::a/child::span");
        assert price.text=='₹280.00'
        print("The price of the “HTML5 Forms” book is displayed as",price.text)
    
    @pytest.mark.smoke
    def test_case02(self):
        JS_book = self.driver.find_element(By.XPATH,"//h3[text()='JS Data Structures and Algorithm']")
        JS_book.click()
        assert self.driver.title == "JS Data Structures and Algorithm – Automation Practice Site"
        
    @pytest.mark.regression  
    def test_case03(self):
        html_book = self.driver.find_element(By.XPATH,"//a[text()='HTML']");
        html_book.click()
        books = self.driver.find_elements(By.XPATH,"//ul[@class='products masonry-done']/child::*");
        print("The number of books displayed after filtering",len(books))
        assert len(books)==3
        
    @pytest.mark.regression    
    def test_case04(self):
        drop_down = self.driver.find_element(By.XPATH,"//select[@class='orderby']")
        drop_down.click()
        low_to_high = self.driver.find_element(By.XPATH,"//select[@class='orderby']/child::option[5]")
        low_to_high.click()
        price_list = self.driver.find_elements(By.XPATH,"//ul[@class='products masonry-done']/child::*/child::a/child::span/descendant::span[@class='woocommerce-Price-amount amount']")
        for i in range(1,len(price_list)):
            if price_list[i-1].text < price_list[i].text:
                continue
            else: break
        else: print("Sorted in low to high based on the price")
    
    def test_case05(self):
        element = self.driver.find_element(By.XPATH,"//div[@class='footer-widgets clearfix']")
        self.driver.execute_script("arguments[0].scrollIntoView();",element)
        assert self.driver.find_element(By.XPATH,"//div[@class='widget widget_mc4wp_form_widget']").is_displayed()
            
        
        
        
        