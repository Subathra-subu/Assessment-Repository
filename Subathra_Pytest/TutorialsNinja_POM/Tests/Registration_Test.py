import pytest

from Actions.RegistrationAction import RegisterAction


@pytest.mark.usefixtures("setup_and_tearDown")
class Test_Register:
    
    def test_Register(self):
        registeraction = RegisterAction(self.driver)
        assert registeraction.register() == True