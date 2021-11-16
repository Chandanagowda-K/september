"use strict";
exports.__esModule = true;
exports.SeventhCar = void 0;
var SeventhCar = /** @class */ (function () {
    function SeventhCar(s, rp, c) {
        this.speed = s;
        this.regularPrice = rp;
        this.color = c;
    }
    SeventhCar.prototype.getSalePrice = function () {
        return 0;
    };
    SeventhCar.prototype.display = function () {
        console.log("initial speed:" + this.speed);
        console.log("color:" + this.color);
        console.log("initial price:" + this.regularPrice);
    };
    return SeventhCar;
}());
exports.SeventhCar = SeventhCar;
var Car = new SeventhCar(100, 500000, 'red');
Car.display();
