package com.googlecode.mp4parser.h264;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CharCache {
    private char[] cache;
    private int pos;

    public CharCache(int i10) {
        this.cache = new char[i10];
    }

    public void append(String str) {
        char[] charArray = str.toCharArray();
        char[] cArr = this.cache;
        int length = cArr.length;
        int i10 = this.pos;
        int length2 = length - i10;
        if (charArray.length < length2) {
            length2 = charArray.length;
        }
        System.arraycopy(charArray, 0, cArr, i10, length2);
        this.pos += length2;
    }

    public void clear() {
        this.pos = 0;
    }

    public int length() {
        return this.pos;
    }

    public String toString() {
        return new String(this.cache, 0, this.pos);
    }

    public void append(char c10) {
        int i10 = this.pos;
        char[] cArr = this.cache;
        if (i10 < cArr.length - 1) {
            cArr[i10] = c10;
            this.pos = i10 + 1;
        }
    }
}
