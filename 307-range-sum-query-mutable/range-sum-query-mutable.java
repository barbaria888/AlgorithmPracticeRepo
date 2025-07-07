

class segmentTree{
    int seg[];
    int n;
    public segmentTree(int arr[]){
        n=arr.length;
        seg=new int[4*n];
        build(arr,0,0,n-1);
    }

    private void build(int arr[],int i,int l,int r){
        if(l==r){
            seg[i]=arr[l];
            return;
        }
        int mid=(l+r)/2;
        build(arr,2*i+1,l,mid);
        build(arr,2*i+2,mid+1,r);
        seg[i]=seg[2*i+1]+seg[2*i+2];
    }
    public void update(int pos,int val,int i,int l,int r){
        if(l==r){
            seg[i]=val;
            return;
        }
        int mid=(l+r)/2;
        if(pos<=mid){
            update(pos,val,2*i+1,l,mid);
        }
        else {
            update (pos,val,2*i+2,mid+1,r);
        }
        seg[i]=seg[2*i+1]+seg[2*i+2];
    }
    public int query(int i,int l,int r,int ql,int qr){
        if(qr<l || ql>r){
            return 0;
        }
        if(ql<=l && r<=qr)return seg[i];
        int mid= (l+r)/2;
        return query(2*i+1,l,mid,ql,qr)+query(2*i+2,mid+1,r,ql,qr);

    }
    
}

class NumArray {
     segmentTree st;
     int n;
    public NumArray(int[] nums) {
        st=new segmentTree(nums);
        n=nums.length;
    }
    
    public void update(int index, int val) {
        st.update(index,val,0,0,n-1);
    }
    
    public int sumRange(int left, int right) {
        return st.query(0,0,n-1,left,right);
    }
}