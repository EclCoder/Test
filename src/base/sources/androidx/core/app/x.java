package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f3325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence[] f3326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f3327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f3329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f3330g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        public static RemoteInput a(x xVar) {
            Set setD;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(xVar.i()).setLabel(xVar.h()).setChoices(xVar.e()).setAllowFreeFormInput(xVar.c()).addExtras(xVar.g());
            if (Build.VERSION.SDK_INT >= 26 && (setD = xVar.d()) != null) {
                Iterator it = setD.iterator();
                while (it.hasNext()) {
                    b.a(builderAddExtras, (String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(builderAddExtras, xVar.f());
            }
            return builderAddExtras.build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {
        static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    x(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set set) {
        this.f3324a = str;
        this.f3325b = charSequence;
        this.f3326c = charSequenceArr;
        this.f3327d = z10;
        this.f3328e = i10;
        this.f3329f = bundle;
        this.f3330g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput a(x xVar) {
        return a.a(xVar);
    }

    static RemoteInput[] b(x[] xVarArr) {
        if (xVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[xVarArr.length];
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            remoteInputArr[i10] = a(xVarArr[i10]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.f3327d;
    }

    public Set d() {
        return this.f3330g;
    }

    public CharSequence[] e() {
        return this.f3326c;
    }

    public int f() {
        return this.f3328e;
    }

    public Bundle g() {
        return this.f3329f;
    }

    public CharSequence h() {
        return this.f3325b;
    }

    public String i() {
        return this.f3324a;
    }
}
