var FifthProduct = /** @class */ (function () {
    function FifthProduct(pid, pname, pprice) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.GST = 2.5;
        this.proId = pid;
        this.proName = pname;
        this.proPrice = pprice;
    }
    FifthProduct.prototype.totalPrice = function () {
        this.totPrice = this.proPrice + ((this.proPrice * 2.5) / 100);
        return this.totPrice;
    };
    FifthProduct.prototype.display = function () {
        console.log(this.proId + " " + this.proName + " " + this.totalPrice());
    };
    return FifthProduct;
}());
var p1 = new FifthProduct(1, 'laptop', 50000);
var p2 = new FifthProduct(2, 'ipad', 100000);
p1.display();
p2.display();
