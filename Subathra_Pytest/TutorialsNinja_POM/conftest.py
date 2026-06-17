import pytest
import selenium
import selenium.webdriver
from selenium.webdriver.support.wait import WebDriverWait
from Utilities.config_reader import get_data

@pytest.fixture()
def setup_and_tearDown(request):
    
    browser = get_data("basic_info","browser")
    url = get_data("basic_info","url")
    
    if browser == "Chrome":
        driver = selenium.webdriver.Chrome()
    driver.maximize_window()
    driver.get(url);
    request.cls.driver = driver
    
    yield
    
    driver.quit()