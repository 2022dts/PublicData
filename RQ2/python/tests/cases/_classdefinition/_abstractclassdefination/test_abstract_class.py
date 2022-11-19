class A(ABC):
    ...


class B:
    class Inner:
        def __init__(self):
            if self.__class__.__name__ == "inner":
                raise NotImplementedError("You can't instantiate this abstract class. Derive it, please.")

        def __new__(self):
            if self.__class__.__name__ == "inner":
                raise NotImplementedError("You can't instantiate this abstract class. Derive it, please.")

        def func1(self):
            raise NotImplementedError("You can't instantiate this abstract class. Derive it, please.")

        def func2(self):
            a = 1
            raise NotImplementedError("You can't instantiate this abstract class. Derive it, please.")

    @abstractmethod
    def func3(self):
        ...