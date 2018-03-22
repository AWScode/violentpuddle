public class MergeSort{
  ArrayList<String> words;

  public MergeSort{
    ArrayList<String> words = new ArrayList<String>();
    public ArrayList<String> getList(){
      return words;
    }
  public ArrayList<String> merge(ArrayList<String> Sorted1, ArrayList<String> Sorted1) {
    //combine the two
    int index1 =0;
    int index2 =0;
    ArrayList<String> finalList = new ArrayList<String>();
    for(int i =0; i<sorted1.size() + sorted2.size(); i++){
      if (sorted1.get(index1) <= sorted2.get(index2)){
        finalList.add(sorted1.get(index1));
        index1++;
      }
      else{
          finalList.add(sorted2.get(index2));
          index2++
        }
      }
    return finalList;

  }
  public ArrayList<String> wLengthMergeSort(ArrayList<String> myList){
      if(myList.size() <= 1){
        return myList;
      }
      else {
        ArrayList<String> list1= //first half of list
        ArrayList<String> list2 = //second half of list

        ArrayList<String> sorted1= wLengthMergeSort(list1);
        ArrayList<String> sorted2 = wLengthMergeSort(list2);
        ArrayList<String> sortedFinal = merge(sorted1,sorted2);
        return sortedFinal;
      }

      int max = 0;
      int count = 0;
      for int i= 0; i < words.size(); i++){
        count ++;
        words[i]= count;
        if (words[i] > max){
        max == words[i];
        }
        return max;
      }
  }
  }
}
