package androidx.room;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4.c.InterfaceC0762c f7082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h.d f7085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f7086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h.c f7088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f7089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f7090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f7091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f7094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f7095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f7096o;

    public a(Context context, String str, p4.c.InterfaceC0762c interfaceC0762c, h.d dVar, List list, boolean z10, h.c cVar, Executor executor, Executor executor2, boolean z11, boolean z12, boolean z13, Set set, String str2, File file) {
        this.f7082a = interfaceC0762c;
        this.f7083b = context;
        this.f7084c = str;
        this.f7085d = dVar;
        this.f7086e = list;
        this.f7087f = z10;
        this.f7088g = cVar;
        this.f7089h = executor;
        this.f7090i = executor2;
        this.f7091j = z11;
        this.f7092k = z12;
        this.f7093l = z13;
        this.f7094m = set;
        this.f7095n = str2;
        this.f7096o = file;
    }

    public boolean a(int i10, int i11) {
        Set set;
        return (i10 <= i11 || !this.f7093l) && this.f7092k && ((set = this.f7094m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
