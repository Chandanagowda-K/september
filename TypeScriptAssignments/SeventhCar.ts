export class SeventhCar{
	speed:number;
	regularPrice:number;
	color:string;
   
	constructor(s:number,rp:number,c:string){
		this.speed=s;
		this.regularPrice=rp;
		this.color=c;
        
	}
	getSalePrice():number{
        	return 0; 
	}
	display():void{
		console.log("initial speed:"+this.speed);
		console.log("color:"+this.color);
		console.log("initial price:"+this.regularPrice);
	}
}
//var Car=new SeventhCar(100,500000,'red');
//Car.display();
