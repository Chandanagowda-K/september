class SixthTshirt{
    color:string;
    material:string;
    design:string;
    size:string;
    constructor(c:string,m:string,d:string,s:string){
      this.color=c;
          this.material=m;
          this.design=d;
          this.size=s;
    }
  
    display(){
        console.log(this.color+" "+this.material+" "+this.design+" "+this.size);
    }
        
  }
  
  var t1=new SixthTshirt('red','cotton','striped','small');
  var t2=new SixthTshirt('green','silk','plain','large');
  var t3=new SixthTshirt('yellow','cotton','checks','xtra-large');
  t1.display();
  t2.display();
  t3.display();