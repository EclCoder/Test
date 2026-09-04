package com.googlecode.mp4parser.authoring.tracks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CleanInputStream extends FilterInputStream {
    int prev;
    int prevprev;

    public CleanInputStream(InputStream inputStream) {
        super(inputStream);
        this.prevprev = -1;
        this.prev = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = super.read();
        if (i10 == 3 && this.prevprev == 0 && this.prev == 0) {
            this.prevprev = -1;
            this.prev = -1;
            i10 = super.read();
        }
        this.prevprev = this.prev;
        this.prev = i10;
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        int i12 = read();
        if (i12 == -1) {
            return -1;
        }
        bArr[i10] = (byte) i12;
        int i13 = 1;
        while (i13 < i11) {
            try {
                int i14 = read();
                if (i14 == -1) {
                    break;
                }
                bArr[i10 + i13] = (byte) i14;
                i13++;
            } catch (IOException unused) {
            }
        }
        return i13;
    }
}
