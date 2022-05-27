import re


class Funciones:

    def __init__(self, x, y):
        self.x = x
        self.y = y

class Rectangulo(Funciones):
    def area(self):
        return self.x * self.y
