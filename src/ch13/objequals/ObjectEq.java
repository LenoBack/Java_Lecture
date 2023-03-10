package ch13.objequals;

class ObjectEq {
    private int val;
    public ObjectEq(int val){
        this.val = val;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof ObjectEq) {
            return this.val == ((ObjectEq)obj).val;
        }
        return false;
    }
}