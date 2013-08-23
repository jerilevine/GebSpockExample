package specs

/**
 * Created with IntelliJ IDEA.
 * User: jlev
 * Date: 8/22/13
 * Time: 10:10 PM
 * To change this template use File | Settings | File Templates.
 */

import geb.spock.GebReportingSpec
import grails.plugin.remotecontrol.RemoteControl
import spock.lang.Shared
import pages.CarListPage

class CarFunctionalSpec extends GebReportingSpec {
    def "Test list page"() {
        when: "We go to the car list page"
        to CarListPage

        then: "We arrive at the car list page"
        at CarListPage
    }
}
