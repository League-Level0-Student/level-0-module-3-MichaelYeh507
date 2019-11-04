void setup(){
 size(500,500);
 background(234,246,255);
}  

void draw(){
  for(int i=width;i>0;i-=200){
    fill(#E80505);
    ellipse(width/2,height/2,i,i);
    fill(234,246,255);
    ellipse(width/2,height/2,i-100,i-100);
    
  }  
}
