package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18731a;

    public DataSourceException(int i10) {
        this.f18731a = i10;
    }

    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f18731a == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(Throwable th2, int i10) {
        super(th2);
        this.f18731a = i10;
    }

    public DataSourceException(String str, int i10) {
        super(str);
        this.f18731a = i10;
    }

    public DataSourceException(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f18731a = i10;
    }
}
