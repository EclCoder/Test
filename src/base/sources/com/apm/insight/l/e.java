package com.apm.insight.l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e extends PrintWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MessageDigest f10842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Charset f10843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f10844c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f10843b = null;
        this.f10842a = messageDigest;
        this.f10844c = aVar;
        if (messageDigest != null) {
            this.f10843b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        super.write(cArr, i10, i11);
        MessageDigest messageDigest = this.f10842a;
        if (messageDigest != null) {
            messageDigest.update(this.f10843b.encode(CharBuffer.wrap(cArr)).array());
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i10) {
        super.write(i10);
        MessageDigest messageDigest = this.f10842a;
        if (messageDigest != null) {
            messageDigest.update((byte) i10);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(String str, int i10, int i11) {
        super.write(str, i10, i11);
        if (this.f10842a != null) {
            a aVar = this.f10844c;
            if (aVar == null || aVar.a(str)) {
                this.f10842a.update(this.f10843b.encode(CharBuffer.wrap(str, i10, i11 + i10)).array());
            }
        }
    }
}
