class FifthProduct{
    proId:number;
    proName:string;
    proPrice:number;
    GST:number=2.5;
    totPrice:number;
    constructor(public pid:number,public pname:string,public pprice:number){
      this.proId=pid;
          this.proName=pname;
          this.proPrice=pprice;
    }
  
    totalPrice():number{
      this.totPrice=this.proPrice+((this.proPrice*2.5)/100);
          return this.totPrice;
    }
  
    display(){
        console.log(this.proId+" "+this.proName+" "+this.totalPrice());
    }
        
  }
  
  var p1=new FifthProduct(1,'laptop',50000);
  var p2=new FifthProduct(2,'ipad',100000);
  p1.display();
  p2.display();