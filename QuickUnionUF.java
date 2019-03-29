public class QuickUnionUF
{
	private int[] id;
	private int[] sz;

	private int count;
	private int time;
	public QuickUnionUF(int n)
	{
		id= new int[n];
		sz=new int[n];
		count=n;
		time=0;
		for(int i=0;i<n;i++)
		{
			id[i]=i;
			sz[i]=1;
		}
	}
	public int time()
	{
		return time;
		}
	public int count(){
		return count;	}	
		
	public int root(int p)
	{
		while(id[p]!=p)
		{
			id[p]=id[id[p]];
			p=id[p];
		}
		return p;
	}
	
	public boolean connected(int p, int q)
	{
		return root(p)==root(q);
	}
	
	public void union(int p,int q)
	{
		if(!connected(p,q))
		{
			int x= root(p);
			int y= root(q);
			if(sz[x]<sz[y])
			{
				id[x]=y;
				sz[y]+=sz[x];
			}
			else{
				id[y]=x;
				sz[x]=sz[x]+sz[y];}
			count--;
		}
		time++;
	}
	public static void main(String[] args)
	{
		int n=StdIn.readInt();
		QuickUnionUF uf= new QuickUnionUF(n);
		int m=StdIn.readInt();
		while(uf.count!=1)
		{
			int p =StdIn.readInt();
			int q= StdIn.readInt();
			uf.union(p,q);
		} 
		System.out.println(uf.time);
	}
		
}
6 
8
1 2
2 4
5 0
0 3
1 4
0 1
2 5
1 5
2 4
3 5




