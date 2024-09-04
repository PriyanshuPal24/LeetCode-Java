class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int dir[][]={{0,1},{1,0},{0,-1},{-1,0}};
        int curPos[]={0,0};
        int currDir=0;
        int res=0;
        HashMap<Integer,HashSet<Integer>>map=new HashMap<>();
        for(int[] obstacle:obstacles){
            if(!map.containsKey(obstacle[0])){
                map.put(obstacle[0],new HashSet<>());
            }
            map.get(obstacle[0]).add(obstacle[1]);
        }
        for(int command:commands){
            if(command==-1){
                currDir=(currDir+1)%4;
                continue;
            }
            if(command==-2){
                currDir=currDir-1;
                if(currDir==-1){
                    currDir=3;
                }
                continue;
            }
            int[] direction=dir[currDir];
            for(int step=0;step<command;step++){
                int nextX=curPos[0]+direction[0];
                int nextY=curPos[1]+direction[1];
                if(map.containsKey(nextX) && map.get(nextX).contains(nextY)){
                    break;
                }
                curPos[0]=nextX;
                curPos[1]=nextY;
            }
            res=Math.max(res,(curPos[0]*curPos[0]+curPos[1]*curPos[1]));
        }
        return res;
    }
}
