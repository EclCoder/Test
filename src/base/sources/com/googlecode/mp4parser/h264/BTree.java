package com.googlecode.mp4parser.h264;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class BTree {
    private BTree one;
    private Object value;
    private BTree zero;

    public void addString(String str, Object obj) {
        BTree bTree;
        if (str.length() == 0) {
            this.value = obj;
            return;
        }
        if (str.charAt(0) == '0') {
            if (this.zero == null) {
                this.zero = new BTree();
            }
            bTree = this.zero;
        } else {
            if (this.one == null) {
                this.one = new BTree();
            }
            bTree = this.one;
        }
        bTree.addString(str.substring(1), obj);
    }

    public BTree down(int i10) {
        return i10 == 0 ? this.zero : this.one;
    }

    public Object getValue() {
        return this.value;
    }
}
