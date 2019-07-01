import java.util.Comparator;

public class comparatorG implements Comparator<object>{
	@Override
	public int compare(object o1, object o2) {
		// TODO Auto-generated method stub
		if( o1.objectGetQ() < o2.objectGetQ()){
			return 1;
		}else{
			if(o1.objectGetQ() > o2.objectGetQ()){
				return -1;
			}else{
				return 0;
			}
		}
	}
}