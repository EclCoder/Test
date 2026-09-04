package com.bytedance.sdk.component.hn.hnj.hn;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class dse extends gjv {
    final transient int[] aq;
    final transient byte[][] dse;

    dse(hnj hnjVar, int i10) {
        super(null);
        ojm.hnj(hnjVar.f12868hn, 0L, i10);
        sk skVar = hnjVar.hnj;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = skVar.qor;
            int i15 = skVar.f12869hn;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            skVar = skVar.dkl;
        }
        this.dse = new byte[i13][];
        this.aq = new int[i13 * 2];
        sk skVar2 = hnjVar.hnj;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.dse;
            bArr[i16] = skVar2.hnj;
            int i17 = skVar2.qor;
            int i18 = skVar2.f12869hn;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.aq;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            skVar2.gjv = true;
            i16++;
            skVar2 = skVar2.dkl;
        }
    }

    private gjv sk() {
        return new gjv(gjv());
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn.gjv
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gjv) {
            gjv gjvVar = (gjv) obj;
            if (gjvVar.qor() == qor() && hnj(0, gjvVar, 0, qor())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn.gjv
    public byte[] gjv() {
        int[] iArr = this.aq;
        byte[][] bArr = this.dse;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.aq;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.dse[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn.gjv
    public int hashCode() {
        int i10 = this.f12867sk;
        if (i10 != 0) {
            return i10;
        }
        int length = this.dse.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.dse[i11];
            int[] iArr = this.aq;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f12867sk = i12;
        return i12;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn.gjv
    public String hn() {
        return sk().hn();
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn.gjv
    public String hnj() {
        return sk().hnj();
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn.gjv
    public int qor() {
        return this.aq[this.dse.length - 1];
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn.gjv
    public String toString() {
        return sk().toString();
    }

    private int hn(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.aq, 0, this.dse.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn.gjv
    public gjv hnj(int i10, int i11) {
        return sk().hnj(i10, i11);
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn.gjv
    public byte hnj(int i10) {
        ojm.hnj(this.aq[this.dse.length - 1], i10, 1L);
        int iHn = hn(i10);
        int i11 = iHn == 0 ? 0 : this.aq[iHn - 1];
        int[] iArr = this.aq;
        byte[][] bArr = this.dse;
        return bArr[iHn][(i10 - i11) + iArr[bArr.length + iHn]];
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn.gjv
    public boolean hnj(int i10, gjv gjvVar, int i11, int i12) {
        if (i10 < 0 || i10 > qor() - i12) {
            return false;
        }
        int iHn = hn(i10);
        while (i12 > 0) {
            int i13 = iHn == 0 ? 0 : this.aq[iHn - 1];
            int iMin = Math.min(i12, ((this.aq[iHn] - i13) + i13) - i10);
            int[] iArr = this.aq;
            byte[][] bArr = this.dse;
            if (!gjvVar.hnj(i11, bArr[iHn], (i10 - i13) + iArr[bArr.length + iHn], iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iHn++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.hn.gjv
    public boolean hnj(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > qor() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iHn = hn(i10);
        while (i12 > 0) {
            int i13 = iHn == 0 ? 0 : this.aq[iHn - 1];
            int iMin = Math.min(i12, ((this.aq[iHn] - i13) + i13) - i10);
            int[] iArr = this.aq;
            byte[][] bArr2 = this.dse;
            if (!ojm.hnj(bArr2[iHn], (i10 - i13) + iArr[bArr2.length + iHn], bArr, i11, iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iHn++;
        }
        return true;
    }
}
