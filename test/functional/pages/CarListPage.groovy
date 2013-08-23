package pages

/**
 * Created with IntelliJ IDEA.
 * User: jlev
 * Date: 8/22/13
 * Time: 10:12 PM
 * To change this template use File | Settings | File Templates.
 */
import geb.Page

class CarListPage extends Page {
    static url = "car/list"

    static at = { title == "Car List" }

    static content = {
        createCarButton { ${"a.create"} }
    }
}
