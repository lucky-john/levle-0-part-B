int x=0;
int speed =69;
void setup(){
 size(500,500);
  
  
}
void draw(){
  background(0,0,255);
  fill(255,0,0);
  ellipse(x,250,50,50);
  x+=speed;
  if(x>499)
{
speed=-speed;
}
if(x<0)
{
speed=-speed;
}
}

