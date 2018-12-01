package shipmentsPages

import geb.Module
import geb.Page

class ShipmentListPage extends Page {
    static url=""
    static at ={
        title == "Shipments"
        shipmentListModule
    }
    static content={
        shipmentListModule{module ShipmentListModule}
    }
}

class ShipmentListModule extends Module{
    static at ={
        title =="Shipments"
    }
    static content={

    }
}
