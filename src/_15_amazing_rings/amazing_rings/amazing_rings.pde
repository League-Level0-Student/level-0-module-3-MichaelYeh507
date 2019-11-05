void setup() {
 size(500,500);
 background(234,246,255);

}
int rightRingX = 300;
int leftRingX = 200;
int rightSpeed = 5;
int leftSpeed = -5;
void draw() {
  background(234,246,255);
  for(int i=400;i>0;i-=10){
    noFill();
    ellipse(leftRingX, 250, i, i);
    ellipse(leftRingX, 250, i-10, i-10);
    
  }
    leftRingX += leftSpeed;
    if (leftRingX > 500) {
       leftSpeed = -leftSpeed;
    } else if (leftRingX < 0) {
       leftSpeed = -leftSpeed;
    }
    
    for(int i=400;i>0;i-=10){
    noFill();
    ellipse(rightRingX, 250, i, i);
    ellipse(rightRingX, 250, i-10, i-10);
  }
    rightRingX += rightSpeed;
    if (rightRingX > 500) {
       rightSpeed = -rightSpeed;
    } else if (rightRingX < 0) {
       rightSpeed = -rightSpeed;
    }
}
