package Easy;
class Problem1603 {
    int last ,middle,first;
    public void ParkingSystem(int last, int middle, int first) {
        this.last=last;
        this.middle=middle;
        this.first=first;
    }
    public boolean addCar(int carType) {
        if(last>=1 && carType==1){
            last--;
            return true;
        }
        if(middle>=1 && carType==2){
            middle--;
            return true;
        }
        if(first>=1 && carType==3){
            first--;
            return true;
        }
        return false;
    }
}