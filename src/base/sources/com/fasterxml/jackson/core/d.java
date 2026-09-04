package com.fasterxml.jackson.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f16164f = new d(null, -1, -1, -1, -1);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final long f16165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final long f16166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f16167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f16168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object f16169e;

    public d(Object obj, long j10, int i10, int i11) {
        this(obj, -1L, j10, i10, i11);
    }

    private int a(StringBuilder sb2, String str) {
        sb2.append('\"');
        sb2.append(str);
        sb2.append('\"');
        return str.length();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    protected StringBuilder b(StringBuilder sb2) {
        int length;
        int iA;
        Object obj = this.f16169e;
        if (obj == null) {
            sb2.append("UNKNOWN");
            return sb2;
        }
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (obj instanceof byte[]) {
            name = "byte[]";
        } else if (obj instanceof char[]) {
            name = "char[]";
        }
        sb2.append('(');
        sb2.append(name);
        sb2.append(')');
        int length2 = 0;
        String str = " chars";
        if (!(obj instanceof CharSequence)) {
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                length = cArr.length;
                iA = a(sb2, new String(cArr, 0, Math.min(length, 500)));
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int iMin = Math.min(bArr.length, 500);
                a(sb2, new String(bArr, 0, iMin, Charset.forName(C.UTF8_NAME)));
                length2 = bArr.length - iMin;
                str = " bytes";
            }
            if (length2 > 0) {
                sb2.append("[truncated ");
                sb2.append(length2);
                sb2.append(str);
                sb2.append(']');
            }
            return sb2;
        }
        CharSequence charSequence = (CharSequence) obj;
        length = charSequence.length();
        iA = a(sb2, charSequence.subSequence(0, Math.min(length, 500)).toString());
        length2 = length - iA;
        if (length2 > 0) {
            sb2.append("[truncated ");
            sb2.append(length2);
            sb2.append(str);
            sb2.append(']');
        }
        return sb2;
    }

    public long d() {
        return this.f16165a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        Object obj2 = this.f16169e;
        if (obj2 == null) {
            if (dVar.f16169e != null) {
                return false;
            }
        } else if (!obj2.equals(dVar.f16169e)) {
            return false;
        }
        return this.f16167c == dVar.f16167c && this.f16168d == dVar.f16168d && this.f16166b == dVar.f16166b && d() == dVar.d();
    }

    public int hashCode() {
        Object obj = this.f16169e;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this.f16167c) + this.f16168d) ^ ((int) this.f16166b)) + ((int) this.f16165a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append("[Source: ");
        b(sb2);
        sb2.append("; line: ");
        sb2.append(this.f16167c);
        sb2.append(", column: ");
        sb2.append(this.f16168d);
        sb2.append(']');
        return sb2.toString();
    }

    public d(Object obj, long j10, long j11, int i10, int i11) {
        this.f16169e = obj;
        this.f16165a = j10;
        this.f16166b = j11;
        this.f16167c = i10;
        this.f16168d = i11;
    }
}
