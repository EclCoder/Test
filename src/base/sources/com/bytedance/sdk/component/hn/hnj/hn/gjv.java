package com.bytedance.sdk.component.hn.hnj.hn;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv implements Serializable, Comparable<gjv> {
    transient String dkl;
    final byte[] gjv;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    transient int f12867sk;
    static final char[] hnj = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static final Charset f12866hn = Charset.forName(C.UTF8_NAME);
    public static final gjv qor = hnj(new byte[0]);

    gjv(byte[] bArr) {
        this.gjv = bArr;
    }

    public static gjv hnj(byte... bArr) {
        if (bArr != null) {
            return new gjv((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gjv) {
            gjv gjvVar = (gjv) obj;
            int iQor = gjvVar.qor();
            byte[] bArr = this.gjv;
            if (iQor == bArr.length && gjvVar.hnj(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte[] gjv() {
        return (byte[]) this.gjv.clone();
    }

    public int hashCode() {
        int i10 = this.f12867sk;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.gjv);
        this.f12867sk = iHashCode;
        return iHashCode;
    }

    public String hn() {
        byte[] bArr = this.gjv;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = hnj;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public int qor() {
        return this.gjv.length;
    }

    public String toString() {
        if (this.gjv.length == 0) {
            return "[size=0]";
        }
        String strHnj = hnj();
        int iHnj = hnj(strHnj, 64);
        if (iHnj == -1) {
            if (this.gjv.length <= 64) {
                return "[hex=" + hn() + "]";
            }
            return "[size=" + this.gjv.length + " hex=" + hnj(0, 64).hn() + "…]";
        }
        String strReplace = strHnj.substring(0, iHnj).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (iHnj >= strHnj.length()) {
            return "[text=" + strReplace + "]";
        }
        return "[size=" + this.gjv.length + " text=" + strReplace + "…]";
    }

    public String hnj() {
        String str = this.dkl;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.gjv, f12866hn);
        this.dkl = str2;
        return str2;
    }

    public gjv hnj(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.gjv;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.gjv.length + ")");
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new gjv(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte hnj(int i10) {
        return this.gjv[i10];
    }

    public boolean hnj(int i10, gjv gjvVar, int i11, int i12) {
        return gjvVar.hnj(i11, this.gjv, i10, i12);
    }

    public boolean hnj(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.gjv;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && ojm.hnj(bArr2, i10, bArr, i11, i12);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public int compareTo(gjv gjvVar) {
        int iQor = qor();
        int iQor2 = gjvVar.qor();
        int iMin = Math.min(iQor, iQor2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iHnj = hnj(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int iHnj2 = gjvVar.hnj(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iHnj != iHnj2) {
                return iHnj < iHnj2 ? -1 : 1;
            }
        }
        if (iQor == iQor2) {
            return 0;
        }
        return iQor < iQor2 ? -1 : 1;
    }

    static int hnj(String str, int i10) {
        int length = str.length();
        int iCharCount = 0;
        int i11 = 0;
        while (iCharCount < length) {
            if (i11 == i10) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i11++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
