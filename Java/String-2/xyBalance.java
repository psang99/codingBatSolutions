public boolean xyBalance(String str) { int x=0,y=0; x=str.lastIndexOf('x'); y=str.lastIndexOf('y');  if(str.length()==0||(y<0&&x<0))//str.equals("y") return true;  /*if(y<0&&x<0)  return true;;*/ if(y>x) return true; return false;}