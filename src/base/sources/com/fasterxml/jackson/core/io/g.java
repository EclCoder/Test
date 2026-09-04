package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.j;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g implements j, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f16261d = c.d();
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f16262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected byte[] f16263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected transient String f16264c;

    public g(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f16262a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f16264c = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.f16262a);
    }

    @Override // com.fasterxml.jackson.core.j
    public int a(char[] cArr, int i10) {
        String str = this.f16262a;
        int length = str.length();
        if (i10 + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i10);
        return length;
    }

    @Override // com.fasterxml.jackson.core.j
    public int b(byte[] bArr, int i10) {
        byte[] bArrC = this.f16263b;
        if (bArrC == null) {
            bArrC = f16261d.c(this.f16262a);
            this.f16263b = bArrC;
        }
        int length = bArrC.length;
        if (i10 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrC, 0, bArr, i10, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.j
    public final byte[] d() {
        byte[] bArr = this.f16263b;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrC = f16261d.c(this.f16262a);
        this.f16263b = bArrC;
        return bArrC;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f16262a.equals(((g) obj).f16262a);
    }

    @Override // com.fasterxml.jackson.core.j
    public final String getValue() {
        return this.f16262a;
    }

    public final int hashCode() {
        return this.f16262a.hashCode();
    }

    protected Object readResolve() {
        return new g(this.f16264c);
    }

    public final String toString() {
        return this.f16262a;
    }
}
