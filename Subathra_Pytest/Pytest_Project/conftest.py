import pytest
import selenium
import selenium.webdriver
from selenium.webdriver.support.wait import WebDriverWait

@pytest.fixture()
def setup_and_tearDown(request):
    
    driver = selenium.webdriver.Chrome()
    driver.maximize_window()
    driver.get("https://practice.automationtesting.in/shop/");
    request.cls.driver = driver
    yield
    
    driver.quit()
    