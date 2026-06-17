from configparser import ConfigParser

def get_data(category,key):
    config = ConfigParser()
    config.read("Configurations/Config.ini")
    return config.get(category,key)