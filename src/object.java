import java.util.Comparator;

class object implements Comparable<object> {
	int r;	//dostepnosc
	int p;	//czas trwania
	int q;	//czas dostarczenia
	
	public object(){
		r=0;
		p=0;
		q=0;
	}
	
	public object(int r1,int p1,int q1){
		r=r1;
		p=p1;
		q=q1;
	}
	
	public void objectSetR(int r1){
		this.r=r1;
	}
	
	public void objectSetP(int p1){
		this.p=p1;
	}
	public void objectSetQ(int q1){
		this.q=q1;
	}
	
	public void objectShow(){
		System.out.println(r + "\t" + p + "\t" + q);
	}
	
	public int objectGetR(){
		return this.r;
	}
	public int objectGetP(){
		return this.p;
	}
	public int objectGetQ(){
		return this.q;
	}
	
	@Override
	public int compareTo(object o){
		int comp = o.p - this.p;
			return comp;
	}	
}

