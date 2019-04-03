/** 
  OrderedList_inArraySlots
  
  A list with the invariant the elements are in order by
  increasing value, implemented using a
  List_inArraySlots
 */

public class OrderedList_inArraySlots implements OrderedList{

    private List_inArraySlots list_iAS;

    public OrderedList_inArraySlots() {
        list_iAS = new List_inArraySlots();
    }

    /** 
      @return a string representation of this Orderedlist_iAS
     */
    public String toString() {
        return list_iAS.toString();
    }

    
    /** 
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
    public void add( int value) {
         int dest = 0;
         for( ; dest < list_iAS.size() && list_iAS.get( dest) < value
            ; dest++) ;
         // System.out.println( "OL adding " + value
         //                   + " at index " + dest);
         list_iAS.add( dest, value);
     }
     
    public int size() {
        return list_iAS.size();
    }
    
    public int set( int index, int newValue ) {
        int returned = list_iAS.get(index);
        this.remove(index);
        this.add(newValue);
        return returned;
    }
    
    public int get( int index ) {//tried nttsst here but can't figure it out
        return list_iAS.get(index);
    }
    
    public int remove( int index) {
        return list_iAS.remove(index);
     }
}