package pl.droidsonroids.gif;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class GifIOException extends IOException {
    private static final long serialVersionUID = 13038402904505L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f50163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50164b;

    GifIOException(int i10, String str) {
        this.f50163a = c.e(i10);
        this.f50164b = str;
    }

    static GifIOException a(int i10) {
        if (i10 == c.NO_ERROR.f50229b) {
            return null;
        }
        return new GifIOException(i10, null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f50164b == null) {
            return this.f50163a.g();
        }
        return this.f50163a.g() + ": " + this.f50164b;
    }
}
