package gebspockexample

class Car {
    Integer year
    String make
    String model
    String color

    static constraints = {
        year(matches: '\\d{4}')
    }
}
