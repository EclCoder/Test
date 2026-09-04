package com.inmobi.media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class H5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I5 f24918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f24919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L5 f24921d;

    public H5(L5 l10, I5 i10) {
        this.f24921d = l10;
        this.f24918a = i10;
        this.f24919b = i10.f24984c ? null : new boolean[l10.f25183h];
    }

    public final OutputStream a(int i10) {
        FileOutputStream fileOutputStream;
        G5 g10;
        synchronized (this.f24921d) {
            try {
                I5 i11 = this.f24918a;
                if (i11.f24985d != this) {
                    throw new IllegalStateException();
                }
                if (!i11.f24984c) {
                    this.f24919b[i10] = true;
                }
                File fileB = i11.b(i10);
                try {
                    fileOutputStream = new FileOutputStream(fileB);
                } catch (FileNotFoundException unused) {
                    this.f24921d.f25177b.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileB);
                    } catch (FileNotFoundException unused2) {
                        return L5.f25175q;
                    }
                }
                g10 = new G5(this, fileOutputStream);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g10;
    }
}
