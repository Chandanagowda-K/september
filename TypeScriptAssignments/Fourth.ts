class Student{
    stdId:number;
    stdName:string;
    stdClass:string;
    constructor(public sid:number,public sname:string,public sclass:string){
      this.stdId=sid;
      this.stdName=sname;
      this.stdClass=sclass;	
    }
    display(){
      console.log(this.stdId+" "+this.stdName+" "+this.stdClass);
    }
  }
  
  var student1=new Student(1,'RAM','Engineering');
  var student2=new Student(2,'SITA','MBBS');
  
  student1.display();
  student2.display();